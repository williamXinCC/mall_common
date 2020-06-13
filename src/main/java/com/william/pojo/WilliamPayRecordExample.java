package com.william.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WilliamPayRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startPos;

    private int pageSize;

    public WilliamPayRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setStartPos(int startPos) {
        this.startPos=startPos;
    }

    public int getStartPos() {
        return this.startPos;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public WilliamPayRecordExample(int startPos, int pageSize) {
        this();
        this.startPos=startPos;
        this.pageSize=pageSize;
    }

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

        public Criteria andPayIdIsNull() {
            addCriterion("william_pay_record.pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("william_pay_record.pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("william_pay_record.pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("william_pay_record.pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("william_pay_record.pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_pay_record.pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("william_pay_record.pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("william_pay_record.pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("william_pay_record.pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("william_pay_record.pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("william_pay_record.pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("william_pay_record.pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("william_pay_record.pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("william_pay_record.pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdIsNull() {
            addCriterion("william_pay_record.pay_channel_id is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdIsNotNull() {
            addCriterion("william_pay_record.pay_channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdEqualTo(Integer value) {
            addCriterion("william_pay_record.pay_channel_id =", value, "payChannelId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdNotEqualTo(Integer value) {
            addCriterion("william_pay_record.pay_channel_id <>", value, "payChannelId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdGreaterThan(Integer value) {
            addCriterion("william_pay_record.pay_channel_id >", value, "payChannelId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_pay_record.pay_channel_id >=", value, "payChannelId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdLessThan(Integer value) {
            addCriterion("william_pay_record.pay_channel_id <", value, "payChannelId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("william_pay_record.pay_channel_id <=", value, "payChannelId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdIn(List<Integer> values) {
            addCriterion("william_pay_record.pay_channel_id in", values, "payChannelId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdNotIn(List<Integer> values) {
            addCriterion("william_pay_record.pay_channel_id not in", values, "payChannelId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("william_pay_record.pay_channel_id between", value1, value2, "payChannelId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("william_pay_record.pay_channel_id not between", value1, value2, "payChannelId");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("william_pay_record.ref_id is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("william_pay_record.ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(Integer value) {
            addCriterion("william_pay_record.ref_id =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(Integer value) {
            addCriterion("william_pay_record.ref_id <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(Integer value) {
            addCriterion("william_pay_record.ref_id >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_pay_record.ref_id >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(Integer value) {
            addCriterion("william_pay_record.ref_id <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(Integer value) {
            addCriterion("william_pay_record.ref_id <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<Integer> values) {
            addCriterion("william_pay_record.ref_id in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<Integer> values) {
            addCriterion("william_pay_record.ref_id not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(Integer value1, Integer value2) {
            addCriterion("william_pay_record.ref_id between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(Integer value1, Integer value2) {
            addCriterion("william_pay_record.ref_id not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdIsNull() {
            addCriterion("william_pay_record.out_trade_id is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdIsNotNull() {
            addCriterion("william_pay_record.out_trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdEqualTo(String value) {
            addCriterion("william_pay_record.out_trade_id =", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdNotEqualTo(String value) {
            addCriterion("william_pay_record.out_trade_id <>", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdGreaterThan(String value) {
            addCriterion("william_pay_record.out_trade_id >", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_pay_record.out_trade_id >=", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdLessThan(String value) {
            addCriterion("william_pay_record.out_trade_id <", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdLessThanOrEqualTo(String value) {
            addCriterion("william_pay_record.out_trade_id <=", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdLike(String value) {
            addCriterion("william_pay_record.out_trade_id like", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdNotLike(String value) {
            addCriterion("william_pay_record.out_trade_id not like", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdIn(List<String> values) {
            addCriterion("william_pay_record.out_trade_id in", values, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdNotIn(List<String> values) {
            addCriterion("william_pay_record.out_trade_id not in", values, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdBetween(String value1, String value2) {
            addCriterion("william_pay_record.out_trade_id between", value1, value2, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdNotBetween(String value1, String value2) {
            addCriterion("william_pay_record.out_trade_id not between", value1, value2, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("william_pay_record.customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("william_pay_record.customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("william_pay_record.customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("william_pay_record.customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("william_pay_record.customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_pay_record.customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("william_pay_record.customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("william_pay_record.customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("william_pay_record.customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("william_pay_record.customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("william_pay_record.customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("william_pay_record.customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("william_pay_record.customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("william_pay_record.customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("william_pay_record.order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("william_pay_record.order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("william_pay_record.order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("william_pay_record.order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("william_pay_record.order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_pay_record.order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("william_pay_record.order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("william_pay_record.order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("william_pay_record.order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("william_pay_record.order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("william_pay_record.order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("william_pay_record.order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("william_pay_record.order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("william_pay_record.order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andExtInfoIsNull() {
            addCriterion("william_pay_record.ext_info is null");
            return (Criteria) this;
        }

        public Criteria andExtInfoIsNotNull() {
            addCriterion("william_pay_record.ext_info is not null");
            return (Criteria) this;
        }

        public Criteria andExtInfoEqualTo(String value) {
            addCriterion("william_pay_record.ext_info =", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotEqualTo(String value) {
            addCriterion("william_pay_record.ext_info <>", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoGreaterThan(String value) {
            addCriterion("william_pay_record.ext_info >", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoGreaterThanOrEqualTo(String value) {
            addCriterion("william_pay_record.ext_info >=", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLessThan(String value) {
            addCriterion("william_pay_record.ext_info <", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLessThanOrEqualTo(String value) {
            addCriterion("william_pay_record.ext_info <=", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLike(String value) {
            addCriterion("william_pay_record.ext_info like", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotLike(String value) {
            addCriterion("william_pay_record.ext_info not like", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoIn(List<String> values) {
            addCriterion("william_pay_record.ext_info in", values, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotIn(List<String> values) {
            addCriterion("william_pay_record.ext_info not in", values, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoBetween(String value1, String value2) {
            addCriterion("william_pay_record.ext_info between", value1, value2, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotBetween(String value1, String value2) {
            addCriterion("william_pay_record.ext_info not between", value1, value2, "extInfo");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("william_pay_record.client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("william_pay_record.client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("william_pay_record.client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("william_pay_record.client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("william_pay_record.client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_pay_record.client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("william_pay_record.client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("william_pay_record.client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("william_pay_record.client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("william_pay_record.client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("william_pay_record.client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("william_pay_record.client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("william_pay_record.client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("william_pay_record.client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("william_pay_record.pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("william_pay_record.pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("william_pay_record.pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("william_pay_record.pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("william_pay_record.pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_pay_record.pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("william_pay_record.pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_pay_record.pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("william_pay_record.pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("william_pay_record.pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("william_pay_record.pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_pay_record.pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("william_pay_record.pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("william_pay_record.pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Byte value) {
            addCriterion("william_pay_record.pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Byte value) {
            addCriterion("william_pay_record.pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Byte value) {
            addCriterion("william_pay_record.pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("william_pay_record.pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Byte value) {
            addCriterion("william_pay_record.pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Byte value) {
            addCriterion("william_pay_record.pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Byte> values) {
            addCriterion("william_pay_record.pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Byte> values) {
            addCriterion("william_pay_record.pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Byte value1, Byte value2) {
            addCriterion("william_pay_record.pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("william_pay_record.pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("william_pay_record.pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("william_pay_record.pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("william_pay_record.pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("william_pay_record.pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("william_pay_record.pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_pay_record.pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("william_pay_record.pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_pay_record.pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("william_pay_record.pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("william_pay_record.pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_pay_record.pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_pay_record.pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("william_pay_record.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("william_pay_record.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("william_pay_record.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("william_pay_record.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("william_pay_record.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_pay_record.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("william_pay_record.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_pay_record.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("william_pay_record.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("william_pay_record.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("william_pay_record.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_pay_record.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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