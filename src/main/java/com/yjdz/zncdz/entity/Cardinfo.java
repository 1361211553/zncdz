package com.yjdz.zncdz.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cardinfo
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Cardinfo implements Serializable {
    /**
     * Database Column Remarks:
     *   主键id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cardinfo.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   账户d(外键)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cardinfo.accountid
     *
     * @mbg.generated
     */
    private Integer accountid;

    /**
     * Database Column Remarks:
     *   卡号id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cardinfo.cardid
     *
     * @mbg.generated
     */
    private String cardid;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cardinfo.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * Database Column Remarks:
     *   使用者姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cardinfo.owner
     *
     * @mbg.generated
     */
    private String owner;

    /**
     * Database Column Remarks:
     *   累计使用次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cardinfo.frequency
     *
     * @mbg.generated
     */
    private Integer frequency;

    /**
     * Database Column Remarks:
     *   最近使用时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cardinfo.lastlandingtime
     *
     * @mbg.generated
     */
    private Date lastlandingtime;

    /**
     * Database Column Remarks:
     *   电卡状态1默认0禁用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cardinfo.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cardinfo
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cardinfo.id
     *
     * @return the value of cardinfo.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cardinfo.id
     *
     * @param id the value for cardinfo.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cardinfo.accountid
     *
     * @return the value of cardinfo.accountid
     *
     * @mbg.generated
     */
    public Integer getAccountid() {
        return accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cardinfo.accountid
     *
     * @param accountid the value for cardinfo.accountid
     *
     * @mbg.generated
     */
    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cardinfo.cardid
     *
     * @return the value of cardinfo.cardid
     *
     * @mbg.generated
     */
    public String getCardid() {
        return cardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cardinfo.cardid
     *
     * @param cardid the value for cardinfo.cardid
     *
     * @mbg.generated
     */
    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cardinfo.createtime
     *
     * @return the value of cardinfo.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cardinfo.createtime
     *
     * @param createtime the value for cardinfo.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cardinfo.owner
     *
     * @return the value of cardinfo.owner
     *
     * @mbg.generated
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cardinfo.owner
     *
     * @param owner the value for cardinfo.owner
     *
     * @mbg.generated
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cardinfo.frequency
     *
     * @return the value of cardinfo.frequency
     *
     * @mbg.generated
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cardinfo.frequency
     *
     * @param frequency the value for cardinfo.frequency
     *
     * @mbg.generated
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cardinfo.lastlandingtime
     *
     * @return the value of cardinfo.lastlandingtime
     *
     * @mbg.generated
     */
    public Date getLastlandingtime() {
        return lastlandingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cardinfo.lastlandingtime
     *
     * @param lastlandingtime the value for cardinfo.lastlandingtime
     *
     * @mbg.generated
     */
    public void setLastlandingtime(Date lastlandingtime) {
        this.lastlandingtime = lastlandingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cardinfo.status
     *
     * @return the value of cardinfo.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cardinfo.status
     *
     * @param status the value for cardinfo.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}