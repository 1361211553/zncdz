package com.yjdz.zncdz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "recharge")
public class RechargeInfoController {

    @PostMapping(value = "wxpay")
    @ResponseBody
    public void wxpay(@RequestBody Map<String,String> param){





    }
}
