package com.william.ali;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlipayPayRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startPos;

    private int pageSize;

    public AlipayPayRecordExample() {
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

    public AlipayPayRecordExample(int startPos, int pageSize) {
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

        public Criteria andAlipayIdIsNull() {
            addCriterion("willliam_alipay_pay_record.alipay_id is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIdIsNotNull() {
            addCriterion("willliam_alipay_pay_record.alipay_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayIdEqualTo(Integer value) {
            addCriterion("willliam_alipay_pay_record.alipay_id =", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotEqualTo(Integer value) {
            addCriterion("willliam_alipay_pay_record.alipay_id <>", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdGreaterThan(Integer value) {
            addCriterion("willliam_alipay_pay_record.alipay_id >", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("willliam_alipay_pay_record.alipay_id >=", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdLessThan(Integer value) {
            addCriterion("willliam_alipay_pay_record.alipay_id <", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdLessThanOrEqualTo(Integer value) {
            addCriterion("willliam_alipay_pay_record.alipay_id <=", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdIn(List<Integer> values) {
            addCriterion("willliam_alipay_pay_record.alipay_id in", values, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotIn(List<Integer> values) {
            addCriterion("willliam_alipay_pay_record.alipay_id not in", values, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdBetween(Integer value1, Integer value2) {
            addCriterion("willliam_alipay_pay_record.alipay_id between", value1, value2, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("willliam_alipay_pay_record.alipay_id not between", value1, value2, "alipayId");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("willliam_alipay_pay_record.pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("willliam_alipay_pay_record.pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("willliam_alipay_pay_record.pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("willliam_alipay_pay_record.order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("willliam_alipay_pay_record.order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("willliam_alipay_pay_record.order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIsNull() {
            addCriterion("willliam_alipay_pay_record.notify_time is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIsNotNull() {
            addCriterion("willliam_alipay_pay_record.notify_time is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_time =", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_time <>", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.notify_time >", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_time >=", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.notify_time <", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_time <=", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeLike(String value) {
            addCriterion("willliam_alipay_pay_record.notify_time like", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.notify_time not like", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.notify_time in", values, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.notify_time not in", values, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.notify_time between", value1, value2, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.notify_time not between", value1, value2, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIsNull() {
            addCriterion("willliam_alipay_pay_record.notify_type is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIsNotNull() {
            addCriterion("willliam_alipay_pay_record.notify_type is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_type =", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_type <>", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.notify_type >", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_type >=", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.notify_type <", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_type <=", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLike(String value) {
            addCriterion("willliam_alipay_pay_record.notify_type like", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.notify_type not like", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.notify_type in", values, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.notify_type not in", values, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.notify_type between", value1, value2, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.notify_type not between", value1, value2, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyIdIsNull() {
            addCriterion("willliam_alipay_pay_record.notify_id is null");
            return (Criteria) this;
        }

        public Criteria andNotifyIdIsNotNull() {
            addCriterion("willliam_alipay_pay_record.notify_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyIdEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_id =", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_id <>", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.notify_id >", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_id >=", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.notify_id <", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.notify_id <=", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdLike(String value) {
            addCriterion("willliam_alipay_pay_record.notify_id like", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.notify_id not like", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.notify_id in", values, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.notify_id not in", values, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.notify_id between", value1, value2, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.notify_id not between", value1, value2, "notifyId");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("willliam_alipay_pay_record.sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("willliam_alipay_pay_record.sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("willliam_alipay_pay_record.sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("willliam_alipay_pay_record.trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("willliam_alipay_pay_record.trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("willliam_alipay_pay_record.trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("willliam_alipay_pay_record.out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("willliam_alipay_pay_record.out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("willliam_alipay_pay_record.out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIsNull() {
            addCriterion("willliam_alipay_pay_record.out_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIsNotNull() {
            addCriterion("willliam_alipay_pay_record.out_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutBizNoEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.out_biz_no =", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.out_biz_no <>", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.out_biz_no >", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.out_biz_no >=", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.out_biz_no <", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.out_biz_no <=", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLike(String value) {
            addCriterion("willliam_alipay_pay_record.out_biz_no like", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.out_biz_no not like", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.out_biz_no in", values, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.out_biz_no not in", values, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.out_biz_no between", value1, value2, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.out_biz_no not between", value1, value2, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("willliam_alipay_pay_record.buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("willliam_alipay_pay_record.buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLike(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_id like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_id not like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdIsNull() {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdIsNotNull() {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id =", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id <>", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id >", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id >=", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id <", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id <=", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdLike(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id like", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id not like", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id in", values, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id not in", values, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id between", value1, value2, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.buyer_logon_id not between", value1, value2, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("willliam_alipay_pay_record.seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("willliam_alipay_pay_record.seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("willliam_alipay_pay_record.seller_id like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.seller_id not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerEmailIsNull() {
            addCriterion("willliam_alipay_pay_record.seller_email is null");
            return (Criteria) this;
        }

        public Criteria andSellerEmailIsNotNull() {
            addCriterion("willliam_alipay_pay_record.seller_email is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEmailEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.seller_email =", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.seller_email <>", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.seller_email >", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.seller_email >=", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.seller_email <", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.seller_email <=", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailLike(String value) {
            addCriterion("willliam_alipay_pay_record.seller_email like", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.seller_email not like", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.seller_email in", values, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.seller_email not in", values, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.seller_email between", value1, value2, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.seller_email not between", value1, value2, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNull() {
            addCriterion("willliam_alipay_pay_record.trade_status is null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNotNull() {
            addCriterion("willliam_alipay_pay_record.trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.trade_status =", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.trade_status <>", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.trade_status >", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.trade_status >=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.trade_status <", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.trade_status <=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLike(String value) {
            addCriterion("willliam_alipay_pay_record.trade_status like", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.trade_status not like", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.trade_status in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.trade_status not in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.trade_status between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.trade_status not between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("willliam_alipay_pay_record.total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("willliam_alipay_pay_record.total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLike(String value) {
            addCriterion("willliam_alipay_pay_record.total_amount like", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.total_amount not like", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountIsNull() {
            addCriterion("willliam_alipay_pay_record.receipt_amount is null");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountIsNotNull() {
            addCriterion("willliam_alipay_pay_record.receipt_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.receipt_amount =", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.receipt_amount <>", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.receipt_amount >", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.receipt_amount >=", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.receipt_amount <", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.receipt_amount <=", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountLike(String value) {
            addCriterion("willliam_alipay_pay_record.receipt_amount like", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.receipt_amount not like", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.receipt_amount in", values, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.receipt_amount not in", values, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.receipt_amount between", value1, value2, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.receipt_amount not between", value1, value2, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNull() {
            addCriterion("willliam_alipay_pay_record.invoice_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNotNull() {
            addCriterion("willliam_alipay_pay_record.invoice_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.invoice_amount =", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.invoice_amount <>", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.invoice_amount >", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.invoice_amount >=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.invoice_amount <", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.invoice_amount <=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLike(String value) {
            addCriterion("willliam_alipay_pay_record.invoice_amount like", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.invoice_amount not like", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.invoice_amount in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.invoice_amount not in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.invoice_amount between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.invoice_amount not between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountIsNull() {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountIsNotNull() {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount =", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount <>", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount >", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount >=", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount <", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount <=", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountLike(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount like", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount not like", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount in", values, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount not in", values, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount between", value1, value2, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.buyer_pay_amount not between", value1, value2, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNull() {
            addCriterion("willliam_alipay_pay_record.refund_fee is null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNotNull() {
            addCriterion("willliam_alipay_pay_record.refund_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.refund_fee =", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.refund_fee <>", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.refund_fee >", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.refund_fee >=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.refund_fee <", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.refund_fee <=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLike(String value) {
            addCriterion("willliam_alipay_pay_record.refund_fee like", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.refund_fee not like", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.refund_fee in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.refund_fee not in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.refund_fee between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.refund_fee not between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("willliam_alipay_pay_record.subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("willliam_alipay_pay_record.subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("willliam_alipay_pay_record.subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andBodyIsNull() {
            addCriterion("willliam_alipay_pay_record.body is null");
            return (Criteria) this;
        }

        public Criteria andBodyIsNotNull() {
            addCriterion("willliam_alipay_pay_record.body is not null");
            return (Criteria) this;
        }

        public Criteria andBodyEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.body =", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.body <>", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.body >", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.body >=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.body <", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.body <=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLike(String value) {
            addCriterion("willliam_alipay_pay_record.body like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.body not like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.body in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.body not in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.body between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.body not between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("willliam_alipay_pay_record.gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("willliam_alipay_pay_record.gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLike(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_create like", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_create not like", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentIsNull() {
            addCriterion("willliam_alipay_pay_record.gmt_payment is null");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentIsNotNull() {
            addCriterion("willliam_alipay_pay_record.gmt_payment is not null");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_payment =", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_payment <>", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_payment >", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_payment >=", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_payment <", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_payment <=", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentLike(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_payment like", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_payment not like", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.gmt_payment in", values, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.gmt_payment not in", values, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.gmt_payment between", value1, value2, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.gmt_payment not between", value1, value2, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtRefundIsNull() {
            addCriterion("willliam_alipay_pay_record.gmt_refund is null");
            return (Criteria) this;
        }

        public Criteria andGmtRefundIsNotNull() {
            addCriterion("willliam_alipay_pay_record.gmt_refund is not null");
            return (Criteria) this;
        }

        public Criteria andGmtRefundEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_refund =", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_refund <>", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_refund >", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_refund >=", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_refund <", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_refund <=", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundLike(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_refund like", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_refund not like", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.gmt_refund in", values, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.gmt_refund not in", values, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.gmt_refund between", value1, value2, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.gmt_refund not between", value1, value2, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtCloseIsNull() {
            addCriterion("willliam_alipay_pay_record.gmt_close is null");
            return (Criteria) this;
        }

        public Criteria andGmtCloseIsNotNull() {
            addCriterion("willliam_alipay_pay_record.gmt_close is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCloseEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_close =", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_close <>", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_close >", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_close >=", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_close <", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_close <=", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseLike(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_close like", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.gmt_close not like", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.gmt_close in", values, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.gmt_close not in", values, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.gmt_close between", value1, value2, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.gmt_close not between", value1, value2, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andFundBillListIsNull() {
            addCriterion("willliam_alipay_pay_record.fund_bill_list is null");
            return (Criteria) this;
        }

        public Criteria andFundBillListIsNotNull() {
            addCriterion("willliam_alipay_pay_record.fund_bill_list is not null");
            return (Criteria) this;
        }

        public Criteria andFundBillListEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list =", value, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list <>", value, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list >", value, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list >=", value, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list <", value, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list <=", value, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListLike(String value) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list like", value, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list not like", value, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list in", values, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list not in", values, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list between", value1, value2, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andFundBillListNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.fund_bill_list not between", value1, value2, "fundBillList");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsIsNull() {
            addCriterion("willliam_alipay_pay_record.passback_params is null");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsIsNotNull() {
            addCriterion("willliam_alipay_pay_record.passback_params is not null");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.passback_params =", value, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsNotEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.passback_params <>", value, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsGreaterThan(String value) {
            addCriterion("willliam_alipay_pay_record.passback_params >", value, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsGreaterThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.passback_params >=", value, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsLessThan(String value) {
            addCriterion("willliam_alipay_pay_record.passback_params <", value, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsLessThanOrEqualTo(String value) {
            addCriterion("willliam_alipay_pay_record.passback_params <=", value, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsLike(String value) {
            addCriterion("willliam_alipay_pay_record.passback_params like", value, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsNotLike(String value) {
            addCriterion("willliam_alipay_pay_record.passback_params not like", value, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.passback_params in", values, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsNotIn(List<String> values) {
            addCriterion("willliam_alipay_pay_record.passback_params not in", values, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.passback_params between", value1, value2, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andPassbackParamsNotBetween(String value1, String value2) {
            addCriterion("willliam_alipay_pay_record.passback_params not between", value1, value2, "passbackParams");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("willliam_alipay_pay_record.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("willliam_alipay_pay_record.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("willliam_alipay_pay_record.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("willliam_alipay_pay_record.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("willliam_alipay_pay_record.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("willliam_alipay_pay_record.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("willliam_alipay_pay_record.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("willliam_alipay_pay_record.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("willliam_alipay_pay_record.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("willliam_alipay_pay_record.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("willliam_alipay_pay_record.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("willliam_alipay_pay_record.create_time not between", value1, value2, "createTime");
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