package com.yjdz.zncdz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipmentinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public EquipmentinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEquipidIsNull() {
            addCriterion("equipid is null");
            return (Criteria) this;
        }

        public Criteria andEquipidIsNotNull() {
            addCriterion("equipid is not null");
            return (Criteria) this;
        }

        public Criteria andEquipidEqualTo(String value) {
            addCriterion("equipid =", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotEqualTo(String value) {
            addCriterion("equipid <>", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidGreaterThan(String value) {
            addCriterion("equipid >", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidGreaterThanOrEqualTo(String value) {
            addCriterion("equipid >=", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLessThan(String value) {
            addCriterion("equipid <", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLessThanOrEqualTo(String value) {
            addCriterion("equipid <=", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLike(String value) {
            addCriterion("equipid like", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotLike(String value) {
            addCriterion("equipid not like", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidIn(List<String> values) {
            addCriterion("equipid in", values, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotIn(List<String> values) {
            addCriterion("equipid not in", values, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidBetween(String value1, String value2) {
            addCriterion("equipid between", value1, value2, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotBetween(String value1, String value2) {
            addCriterion("equipid not between", value1, value2, "equipid");
            return (Criteria) this;
        }

        public Criteria andHostidIsNull() {
            addCriterion("hostid is null");
            return (Criteria) this;
        }

        public Criteria andHostidIsNotNull() {
            addCriterion("hostid is not null");
            return (Criteria) this;
        }

        public Criteria andHostidEqualTo(Integer value) {
            addCriterion("hostid =", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidNotEqualTo(Integer value) {
            addCriterion("hostid <>", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidGreaterThan(Integer value) {
            addCriterion("hostid >", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hostid >=", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidLessThan(Integer value) {
            addCriterion("hostid <", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidLessThanOrEqualTo(Integer value) {
            addCriterion("hostid <=", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidIn(List<Integer> values) {
            addCriterion("hostid in", values, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidNotIn(List<Integer> values) {
            addCriterion("hostid not in", values, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidBetween(Integer value1, Integer value2) {
            addCriterion("hostid between", value1, value2, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidNotBetween(Integer value1, Integer value2) {
            addCriterion("hostid not between", value1, value2, "hostid");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Byte value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Byte value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Byte value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Byte value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Byte value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Byte value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Byte> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Byte> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Byte value1, Byte value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Byte value1, Byte value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortstatusIsNull() {
            addCriterion("portstatus is null");
            return (Criteria) this;
        }

        public Criteria andPortstatusIsNotNull() {
            addCriterion("portstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPortstatusEqualTo(String value) {
            addCriterion("portstatus =", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusNotEqualTo(String value) {
            addCriterion("portstatus <>", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusGreaterThan(String value) {
            addCriterion("portstatus >", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusGreaterThanOrEqualTo(String value) {
            addCriterion("portstatus >=", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusLessThan(String value) {
            addCriterion("portstatus <", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusLessThanOrEqualTo(String value) {
            addCriterion("portstatus <=", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusLike(String value) {
            addCriterion("portstatus like", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusNotLike(String value) {
            addCriterion("portstatus not like", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusIn(List<String> values) {
            addCriterion("portstatus in", values, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusNotIn(List<String> values) {
            addCriterion("portstatus not in", values, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusBetween(String value1, String value2) {
            addCriterion("portstatus between", value1, value2, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusNotBetween(String value1, String value2) {
            addCriterion("portstatus not between", value1, value2, "portstatus");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeIsNull() {
            addCriterion("lastlandingtime is null");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeIsNotNull() {
            addCriterion("lastlandingtime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeEqualTo(Date value) {
            addCriterion("lastlandingtime =", value, "lastlandingtime");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeNotEqualTo(Date value) {
            addCriterion("lastlandingtime <>", value, "lastlandingtime");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeGreaterThan(Date value) {
            addCriterion("lastlandingtime >", value, "lastlandingtime");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastlandingtime >=", value, "lastlandingtime");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeLessThan(Date value) {
            addCriterion("lastlandingtime <", value, "lastlandingtime");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeLessThanOrEqualTo(Date value) {
            addCriterion("lastlandingtime <=", value, "lastlandingtime");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeIn(List<Date> values) {
            addCriterion("lastlandingtime in", values, "lastlandingtime");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeNotIn(List<Date> values) {
            addCriterion("lastlandingtime not in", values, "lastlandingtime");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeBetween(Date value1, Date value2) {
            addCriterion("lastlandingtime between", value1, value2, "lastlandingtime");
            return (Criteria) this;
        }

        public Criteria andLastlandingtimeNotBetween(Date value1, Date value2) {
            addCriterion("lastlandingtime not between", value1, value2, "lastlandingtime");
            return (Criteria) this;
        }

        public Criteria andRealpowerIsNull() {
            addCriterion("realpower is null");
            return (Criteria) this;
        }

        public Criteria andRealpowerIsNotNull() {
            addCriterion("realpower is not null");
            return (Criteria) this;
        }

        public Criteria andRealpowerEqualTo(Integer value) {
            addCriterion("realpower =", value, "realpower");
            return (Criteria) this;
        }

        public Criteria andRealpowerNotEqualTo(Integer value) {
            addCriterion("realpower <>", value, "realpower");
            return (Criteria) this;
        }

        public Criteria andRealpowerGreaterThan(Integer value) {
            addCriterion("realpower >", value, "realpower");
            return (Criteria) this;
        }

        public Criteria andRealpowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("realpower >=", value, "realpower");
            return (Criteria) this;
        }

        public Criteria andRealpowerLessThan(Integer value) {
            addCriterion("realpower <", value, "realpower");
            return (Criteria) this;
        }

        public Criteria andRealpowerLessThanOrEqualTo(Integer value) {
            addCriterion("realpower <=", value, "realpower");
            return (Criteria) this;
        }

        public Criteria andRealpowerIn(List<Integer> values) {
            addCriterion("realpower in", values, "realpower");
            return (Criteria) this;
        }

        public Criteria andRealpowerNotIn(List<Integer> values) {
            addCriterion("realpower not in", values, "realpower");
            return (Criteria) this;
        }

        public Criteria andRealpowerBetween(Integer value1, Integer value2) {
            addCriterion("realpower between", value1, value2, "realpower");
            return (Criteria) this;
        }

        public Criteria andRealpowerNotBetween(Integer value1, Integer value2) {
            addCriterion("realpower not between", value1, value2, "realpower");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table equipmentinfo
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}