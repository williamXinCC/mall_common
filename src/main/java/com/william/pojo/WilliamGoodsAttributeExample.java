package com.william.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WilliamGoodsAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startPos;

    private int pageSize;

    public WilliamGoodsAttributeExample() {
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

    public WilliamGoodsAttributeExample(int startPos, int pageSize) {
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
            addCriterion("william_goods_attribute.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("william_goods_attribute.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("william_goods_attribute.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("william_goods_attribute.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("william_goods_attribute.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods_attribute.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("william_goods_attribute.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods_attribute.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("william_goods_attribute.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("william_goods_attribute.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("william_goods_attribute.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods_attribute.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("william_goods_attribute.goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("william_goods_attribute.goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("william_goods_attribute.goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("william_goods_attribute.goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("william_goods_attribute.goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("william_goods_attribute.goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("william_goods_attribute.goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("william_goods_attribute.goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("william_goods_attribute.goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("william_goods_attribute.goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIsNull() {
            addCriterion("william_goods_attribute.attribute_name is null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIsNotNull() {
            addCriterion("william_goods_attribute.attribute_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameEqualTo(String value) {
            addCriterion("william_goods_attribute.attribute_name =", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotEqualTo(String value) {
            addCriterion("william_goods_attribute.attribute_name <>", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameGreaterThan(String value) {
            addCriterion("william_goods_attribute.attribute_name >", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.attribute_name >=", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLessThan(String value) {
            addCriterion("william_goods_attribute.attribute_name <", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLessThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.attribute_name <=", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLike(String value) {
            addCriterion("william_goods_attribute.attribute_name like", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotLike(String value) {
            addCriterion("william_goods_attribute.attribute_name not like", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIn(List<String> values) {
            addCriterion("william_goods_attribute.attribute_name in", values, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotIn(List<String> values) {
            addCriterion("william_goods_attribute.attribute_name not in", values, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.attribute_name between", value1, value2, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.attribute_name not between", value1, value2, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIsNull() {
            addCriterion("william_goods_attribute.attribute_value is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIsNotNull() {
            addCriterion("william_goods_attribute.attribute_value is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueEqualTo(String value) {
            addCriterion("william_goods_attribute.attribute_value =", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNotEqualTo(String value) {
            addCriterion("william_goods_attribute.attribute_value <>", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueGreaterThan(String value) {
            addCriterion("william_goods_attribute.attribute_value >", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.attribute_value >=", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueLessThan(String value) {
            addCriterion("william_goods_attribute.attribute_value <", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueLessThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.attribute_value <=", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueLike(String value) {
            addCriterion("william_goods_attribute.attribute_value like", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNotLike(String value) {
            addCriterion("william_goods_attribute.attribute_value not like", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIn(List<String> values) {
            addCriterion("william_goods_attribute.attribute_value in", values, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNotIn(List<String> values) {
            addCriterion("william_goods_attribute.attribute_value not in", values, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.attribute_value between", value1, value2, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNotBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.attribute_value not between", value1, value2, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("william_goods_attribute.create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("william_goods_attribute.create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("william_goods_attribute.create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("william_goods_attribute.create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("william_goods_attribute.create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("william_goods_attribute.create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("william_goods_attribute.create_id like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("william_goods_attribute.create_id not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("william_goods_attribute.create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("william_goods_attribute.create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("william_goods_attribute.create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("william_goods_attribute.create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("william_goods_attribute.create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("william_goods_attribute.create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("william_goods_attribute.create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("william_goods_attribute.create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("william_goods_attribute.create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("william_goods_attribute.create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("william_goods_attribute.create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("william_goods_attribute.create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("william_goods_attribute.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("william_goods_attribute.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("william_goods_attribute.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("william_goods_attribute.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("william_goods_attribute.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_goods_attribute.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("william_goods_attribute.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_goods_attribute.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("william_goods_attribute.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("william_goods_attribute.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("william_goods_attribute.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_goods_attribute.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("william_goods_attribute.mod_id is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("william_goods_attribute.mod_id is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("william_goods_attribute.mod_id =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("william_goods_attribute.mod_id <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("william_goods_attribute.mod_id >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.mod_id >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("william_goods_attribute.mod_id <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.mod_id <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("william_goods_attribute.mod_id like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("william_goods_attribute.mod_id not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("william_goods_attribute.mod_id in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("william_goods_attribute.mod_id not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.mod_id between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.mod_id not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModNameIsNull() {
            addCriterion("william_goods_attribute.mod_name is null");
            return (Criteria) this;
        }

        public Criteria andModNameIsNotNull() {
            addCriterion("william_goods_attribute.mod_name is not null");
            return (Criteria) this;
        }

        public Criteria andModNameEqualTo(String value) {
            addCriterion("william_goods_attribute.mod_name =", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotEqualTo(String value) {
            addCriterion("william_goods_attribute.mod_name <>", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameGreaterThan(String value) {
            addCriterion("william_goods_attribute.mod_name >", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.mod_name >=", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLessThan(String value) {
            addCriterion("william_goods_attribute.mod_name <", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLessThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.mod_name <=", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLike(String value) {
            addCriterion("william_goods_attribute.mod_name like", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotLike(String value) {
            addCriterion("william_goods_attribute.mod_name not like", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameIn(List<String> values) {
            addCriterion("william_goods_attribute.mod_name in", values, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotIn(List<String> values) {
            addCriterion("william_goods_attribute.mod_name not in", values, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.mod_name between", value1, value2, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.mod_name not between", value1, value2, "modName");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("william_goods_attribute.mod_time is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("william_goods_attribute.mod_time is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("william_goods_attribute.mod_time =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("william_goods_attribute.mod_time <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("william_goods_attribute.mod_time >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_goods_attribute.mod_time >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("william_goods_attribute.mod_time <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_goods_attribute.mod_time <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("william_goods_attribute.mod_time in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("william_goods_attribute.mod_time not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("william_goods_attribute.mod_time between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_goods_attribute.mod_time not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("william_goods_attribute.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("william_goods_attribute.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("william_goods_attribute.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("william_goods_attribute.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("william_goods_attribute.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods_attribute.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("william_goods_attribute.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods_attribute.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("william_goods_attribute.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("william_goods_attribute.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_goods_attribute.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods_attribute.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("william_goods_attribute.tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("william_goods_attribute.tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("william_goods_attribute.tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("william_goods_attribute.tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("william_goods_attribute.tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("william_goods_attribute.tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("william_goods_attribute.tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("william_goods_attribute.tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("william_goods_attribute.tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("william_goods_attribute.tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("william_goods_attribute.client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("william_goods_attribute.client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("william_goods_attribute.client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("william_goods_attribute.client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("william_goods_attribute.client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("william_goods_attribute.client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("william_goods_attribute.client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("william_goods_attribute.client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("william_goods_attribute.client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("william_goods_attribute.client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("william_goods_attribute.client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("william_goods_attribute.client not between", value1, value2, "client");
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