package com.yjdz.zncdz.controller;

import com.yjdz.zncdz.comm.MqttComm;
import com.yjdz.zncdz.dao.EquipmentinfoMapper;
import com.yjdz.zncdz.dao.HostinfoMapper;
import com.yjdz.zncdz.dao.OrderinfoMapper;
import com.yjdz.zncdz.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "instruction")
public class ChargingController {

    @Autowired
    private EquipmentinfoMapper equipmentinfoMapper;
    @Autowired
    private HostinfoMapper hostinfoMapper;
    @Autowired
    private OrderinfoMapper orderinfoMapper;

    @PostMapping(value = "refresh")
    @ResponseBody
    public Map<String, Object> scanCodeCharge(@RequestBody Map<String, String> param) {

        String port = param.get("port");
        String equipmentId = param.get("equipmentId");
        String userId = param.get("userId");
        Map<String, Object> call = new HashMap<>();

        if (port == null || "".equals(port) || equipmentId == null || "".equals(equipmentId)
                || userId == null || "".equals(userId)) {

            call.put("code", "error");
            call.put("message", "参数错误");
            return call;
        }

        EquipmentinfoExample example = new EquipmentinfoExample();
        EquipmentinfoExample.Criteria criteria = example.createCriteria();
        criteria.andEquipidEqualTo(equipmentId);
        List<Equipmentinfo> equipmentinfoList = equipmentinfoMapper.selectByExample(example);
        if (equipmentinfoList.size() > 0) {

            Hostinfo hostinfo = hostinfoMapper.selectByPrimaryKey(equipmentinfoList.get(0).getHostid());
            if (hostinfo != null) {

                //查询用户是否存在未绑定订单
                OrderinfoExample example1 = new OrderinfoExample();
                example1.createCriteria().andStatusEqualTo((byte) 0)
                        .andUseridEqualTo(Integer.valueOf(userId));
                List<Orderinfo> orderinfoList = orderinfoMapper.selectByExample(example1);
                if (orderinfoList.size() > 0) {

                    call.put("code", "error");
                    call.put("data", orderinfoList.get(0));
                    call.put("message", "用户存在未绑定的订单");
                    return call;
                }
                String topic = "area/public/" + hostinfo.getImelid();
                String message = "{01|" + equipmentId + "|" + port + "|}";
                MqttComm.getPublish(topic, message);
                //用户包月信息

                /**
                 *
                 */

                call.put("code", "success");
                call.put("data", equipmentinfoList.get(0));
                call.put("message", "设备指令发送成功");
                return call;
            }
            call.put("code", "error");
            call.put("message", "设备所属主机不存在");
            return call;

        }
        call.put("code", "error");
        call.put("message", "设备不存在");
        return call;
    }


    @PostMapping(value = "scanCodeCharging")
    @ResponseBody
    public Map<String, Object> scanCodeCharging(@RequestBody Map<String, String> param) {

        Map<String, Object> call = new HashMap<>();
        String port = param.get("port");
        String equipmentId = param.get("equipmentId");
        String hour = param.get("hour");
        String userId = param.get("userId");

        if (port == null || "".equals(port) || equipmentId == null || "".equals(equipmentId) || hour == null ||
                "".equals(hour) || userId == null || "".equals(userId)) {

            call.put("code", "error");
            call.put("message", "参数错误");
            return call;
        }

        EquipmentinfoExample example = new EquipmentinfoExample();
        example.createCriteria().andEquipidEqualTo(equipmentId)
                .andPortEqualTo(Byte.valueOf(port));
        List<Equipmentinfo> equipmentinfoList = equipmentinfoMapper.selectByExample(example);

        if (equipmentinfoList.size() > 0) {

            Equipmentinfo equipmentinfo = equipmentinfoList.get(0);
            Date lastLandingTime = equipmentinfo.getLastlandingtime();
            Date date = new Date();
            Long second = date.getTime() - lastLandingTime.getTime();

            //判断设备是否在线
            if (second > 6000000) {

                call.put("code", "error");
                call.put("message", "设备不在线");
                return call;
            }

            //判断端口
            if (equipmentinfo.getPortstatus().equals("04") || equipmentinfo.getPortstatus().equals("02")
                    || equipmentinfo.getPortstatus().equals("00")) {

                Hostinfo hostinfo = hostinfoMapper.selectByPrimaryKey(equipmentinfo.getHostid());

                if (hostinfo != null) {

                    String topic = "area/public/" + hostinfo.getImelid();
                    String message = "";
                    if (port.equals("1")) {
                        message = "{82" + equipmentId + "|" + userId + "|34|00|" + hour + "|" +
                                new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + "|01|}";
                    } else if (port.equals("2")) {
                        message = "{82" + equipmentId + "|" + userId + "|00|34|" + hour + "|" +
                                new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + "|02|}";
                    }
                    MqttComm.getPublish(topic, message);



                    String orderId = new SimpleDateFormat("yyyyMMddHHmmSSsss")
                            .format(new Date())+equipmentId+port;
                    Orderinfo orderinfo = new Orderinfo();
                    orderinfo.setOrderid(orderId);
//            orderinfo.setChargetypename("");
                        orderinfo.setChoices("扫码充电");
//        orderinfo.setChargetypeid();
                    orderinfo.setUserid(Integer.valueOf(userId));
                    orderinfo.setEquipmentid(equipmentId);
                    orderinfo.setPort(Byte.valueOf(port));
                    orderinfo.setStarttime(new Date());
//        orderinfo.setSelectchargingtime();
                    //生成订单
//                    orderinfoMapper.insertSelective();





                    call.put("code", "success");
                    call.put("message", "设备指令发送成功");
                    return call;
                }
                call.put("code", "error");
                call.put("message", "设备所属主机不存在");
                return call;
            }
            call.put("code", "error");
            call.put("message", "插座被占用");
            return call;
        }
        call.put("code", "error");
        call.put("message", "设备不存在");
        return call;

    }

    @PostMapping(value = "searchOrder")
    @ResponseBody
    public Map<String, Object> searchOrder(@RequestBody Map<String, String> param) {

        Map<String, Object> call = new HashMap<>();
        String userId = param.get("userId");
        String equipmentId = param.get("equipmentId");
        String port = param.get("port");

        if (userId == null || "".equals(userId) || equipmentId == null || "".equals(equipmentId)
                || port == null || "".equals(port)) {
            call.put("code", "error");
            call.put("message", "参数错误");
            return call;
        }

        OrderinfoExample example = new OrderinfoExample();
        example.createCriteria().andUseridEqualTo(Integer.valueOf(userId))
                .andStatusEqualTo((byte) 1).andEquipmentidEqualTo(equipmentId)
                .andPortEqualTo(Byte.valueOf(port));
        List<Orderinfo> orderinfoList = orderinfoMapper.selectByExample(example);

        if (orderinfoList.size() == 1) {
            call.put("code", "success");
            call.put("status", "1");
            call.put("message", "设备开始充电");
            return call;
        }

        call.put("code", "error");
        call.put("status", "0");
        call.put("message", "设备未开始充电");
        return call;
    }
}
