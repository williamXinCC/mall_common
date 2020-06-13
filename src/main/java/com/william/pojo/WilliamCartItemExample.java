package com.william.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WilliamCartItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startPos;

    private int pageSize;

    public WilliamCartItemExample() {
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

    public WilliamCartItemExample(int startPos, int pageSize) {
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

        public Criteria andItemIdIsNull() {
            addCriterion("william_cart_item.item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("william_cart_item.item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("william_cart_item.item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("william_cart_item.item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("william_cart_item.item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("william_cart_item.item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("william_cart_item.item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("william_cart_item.item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("william_cart_item.item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("william_cart_item.item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("william_cart_item.item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("william_cart_item.item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("william_cart_item.customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("william_cart_item.customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("william_cart_item.customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("william_cart_item.customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("william_cart_item.customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_cart_item.customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("william_cart_item.customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("william_cart_item.customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("william_cart_item.customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("william_cart_item.customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("william_cart_item.customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("william_cart_item.customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("william_cart_item.customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("william_cart_item.customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("william_cart_item.goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("william_cart_item.goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("william_cart_item.goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("william_cart_item.goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("william_cart_item.goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_cart_item.goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("william_cart_item.goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("william_cart_item.goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("william_cart_item.goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("william_cart_item.goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("william_cart_item.goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("william_cart_item.goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("william_cart_item.goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("william_cart_item.goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("william_cart_item.goods_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("william_cart_item.goods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(BigDecimal value) {
            addCriterion("william_cart_item.goods_unit =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(BigDecimal value) {
            addCriterion("william_cart_item.goods_unit <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(BigDecimal value) {
            addCriterion("william_cart_item.goods_unit >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_cart_item.goods_unit >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(BigDecimal value) {
            addCriterion("william_cart_item.goods_unit <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_cart_item.goods_unit <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<BigDecimal> values) {
            addCriterion("william_cart_item.goods_unit in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<BigDecimal> values) {
            addCriterion("william_cart_item.goods_unit not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_cart_item.goods_unit between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_cart_item.goods_unit not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsCntIsNull() {
            addCriterion("william_cart_item.goods_cnt is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCntIsNotNull() {
            addCriterion("william_cart_item.goods_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCntEqualTo(Integer value) {
            addCriterion("william_cart_item.goods_cnt =", value, "goodsCnt");
            return (Criteria) this;
        }

        public Criteria andGoodsCntNotEqualTo(Integer value) {
            addCriterion("william_cart_item.goods_cnt <>", value, "goodsCnt");
            return (Criteria) this;
        }

        public Criteria andGoodsCntGreaterThan(Integer value) {
            addCriterion("william_cart_item.goods_cnt >", value, "goodsCnt");
            return (Criteria) this;
        }

        public Criteria andGoodsCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_cart_item.goods_cnt >=", value, "goodsCnt");
            return (Criteria) this;
        }

        public Criteria andGoodsCntLessThan(Integer value) {
            addCriterion("william_cart_item.goods_cnt <", value, "goodsCnt");
            return (Criteria) this;
        }

        public Criteria andGoodsCntLessThanOrEqualTo(Integer value) {
            addCriterion("william_cart_item.goods_cnt <=", value, "goodsCnt");
            return (Criteria) this;
        }

        public Criteria andGoodsCntIn(List<Integer> values) {
            addCriterion("william_cart_item.goods_cnt in", values, "goodsCnt");
            return (Criteria) this;
        }

        public Criteria andGoodsCntNotIn(List<Integer> values) {
            addCriterion("william_cart_item.goods_cnt not in", values, "goodsCnt");
            return (Criteria) this;
        }

        public Criteria andGoodsCntBetween(Integer value1, Integer value2) {
            addCriterion("william_cart_item.goods_cnt between", value1, value2, "goodsCnt");
            return (Criteria) this;
        }

        public Criteria andGoodsCntNotBetween(Integer value1, Integer value2) {
            addCriterion("william_cart_item.goods_cnt not between", value1, value2, "goodsCnt");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIsNull() {
            addCriterion("william_cart_item.goods_sku is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIsNotNull() {
            addCriterion("william_cart_item.goods_sku is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuEqualTo(String value) {
            addCriterion("william_cart_item.goods_sku =", value, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuNotEqualTo(String value) {
            addCriterion("william_cart_item.goods_sku <>", value, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuGreaterThan(String value) {
            addCriterion("william_cart_item.goods_sku >", value, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuGreaterThanOrEqualTo(String value) {
            addCriterion("william_cart_item.goods_sku >=", value, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuLessThan(String value) {
            addCriterion("william_cart_item.goods_sku <", value, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuLessThanOrEqualTo(String value) {
            addCriterion("william_cart_item.goods_sku <=", value, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuLike(String value) {
            addCriterion("william_cart_item.goods_sku like", value, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuNotLike(String value) {
            addCriterion("william_cart_item.goods_sku not like", value, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIn(List<String> values) {
            addCriterion("william_cart_item.goods_sku in", values, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuNotIn(List<String> values) {
            addCriterion("william_cart_item.goods_sku not in", values, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuBetween(String value1, String value2) {
            addCriterion("william_cart_item.goods_sku between", value1, value2, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuNotBetween(String value1, String value2) {
            addCriterion("william_cart_item.goods_sku not between", value1, value2, "goodsSku");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNull() {
            addCriterion("william_cart_item.subtotal is null");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNotNull() {
            addCriterion("william_cart_item.subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSubtotalEqualTo(BigDecimal value) {
            addCriterion("william_cart_item.subtotal =", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("william_cart_item.subtotal <>", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThan(BigDecimal value) {
            addCriterion("william_cart_item.subtotal >", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_cart_item.subtotal >=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThan(BigDecimal value) {
            addCriterion("william_cart_item.subtotal <", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_cart_item.subtotal <=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalIn(List<BigDecimal> values) {
            addCriterion("william_cart_item.subtotal in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("william_cart_item.subtotal not in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_cart_item.subtotal between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_cart_item.subtotal not between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("william_cart_item.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("william_cart_item.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("william_cart_item.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("william_cart_item.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("william_cart_item.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_cart_item.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("william_cart_item.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_cart_item.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("william_cart_item.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("william_cart_item.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("william_cart_item.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_cart_item.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("william_cart_item.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("william_cart_item.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("william_cart_item.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("william_cart_item.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("william_cart_item.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_cart_item.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("william_cart_item.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_cart_item.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("william_cart_item.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("william_cart_item.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_cart_item.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_cart_item.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCellTimeIsNull() {
            addCriterion("william_cart_item.cell_time is null");
            return (Criteria) this;
        }

        public Criteria andCellTimeIsNotNull() {
            addCriterion("william_cart_item.cell_time is not null");
            return (Criteria) this;
        }

        public Criteria andCellTimeEqualTo(Date value) {
            addCriterion("william_cart_item.cell_time =", value, "cellTime");
            return (Criteria) this;
        }

        public Criteria andCellTimeNotEqualTo(Date value) {
            addCriterion("william_cart_item.cell_time <>", value, "cellTime");
            return (Criteria) this;
        }

        public Criteria andCellTimeGreaterThan(Date value) {
            addCriterion("william_cart_item.cell_time >", value, "cellTime");
            return (Criteria) this;
        }

        public Criteria andCellTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_cart_item.cell_time >=", value, "cellTime");
            return (Criteria) this;
        }

        public Criteria andCellTimeLessThan(Date value) {
            addCriterion("william_cart_item.cell_time <", value, "cellTime");
            return (Criteria) this;
        }

        public Criteria andCellTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_cart_item.cell_time <=", value, "cellTime");
            return (Criteria) this;
        }

        public Criteria andCellTimeIn(List<Date> values) {
            addCriterion("william_cart_item.cell_time in", values, "cellTime");
            return (Criteria) this;
        }

        public Criteria andCellTimeNotIn(List<Date> values) {
            addCriterion("william_cart_item.cell_time not in", values, "cellTime");
            return (Criteria) this;
        }

        public Criteria andCellTimeBetween(Date value1, Date value2) {
            addCriterion("william_cart_item.cell_time between", value1, value2, "cellTime");
            return (Criteria) this;
        }

        public Criteria andCellTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_cart_item.cell_time not between", value1, value2, "cellTime");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("william_cart_item.tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("william_cart_item.tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("william_cart_item.tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("william_cart_item.tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("william_cart_item.tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_cart_item.tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("william_cart_item.tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("william_cart_item.tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("william_cart_item.tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("william_cart_item.tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("william_cart_item.tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("william_cart_item.tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("william_cart_item.tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("william_cart_item.tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("william_cart_item.client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("william_cart_item.client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("william_cart_item.client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("william_cart_item.client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("william_cart_item.client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("william_cart_item.client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("william_cart_item.client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("william_cart_item.client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("william_cart_item.client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("william_cart_item.client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("william_cart_item.client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("william_cart_item.client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("william_cart_item.client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("william_cart_item.client not between", value1, value2, "client");
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