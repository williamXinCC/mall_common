package com.william.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WilliamOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startPos;

    private int pageSize;

    public WilliamOrderExample() {
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

    public WilliamOrderExample(int startPos, int pageSize) {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("william_order.order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("william_order.order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("william_order.order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("william_order.order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("william_order.order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("william_order.order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("william_order.order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("william_order.order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("william_order.order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("william_order.order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("william_order.order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("william_order.order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("william_order.order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("william_order.order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("william_order.order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("william_order.order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("william_order.order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("william_order.order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_order.order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("william_order.order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_order.order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("william_order.order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("william_order.order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_order.order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_order.order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andAfterStatusIsNull() {
            addCriterion("william_order.after_status is null");
            return (Criteria) this;
        }

        public Criteria andAfterStatusIsNotNull() {
            addCriterion("william_order.after_status is not null");
            return (Criteria) this;
        }

        public Criteria andAfterStatusEqualTo(Integer value) {
            addCriterion("william_order.after_status =", value, "afterStatus");
            return (Criteria) this;
        }

        public Criteria andAfterStatusNotEqualTo(Integer value) {
            addCriterion("william_order.after_status <>", value, "afterStatus");
            return (Criteria) this;
        }

        public Criteria andAfterStatusGreaterThan(Integer value) {
            addCriterion("william_order.after_status >", value, "afterStatus");
            return (Criteria) this;
        }

        public Criteria andAfterStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_order.after_status >=", value, "afterStatus");
            return (Criteria) this;
        }

        public Criteria andAfterStatusLessThan(Integer value) {
            addCriterion("william_order.after_status <", value, "afterStatus");
            return (Criteria) this;
        }

        public Criteria andAfterStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_order.after_status <=", value, "afterStatus");
            return (Criteria) this;
        }

        public Criteria andAfterStatusIn(List<Integer> values) {
            addCriterion("william_order.after_status in", values, "afterStatus");
            return (Criteria) this;
        }

        public Criteria andAfterStatusNotIn(List<Integer> values) {
            addCriterion("william_order.after_status not in", values, "afterStatus");
            return (Criteria) this;
        }

        public Criteria andAfterStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_order.after_status between", value1, value2, "afterStatus");
            return (Criteria) this;
        }

        public Criteria andAfterStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_order.after_status not between", value1, value2, "afterStatus");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNull() {
            addCriterion("william_order.product_count is null");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNotNull() {
            addCriterion("william_order.product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountEqualTo(Integer value) {
            addCriterion("william_order.product_count =", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotEqualTo(Integer value) {
            addCriterion("william_order.product_count <>", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThan(Integer value) {
            addCriterion("william_order.product_count >", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_order.product_count >=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThan(Integer value) {
            addCriterion("william_order.product_count <", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThanOrEqualTo(Integer value) {
            addCriterion("william_order.product_count <=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountIn(List<Integer> values) {
            addCriterion("william_order.product_count in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotIn(List<Integer> values) {
            addCriterion("william_order.product_count not in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountBetween(Integer value1, Integer value2) {
            addCriterion("william_order.product_count between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotBetween(Integer value1, Integer value2) {
            addCriterion("william_order.product_count not between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalIsNull() {
            addCriterion("william_order.product_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalIsNotNull() {
            addCriterion("william_order.product_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalEqualTo(BigDecimal value) {
            addCriterion("william_order.product_amount_total =", value, "productAmountTotal");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalNotEqualTo(BigDecimal value) {
            addCriterion("william_order.product_amount_total <>", value, "productAmountTotal");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalGreaterThan(BigDecimal value) {
            addCriterion("william_order.product_amount_total >", value, "productAmountTotal");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_order.product_amount_total >=", value, "productAmountTotal");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalLessThan(BigDecimal value) {
            addCriterion("william_order.product_amount_total <", value, "productAmountTotal");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_order.product_amount_total <=", value, "productAmountTotal");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalIn(List<BigDecimal> values) {
            addCriterion("william_order.product_amount_total in", values, "productAmountTotal");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalNotIn(List<BigDecimal> values) {
            addCriterion("william_order.product_amount_total not in", values, "productAmountTotal");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_order.product_amount_total between", value1, value2, "productAmountTotal");
            return (Criteria) this;
        }

        public Criteria andProductAmountTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_order.product_amount_total not between", value1, value2, "productAmountTotal");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("william_order.coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("william_order.coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("william_order.coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("william_order.coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("william_order.coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("william_order.coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("william_order.coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("william_order.coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("william_order.coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("william_order.coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("william_order.coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("william_order.coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("william_order.coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponValueIsNull() {
            addCriterion("william_order.coupon_value is null");
            return (Criteria) this;
        }

        public Criteria andCouponValueIsNotNull() {
            addCriterion("william_order.coupon_value is not null");
            return (Criteria) this;
        }

        public Criteria andCouponValueEqualTo(Integer value) {
            addCriterion("william_order.coupon_value =", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotEqualTo(Integer value) {
            addCriterion("william_order.coupon_value <>", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueGreaterThan(Integer value) {
            addCriterion("william_order.coupon_value >", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_order.coupon_value >=", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueLessThan(Integer value) {
            addCriterion("william_order.coupon_value <", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueLessThanOrEqualTo(Integer value) {
            addCriterion("william_order.coupon_value <=", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueIn(List<Integer> values) {
            addCriterion("william_order.coupon_value in", values, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotIn(List<Integer> values) {
            addCriterion("william_order.coupon_value not in", values, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueBetween(Integer value1, Integer value2) {
            addCriterion("william_order.coupon_value between", value1, value2, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotBetween(Integer value1, Integer value2) {
            addCriterion("william_order.coupon_value not between", value1, value2, "couponValue");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalIsNull() {
            addCriterion("william_order.order_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalIsNotNull() {
            addCriterion("william_order.order_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalEqualTo(BigDecimal value) {
            addCriterion("william_order.order_amount_total =", value, "orderAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalNotEqualTo(BigDecimal value) {
            addCriterion("william_order.order_amount_total <>", value, "orderAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalGreaterThan(BigDecimal value) {
            addCriterion("william_order.order_amount_total >", value, "orderAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_order.order_amount_total >=", value, "orderAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalLessThan(BigDecimal value) {
            addCriterion("william_order.order_amount_total <", value, "orderAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_order.order_amount_total <=", value, "orderAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalIn(List<BigDecimal> values) {
            addCriterion("william_order.order_amount_total in", values, "orderAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalNotIn(List<BigDecimal> values) {
            addCriterion("william_order.order_amount_total not in", values, "orderAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_order.order_amount_total between", value1, value2, "orderAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_order.order_amount_total not between", value1, value2, "orderAmountTotal");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeIsNull() {
            addCriterion("william_order.logistics_fee is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeIsNotNull() {
            addCriterion("william_order.logistics_fee is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeEqualTo(BigDecimal value) {
            addCriterion("william_order.logistics_fee =", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeNotEqualTo(BigDecimal value) {
            addCriterion("william_order.logistics_fee <>", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeGreaterThan(BigDecimal value) {
            addCriterion("william_order.logistics_fee >", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_order.logistics_fee >=", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeLessThan(BigDecimal value) {
            addCriterion("william_order.logistics_fee <", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_order.logistics_fee <=", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeIn(List<BigDecimal> values) {
            addCriterion("william_order.logistics_fee in", values, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeNotIn(List<BigDecimal> values) {
            addCriterion("william_order.logistics_fee not in", values, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_order.logistics_fee between", value1, value2, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_order.logistics_fee not between", value1, value2, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeIsNull() {
            addCriterion("william_order.logistics_type is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeIsNotNull() {
            addCriterion("william_order.logistics_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeEqualTo(Integer value) {
            addCriterion("william_order.logistics_type =", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeNotEqualTo(Integer value) {
            addCriterion("william_order.logistics_type <>", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeGreaterThan(Integer value) {
            addCriterion("william_order.logistics_type >", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_order.logistics_type >=", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeLessThan(Integer value) {
            addCriterion("william_order.logistics_type <", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_order.logistics_type <=", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeIn(List<Integer> values) {
            addCriterion("william_order.logistics_type in", values, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeNotIn(List<Integer> values) {
            addCriterion("william_order.logistics_type not in", values, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_order.logistics_type between", value1, value2, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_order.logistics_type not between", value1, value2, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("william_order.address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("william_order.address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(String value) {
            addCriterion("william_order.address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(String value) {
            addCriterion("william_order.address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(String value) {
            addCriterion("william_order.address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(String value) {
            addCriterion("william_order.address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(String value) {
            addCriterion("william_order.address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLike(String value) {
            addCriterion("william_order.address_id like", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotLike(String value) {
            addCriterion("william_order.address_id not like", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<String> values) {
            addCriterion("william_order.address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<String> values) {
            addCriterion("william_order.address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(String value1, String value2) {
            addCriterion("william_order.address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(String value1, String value2) {
            addCriterion("william_order.address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("william_order.pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("william_order.pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("william_order.pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("william_order.pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("william_order.pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("william_order.pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("william_order.pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("william_order.pay_channel like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("william_order.pay_channel not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("william_order.pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("william_order.pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("william_order.pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("william_order.pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("william_order.out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("william_order.out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("william_order.out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("william_order.out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("william_order.out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("william_order.out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("william_order.out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("william_order.out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("william_order.out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("william_order.out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("william_order.out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("william_order.out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("william_order.out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoIsNull() {
            addCriterion("william_order.escrow_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoIsNotNull() {
            addCriterion("william_order.escrow_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoEqualTo(String value) {
            addCriterion("william_order.escrow_trade_no =", value, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoNotEqualTo(String value) {
            addCriterion("william_order.escrow_trade_no <>", value, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoGreaterThan(String value) {
            addCriterion("william_order.escrow_trade_no >", value, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.escrow_trade_no >=", value, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoLessThan(String value) {
            addCriterion("william_order.escrow_trade_no <", value, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoLessThanOrEqualTo(String value) {
            addCriterion("william_order.escrow_trade_no <=", value, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoLike(String value) {
            addCriterion("william_order.escrow_trade_no like", value, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoNotLike(String value) {
            addCriterion("william_order.escrow_trade_no not like", value, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoIn(List<String> values) {
            addCriterion("william_order.escrow_trade_no in", values, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoNotIn(List<String> values) {
            addCriterion("william_order.escrow_trade_no not in", values, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoBetween(String value1, String value2) {
            addCriterion("william_order.escrow_trade_no between", value1, value2, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andEscrowTradeNoNotBetween(String value1, String value2) {
            addCriterion("william_order.escrow_trade_no not between", value1, value2, "escrowTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("william_order.order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("william_order.order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("william_order.order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("william_order.order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("william_order.order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_order.order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("william_order.order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_order.order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("william_order.order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("william_order.order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_order.order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_order.order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdIsNull() {
            addCriterion("william_order.order_create_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdIsNotNull() {
            addCriterion("william_order.order_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdEqualTo(String value) {
            addCriterion("william_order.order_create_id =", value, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdNotEqualTo(String value) {
            addCriterion("william_order.order_create_id <>", value, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdGreaterThan(String value) {
            addCriterion("william_order.order_create_id >", value, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.order_create_id >=", value, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdLessThan(String value) {
            addCriterion("william_order.order_create_id <", value, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdLessThanOrEqualTo(String value) {
            addCriterion("william_order.order_create_id <=", value, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdLike(String value) {
            addCriterion("william_order.order_create_id like", value, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdNotLike(String value) {
            addCriterion("william_order.order_create_id not like", value, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdIn(List<String> values) {
            addCriterion("william_order.order_create_id in", values, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdNotIn(List<String> values) {
            addCriterion("william_order.order_create_id not in", values, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdBetween(String value1, String value2) {
            addCriterion("william_order.order_create_id between", value1, value2, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIdNotBetween(String value1, String value2) {
            addCriterion("william_order.order_create_id not between", value1, value2, "orderCreateId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("william_order.order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("william_order.order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("william_order.order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("william_order.order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("william_order.order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_order.order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("william_order.order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_order.order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("william_order.order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("william_order.order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("william_order.order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_order.order_create_time not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("william_order.tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("william_order.tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("william_order.tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("william_order.tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("william_order.tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("william_order.tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("william_order.tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("william_order.tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("william_order.tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("william_order.tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("william_order.tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("william_order.tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("william_order.tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("william_order.client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("william_order.client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("william_order.client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("william_order.client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("william_order.client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("william_order.client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("william_order.client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("william_order.client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("william_order.client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("william_order.client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("william_order.client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("william_order.client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("william_order.client not between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionIsNull() {
            addCriterion("william_order.operate_permission is null");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionIsNotNull() {
            addCriterion("william_order.operate_permission is not null");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionEqualTo(String value) {
            addCriterion("william_order.operate_permission =", value, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionNotEqualTo(String value) {
            addCriterion("william_order.operate_permission <>", value, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionGreaterThan(String value) {
            addCriterion("william_order.operate_permission >", value, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.operate_permission >=", value, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionLessThan(String value) {
            addCriterion("william_order.operate_permission <", value, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionLessThanOrEqualTo(String value) {
            addCriterion("william_order.operate_permission <=", value, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionLike(String value) {
            addCriterion("william_order.operate_permission like", value, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionNotLike(String value) {
            addCriterion("william_order.operate_permission not like", value, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionIn(List<String> values) {
            addCriterion("william_order.operate_permission in", values, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionNotIn(List<String> values) {
            addCriterion("william_order.operate_permission not in", values, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionBetween(String value1, String value2) {
            addCriterion("william_order.operate_permission between", value1, value2, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andOperatePermissionNotBetween(String value1, String value2) {
            addCriterion("william_order.operate_permission not between", value1, value2, "operatePermission");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("william_order.mod_id is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("william_order.mod_id is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("william_order.mod_id =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("william_order.mod_id <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("william_order.mod_id >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.mod_id >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("william_order.mod_id <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("william_order.mod_id <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("william_order.mod_id like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("william_order.mod_id not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("william_order.mod_id in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("william_order.mod_id not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("william_order.mod_id between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("william_order.mod_id not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("william_order.mod_time is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("william_order.mod_time is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("william_order.mod_time =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("william_order.mod_time <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("william_order.mod_time >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_order.mod_time >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("william_order.mod_time <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_order.mod_time <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("william_order.mod_time in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("william_order.mod_time not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("william_order.mod_time between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_order.mod_time not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andDeleteIdIsNull() {
            addCriterion("william_order.delete_id is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIdIsNotNull() {
            addCriterion("william_order.delete_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteIdEqualTo(String value) {
            addCriterion("william_order.delete_id =", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdNotEqualTo(String value) {
            addCriterion("william_order.delete_id <>", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdGreaterThan(String value) {
            addCriterion("william_order.delete_id >", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_order.delete_id >=", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdLessThan(String value) {
            addCriterion("william_order.delete_id <", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdLessThanOrEqualTo(String value) {
            addCriterion("william_order.delete_id <=", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdLike(String value) {
            addCriterion("william_order.delete_id like", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdNotLike(String value) {
            addCriterion("william_order.delete_id not like", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdIn(List<String> values) {
            addCriterion("william_order.delete_id in", values, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdNotIn(List<String> values) {
            addCriterion("william_order.delete_id not in", values, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdBetween(String value1, String value2) {
            addCriterion("william_order.delete_id between", value1, value2, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdNotBetween(String value1, String value2) {
            addCriterion("william_order.delete_id not between", value1, value2, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("william_order.delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("william_order.delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("william_order.delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("william_order.delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("william_order.delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_order.delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("william_order.delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_order.delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("william_order.delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("william_order.delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("william_order.delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_order.delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("william_order.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("william_order.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("william_order.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("william_order.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("william_order.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_order.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("william_order.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_order.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("william_order.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("william_order.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_order.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_order.status not between", value1, value2, "status");
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