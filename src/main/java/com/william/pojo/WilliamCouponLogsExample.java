package com.william.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WilliamCouponLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startPos;

    private int pageSize;

    public WilliamCouponLogsExample() {
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

    public WilliamCouponLogsExample(int startPos, int pageSize) {
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

        public Criteria andIdIsNull() {
            addCriterion("william_coupon_logs.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("william_coupon_logs.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("william_coupon_logs.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("william_coupon_logs.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("william_coupon_logs.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("william_coupon_logs.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("william_coupon_logs.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("william_coupon_logs.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("william_coupon_logs.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("william_coupon_logs.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("william_coupon_logs.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("william_coupon_logs.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("william_coupon_logs.buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("william_coupon_logs.buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Long value) {
            addCriterion("william_coupon_logs.buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Long value) {
            addCriterion("william_coupon_logs.buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Long value) {
            addCriterion("william_coupon_logs.buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("william_coupon_logs.buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Long value) {
            addCriterion("william_coupon_logs.buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("william_coupon_logs.buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Long> values) {
            addCriterion("william_coupon_logs.buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Long> values) {
            addCriterion("william_coupon_logs.buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Long value1, Long value2) {
            addCriterion("william_coupon_logs.buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("william_coupon_logs.buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdIsNull() {
            addCriterion("william_coupon_logs.coupon_receive_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdIsNotNull() {
            addCriterion("william_coupon_logs.coupon_receive_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdEqualTo(Long value) {
            addCriterion("william_coupon_logs.coupon_receive_id =", value, "couponReceiveId");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdNotEqualTo(Long value) {
            addCriterion("william_coupon_logs.coupon_receive_id <>", value, "couponReceiveId");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdGreaterThan(Long value) {
            addCriterion("william_coupon_logs.coupon_receive_id >", value, "couponReceiveId");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdGreaterThanOrEqualTo(Long value) {
            addCriterion("william_coupon_logs.coupon_receive_id >=", value, "couponReceiveId");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdLessThan(Long value) {
            addCriterion("william_coupon_logs.coupon_receive_id <", value, "couponReceiveId");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdLessThanOrEqualTo(Long value) {
            addCriterion("william_coupon_logs.coupon_receive_id <=", value, "couponReceiveId");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdIn(List<Long> values) {
            addCriterion("william_coupon_logs.coupon_receive_id in", values, "couponReceiveId");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdNotIn(List<Long> values) {
            addCriterion("william_coupon_logs.coupon_receive_id not in", values, "couponReceiveId");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdBetween(Long value1, Long value2) {
            addCriterion("william_coupon_logs.coupon_receive_id between", value1, value2, "couponReceiveId");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveIdNotBetween(Long value1, Long value2) {
            addCriterion("william_coupon_logs.coupon_receive_id not between", value1, value2, "couponReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("william_coupon_logs.order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("william_coupon_logs.order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("william_coupon_logs.order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("william_coupon_logs.order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("william_coupon_logs.order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon_logs.order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("william_coupon_logs.order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("william_coupon_logs.order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("william_coupon_logs.order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("william_coupon_logs.order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("william_coupon_logs.order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("william_coupon_logs.order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("william_coupon_logs.order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("william_coupon_logs.order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountIsNull() {
            addCriterion("william_coupon_logs.order_original_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountIsNotNull() {
            addCriterion("william_coupon_logs.order_original_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.order_original_amount =", value, "orderOriginalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountNotEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.order_original_amount <>", value, "orderOriginalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountGreaterThan(BigDecimal value) {
            addCriterion("william_coupon_logs.order_original_amount >", value, "orderOriginalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.order_original_amount >=", value, "orderOriginalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountLessThan(BigDecimal value) {
            addCriterion("william_coupon_logs.order_original_amount <", value, "orderOriginalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.order_original_amount <=", value, "orderOriginalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountIn(List<BigDecimal> values) {
            addCriterion("william_coupon_logs.order_original_amount in", values, "orderOriginalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountNotIn(List<BigDecimal> values) {
            addCriterion("william_coupon_logs.order_original_amount not in", values, "orderOriginalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_coupon_logs.order_original_amount between", value1, value2, "orderOriginalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_coupon_logs.order_original_amount not between", value1, value2, "orderOriginalAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("william_coupon_logs.coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("william_coupon_logs.coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.coupon_amount =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.coupon_amount <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("william_coupon_logs.coupon_amount >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.coupon_amount >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(BigDecimal value) {
            addCriterion("william_coupon_logs.coupon_amount <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.coupon_amount <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<BigDecimal> values) {
            addCriterion("william_coupon_logs.coupon_amount in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("william_coupon_logs.coupon_amount not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_coupon_logs.coupon_amount between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_coupon_logs.coupon_amount not between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountIsNull() {
            addCriterion("william_coupon_logs.order_final_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountIsNotNull() {
            addCriterion("william_coupon_logs.order_final_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.order_final_amount =", value, "orderFinalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountNotEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.order_final_amount <>", value, "orderFinalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountGreaterThan(BigDecimal value) {
            addCriterion("william_coupon_logs.order_final_amount >", value, "orderFinalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.order_final_amount >=", value, "orderFinalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountLessThan(BigDecimal value) {
            addCriterion("william_coupon_logs.order_final_amount <", value, "orderFinalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_coupon_logs.order_final_amount <=", value, "orderFinalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountIn(List<BigDecimal> values) {
            addCriterion("william_coupon_logs.order_final_amount in", values, "orderFinalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountNotIn(List<BigDecimal> values) {
            addCriterion("william_coupon_logs.order_final_amount not in", values, "orderFinalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_coupon_logs.order_final_amount between", value1, value2, "orderFinalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFinalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_coupon_logs.order_final_amount not between", value1, value2, "orderFinalAmount");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("william_coupon_logs.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("william_coupon_logs.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("william_coupon_logs.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("william_coupon_logs.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("william_coupon_logs.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_coupon_logs.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("william_coupon_logs.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_coupon_logs.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("william_coupon_logs.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("william_coupon_logs.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("william_coupon_logs.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_coupon_logs.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("william_coupon_logs.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("william_coupon_logs.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("william_coupon_logs.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("william_coupon_logs.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("william_coupon_logs.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon_logs.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("william_coupon_logs.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon_logs.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("william_coupon_logs.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("william_coupon_logs.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon_logs.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon_logs.status not between", value1, value2, "status");
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