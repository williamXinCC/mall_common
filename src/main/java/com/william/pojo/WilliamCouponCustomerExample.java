package com.william.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WilliamCouponCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startPos;

    private int pageSize;

    public WilliamCouponCustomerExample() {
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

    public WilliamCouponCustomerExample(int startPos, int pageSize) {
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
            addCriterion("william_coupon_customer.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("william_coupon_customer.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("william_coupon_customer.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("william_coupon_customer.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("william_coupon_customer.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("william_coupon_customer.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("william_coupon_customer.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("william_coupon_customer.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("william_coupon_customer.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("william_coupon_customer.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("william_coupon_customer.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("william_coupon_customer.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("william_coupon_customer.coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("william_coupon_customer.coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Long value) {
            addCriterion("william_coupon_customer.coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Long value) {
            addCriterion("william_coupon_customer.coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Long value) {
            addCriterion("william_coupon_customer.coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Long value) {
            addCriterion("william_coupon_customer.coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Long value) {
            addCriterion("william_coupon_customer.coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Long value) {
            addCriterion("william_coupon_customer.coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Long> values) {
            addCriterion("william_coupon_customer.coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Long> values) {
            addCriterion("william_coupon_customer.coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Long value1, Long value2) {
            addCriterion("william_coupon_customer.coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Long value1, Long value2) {
            addCriterion("william_coupon_customer.coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponCountIsNull() {
            addCriterion("william_coupon_customer.coupon_count is null");
            return (Criteria) this;
        }

        public Criteria andCouponCountIsNotNull() {
            addCriterion("william_coupon_customer.coupon_count is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCountEqualTo(Integer value) {
            addCriterion("william_coupon_customer.coupon_count =", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountNotEqualTo(Integer value) {
            addCriterion("william_coupon_customer.coupon_count <>", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountGreaterThan(Integer value) {
            addCriterion("william_coupon_customer.coupon_count >", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon_customer.coupon_count >=", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountLessThan(Integer value) {
            addCriterion("william_coupon_customer.coupon_count <", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon_customer.coupon_count <=", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountIn(List<Integer> values) {
            addCriterion("william_coupon_customer.coupon_count in", values, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountNotIn(List<Integer> values) {
            addCriterion("william_coupon_customer.coupon_count not in", values, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon_customer.coupon_count between", value1, value2, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon_customer.coupon_count not between", value1, value2, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponValueIsNull() {
            addCriterion("william_coupon_customer.coupon_value is null");
            return (Criteria) this;
        }

        public Criteria andCouponValueIsNotNull() {
            addCriterion("william_coupon_customer.coupon_value is not null");
            return (Criteria) this;
        }

        public Criteria andCouponValueEqualTo(BigDecimal value) {
            addCriterion("william_coupon_customer.coupon_value =", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotEqualTo(BigDecimal value) {
            addCriterion("william_coupon_customer.coupon_value <>", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueGreaterThan(BigDecimal value) {
            addCriterion("william_coupon_customer.coupon_value >", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_coupon_customer.coupon_value >=", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueLessThan(BigDecimal value) {
            addCriterion("william_coupon_customer.coupon_value <", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_coupon_customer.coupon_value <=", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueIn(List<BigDecimal> values) {
            addCriterion("william_coupon_customer.coupon_value in", values, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotIn(List<BigDecimal> values) {
            addCriterion("william_coupon_customer.coupon_value not in", values, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_coupon_customer.coupon_value between", value1, value2, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_coupon_customer.coupon_value not between", value1, value2, "couponValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("william_coupon_customer.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("william_coupon_customer.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("william_coupon_customer.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("william_coupon_customer.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("william_coupon_customer.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon_customer.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("william_coupon_customer.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("william_coupon_customer.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("william_coupon_customer.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("william_coupon_customer.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("william_coupon_customer.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("william_coupon_customer.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("william_coupon_customer.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("william_coupon_customer.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("william_coupon_customer.member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("william_coupon_customer.member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("william_coupon_customer.member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("william_coupon_customer.member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("william_coupon_customer.member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon_customer.member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("william_coupon_customer.member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("william_coupon_customer.member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("william_coupon_customer.member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("william_coupon_customer.member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("william_coupon_customer.member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("william_coupon_customer.member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("william_coupon_customer.member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("william_coupon_customer.member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andGetTypeIsNull() {
            addCriterion("william_coupon_customer.get_type is null");
            return (Criteria) this;
        }

        public Criteria andGetTypeIsNotNull() {
            addCriterion("william_coupon_customer.get_type is not null");
            return (Criteria) this;
        }

        public Criteria andGetTypeEqualTo(Integer value) {
            addCriterion("william_coupon_customer.get_type =", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeNotEqualTo(Integer value) {
            addCriterion("william_coupon_customer.get_type <>", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeGreaterThan(Integer value) {
            addCriterion("william_coupon_customer.get_type >", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon_customer.get_type >=", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeLessThan(Integer value) {
            addCriterion("william_coupon_customer.get_type <", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon_customer.get_type <=", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeIn(List<Integer> values) {
            addCriterion("william_coupon_customer.get_type in", values, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeNotIn(List<Integer> values) {
            addCriterion("william_coupon_customer.get_type not in", values, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon_customer.get_type between", value1, value2, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon_customer.get_type not between", value1, value2, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNull() {
            addCriterion("william_coupon_customer.get_time is null");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNotNull() {
            addCriterion("william_coupon_customer.get_time is not null");
            return (Criteria) this;
        }

        public Criteria andGetTimeEqualTo(Date value) {
            addCriterion("william_coupon_customer.get_time =", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotEqualTo(Date value) {
            addCriterion("william_coupon_customer.get_time <>", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThan(Date value) {
            addCriterion("william_coupon_customer.get_time >", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_coupon_customer.get_time >=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThan(Date value) {
            addCriterion("william_coupon_customer.get_time <", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_coupon_customer.get_time <=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeIn(List<Date> values) {
            addCriterion("william_coupon_customer.get_time in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotIn(List<Date> values) {
            addCriterion("william_coupon_customer.get_time not in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeBetween(Date value1, Date value2) {
            addCriterion("william_coupon_customer.get_time between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_coupon_customer.get_time not between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andUseStatusIsNull() {
            addCriterion("william_coupon_customer.use_status is null");
            return (Criteria) this;
        }

        public Criteria andUseStatusIsNotNull() {
            addCriterion("william_coupon_customer.use_status is not null");
            return (Criteria) this;
        }

        public Criteria andUseStatusEqualTo(Integer value) {
            addCriterion("william_coupon_customer.use_status =", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotEqualTo(Integer value) {
            addCriterion("william_coupon_customer.use_status <>", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusGreaterThan(Integer value) {
            addCriterion("william_coupon_customer.use_status >", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon_customer.use_status >=", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusLessThan(Integer value) {
            addCriterion("william_coupon_customer.use_status <", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon_customer.use_status <=", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusIn(List<Integer> values) {
            addCriterion("william_coupon_customer.use_status in", values, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotIn(List<Integer> values) {
            addCriterion("william_coupon_customer.use_status not in", values, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon_customer.use_status between", value1, value2, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon_customer.use_status not between", value1, value2, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNull() {
            addCriterion("william_coupon_customer.use_time is null");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNotNull() {
            addCriterion("william_coupon_customer.use_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseTimeEqualTo(Date value) {
            addCriterion("william_coupon_customer.use_time =", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotEqualTo(Date value) {
            addCriterion("william_coupon_customer.use_time <>", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThan(Date value) {
            addCriterion("william_coupon_customer.use_time >", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_coupon_customer.use_time >=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThan(Date value) {
            addCriterion("william_coupon_customer.use_time <", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_coupon_customer.use_time <=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIn(List<Date> values) {
            addCriterion("william_coupon_customer.use_time in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotIn(List<Date> values) {
            addCriterion("william_coupon_customer.use_time not in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeBetween(Date value1, Date value2) {
            addCriterion("william_coupon_customer.use_time between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_coupon_customer.use_time not between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("william_coupon_customer.order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("william_coupon_customer.order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("william_coupon_customer.order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("william_coupon_customer.order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("william_coupon_customer.order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon_customer.order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("william_coupon_customer.order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("william_coupon_customer.order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("william_coupon_customer.order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("william_coupon_customer.order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("william_coupon_customer.order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("william_coupon_customer.order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("william_coupon_customer.order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("william_coupon_customer.order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("william_coupon_customer.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("william_coupon_customer.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("william_coupon_customer.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("william_coupon_customer.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("william_coupon_customer.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon_customer.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("william_coupon_customer.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("william_coupon_customer.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("william_coupon_customer.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("william_coupon_customer.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("william_coupon_customer.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("william_coupon_customer.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("william_coupon_customer.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("william_coupon_customer.remark not between", value1, value2, "remark");
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