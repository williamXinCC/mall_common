package com.william.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WilliamProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WilliamProductExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(String value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(String value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(String value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(String value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(String value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(String value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLike(String value) {
            addCriterion("b_id like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotLike(String value) {
            addCriterion("b_id not like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<String> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<String> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(String value1, String value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(String value1, String value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBChNameIsNull() {
            addCriterion("b_ch_name is null");
            return (Criteria) this;
        }

        public Criteria andBChNameIsNotNull() {
            addCriterion("b_ch_name is not null");
            return (Criteria) this;
        }

        public Criteria andBChNameEqualTo(String value) {
            addCriterion("b_ch_name =", value, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameNotEqualTo(String value) {
            addCriterion("b_ch_name <>", value, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameGreaterThan(String value) {
            addCriterion("b_ch_name >", value, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameGreaterThanOrEqualTo(String value) {
            addCriterion("b_ch_name >=", value, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameLessThan(String value) {
            addCriterion("b_ch_name <", value, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameLessThanOrEqualTo(String value) {
            addCriterion("b_ch_name <=", value, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameLike(String value) {
            addCriterion("b_ch_name like", value, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameNotLike(String value) {
            addCriterion("b_ch_name not like", value, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameIn(List<String> values) {
            addCriterion("b_ch_name in", values, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameNotIn(List<String> values) {
            addCriterion("b_ch_name not in", values, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameBetween(String value1, String value2) {
            addCriterion("b_ch_name between", value1, value2, "bChName");
            return (Criteria) this;
        }

        public Criteria andBChNameNotBetween(String value1, String value2) {
            addCriterion("b_ch_name not between", value1, value2, "bChName");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andListImageIsNull() {
            addCriterion("list_image is null");
            return (Criteria) this;
        }

        public Criteria andListImageIsNotNull() {
            addCriterion("list_image is not null");
            return (Criteria) this;
        }

        public Criteria andListImageEqualTo(String value) {
            addCriterion("list_image =", value, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageNotEqualTo(String value) {
            addCriterion("list_image <>", value, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageGreaterThan(String value) {
            addCriterion("list_image >", value, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageGreaterThanOrEqualTo(String value) {
            addCriterion("list_image >=", value, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageLessThan(String value) {
            addCriterion("list_image <", value, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageLessThanOrEqualTo(String value) {
            addCriterion("list_image <=", value, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageLike(String value) {
            addCriterion("list_image like", value, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageNotLike(String value) {
            addCriterion("list_image not like", value, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageIn(List<String> values) {
            addCriterion("list_image in", values, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageNotIn(List<String> values) {
            addCriterion("list_image not in", values, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageBetween(String value1, String value2) {
            addCriterion("list_image between", value1, value2, "listImage");
            return (Criteria) this;
        }

        public Criteria andListImageNotBetween(String value1, String value2) {
            addCriterion("list_image not between", value1, value2, "listImage");
            return (Criteria) this;
        }

        public Criteria andListPriceIsNull() {
            addCriterion("list_price is null");
            return (Criteria) this;
        }

        public Criteria andListPriceIsNotNull() {
            addCriterion("list_price is not null");
            return (Criteria) this;
        }

        public Criteria andListPriceEqualTo(BigDecimal value) {
            addCriterion("list_price =", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotEqualTo(BigDecimal value) {
            addCriterion("list_price <>", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceGreaterThan(BigDecimal value) {
            addCriterion("list_price >", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("list_price >=", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLessThan(BigDecimal value) {
            addCriterion("list_price <", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("list_price <=", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceIn(List<BigDecimal> values) {
            addCriterion("list_price in", values, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotIn(List<BigDecimal> values) {
            addCriterion("list_price not in", values, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("list_price between", value1, value2, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("list_price not between", value1, value2, "listPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andBaseValueIsNull() {
            addCriterion("base_value is null");
            return (Criteria) this;
        }

        public Criteria andBaseValueIsNotNull() {
            addCriterion("base_value is not null");
            return (Criteria) this;
        }

        public Criteria andBaseValueEqualTo(BigDecimal value) {
            addCriterion("base_value =", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueNotEqualTo(BigDecimal value) {
            addCriterion("base_value <>", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueGreaterThan(BigDecimal value) {
            addCriterion("base_value >", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_value >=", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueLessThan(BigDecimal value) {
            addCriterion("base_value <", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_value <=", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueIn(List<BigDecimal> values) {
            addCriterion("base_value in", values, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueNotIn(List<BigDecimal> values) {
            addCriterion("base_value not in", values, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_value between", value1, value2, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_value not between", value1, value2, "baseValue");
            return (Criteria) this;
        }

        public Criteria andSellTotalIsNull() {
            addCriterion("sell_total is null");
            return (Criteria) this;
        }

        public Criteria andSellTotalIsNotNull() {
            addCriterion("sell_total is not null");
            return (Criteria) this;
        }

        public Criteria andSellTotalEqualTo(Integer value) {
            addCriterion("sell_total =", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalNotEqualTo(Integer value) {
            addCriterion("sell_total <>", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalGreaterThan(Integer value) {
            addCriterion("sell_total >", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_total >=", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalLessThan(Integer value) {
            addCriterion("sell_total <", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalLessThanOrEqualTo(Integer value) {
            addCriterion("sell_total <=", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalIn(List<Integer> values) {
            addCriterion("sell_total in", values, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalNotIn(List<Integer> values) {
            addCriterion("sell_total not in", values, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalBetween(Integer value1, Integer value2) {
            addCriterion("sell_total between", value1, value2, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_total not between", value1, value2, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNull() {
            addCriterion("exchange_type is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNotNull() {
            addCriterion("exchange_type is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeEqualTo(Integer value) {
            addCriterion("exchange_type =", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotEqualTo(Integer value) {
            addCriterion("exchange_type <>", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThan(Integer value) {
            addCriterion("exchange_type >", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_type >=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThan(Integer value) {
            addCriterion("exchange_type <", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_type <=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIn(List<Integer> values) {
            addCriterion("exchange_type in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotIn(List<Integer> values) {
            addCriterion("exchange_type not in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeBetween(Integer value1, Integer value2) {
            addCriterion("exchange_type between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_type not between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangePointIsNull() {
            addCriterion("exchange_point is null");
            return (Criteria) this;
        }

        public Criteria andExchangePointIsNotNull() {
            addCriterion("exchange_point is not null");
            return (Criteria) this;
        }

        public Criteria andExchangePointEqualTo(Integer value) {
            addCriterion("exchange_point =", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointNotEqualTo(Integer value) {
            addCriterion("exchange_point <>", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointGreaterThan(Integer value) {
            addCriterion("exchange_point >", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_point >=", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointLessThan(Integer value) {
            addCriterion("exchange_point <", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_point <=", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointIn(List<Integer> values) {
            addCriterion("exchange_point in", values, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointNotIn(List<Integer> values) {
            addCriterion("exchange_point not in", values, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointBetween(Integer value1, Integer value2) {
            addCriterion("exchange_point between", value1, value2, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_point not between", value1, value2, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointIsNull() {
            addCriterion("give_point is null");
            return (Criteria) this;
        }

        public Criteria andGivePointIsNotNull() {
            addCriterion("give_point is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointEqualTo(Integer value) {
            addCriterion("give_point =", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotEqualTo(Integer value) {
            addCriterion("give_point <>", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointGreaterThan(Integer value) {
            addCriterion("give_point >", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_point >=", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointLessThan(Integer value) {
            addCriterion("give_point <", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointLessThanOrEqualTo(Integer value) {
            addCriterion("give_point <=", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointIn(List<Integer> values) {
            addCriterion("give_point in", values, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotIn(List<Integer> values) {
            addCriterion("give_point not in", values, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointBetween(Integer value1, Integer value2) {
            addCriterion("give_point between", value1, value2, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotBetween(Integer value1, Integer value2) {
            addCriterion("give_point not between", value1, value2, "givePoint");
            return (Criteria) this;
        }

        public Criteria andUsePointIsNull() {
            addCriterion("use_point is null");
            return (Criteria) this;
        }

        public Criteria andUsePointIsNotNull() {
            addCriterion("use_point is not null");
            return (Criteria) this;
        }

        public Criteria andUsePointEqualTo(Integer value) {
            addCriterion("use_point =", value, "usePoint");
            return (Criteria) this;
        }

        public Criteria andUsePointNotEqualTo(Integer value) {
            addCriterion("use_point <>", value, "usePoint");
            return (Criteria) this;
        }

        public Criteria andUsePointGreaterThan(Integer value) {
            addCriterion("use_point >", value, "usePoint");
            return (Criteria) this;
        }

        public Criteria andUsePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_point >=", value, "usePoint");
            return (Criteria) this;
        }

        public Criteria andUsePointLessThan(Integer value) {
            addCriterion("use_point <", value, "usePoint");
            return (Criteria) this;
        }

        public Criteria andUsePointLessThanOrEqualTo(Integer value) {
            addCriterion("use_point <=", value, "usePoint");
            return (Criteria) this;
        }

        public Criteria andUsePointIn(List<Integer> values) {
            addCriterion("use_point in", values, "usePoint");
            return (Criteria) this;
        }

        public Criteria andUsePointNotIn(List<Integer> values) {
            addCriterion("use_point not in", values, "usePoint");
            return (Criteria) this;
        }

        public Criteria andUsePointBetween(Integer value1, Integer value2) {
            addCriterion("use_point between", value1, value2, "usePoint");
            return (Criteria) this;
        }

        public Criteria andUsePointNotBetween(Integer value1, Integer value2) {
            addCriterion("use_point not between", value1, value2, "usePoint");
            return (Criteria) this;
        }

        public Criteria andFavoriteIsNull() {
            addCriterion("favorite is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteIsNotNull() {
            addCriterion("favorite is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteEqualTo(Integer value) {
            addCriterion("favorite =", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotEqualTo(Integer value) {
            addCriterion("favorite <>", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteGreaterThan(Integer value) {
            addCriterion("favorite >", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteGreaterThanOrEqualTo(Integer value) {
            addCriterion("favorite >=", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteLessThan(Integer value) {
            addCriterion("favorite <", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteLessThanOrEqualTo(Integer value) {
            addCriterion("favorite <=", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteIn(List<Integer> values) {
            addCriterion("favorite in", values, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotIn(List<Integer> values) {
            addCriterion("favorite not in", values, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteBetween(Integer value1, Integer value2) {
            addCriterion("favorite between", value1, value2, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotBetween(Integer value1, Integer value2) {
            addCriterion("favorite not between", value1, value2, "favorite");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeIsNull() {
            addCriterion("guess_ulike is null");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeIsNotNull() {
            addCriterion("guess_ulike is not null");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeEqualTo(Integer value) {
            addCriterion("guess_ulike =", value, "guessUlike");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeNotEqualTo(Integer value) {
            addCriterion("guess_ulike <>", value, "guessUlike");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeGreaterThan(Integer value) {
            addCriterion("guess_ulike >", value, "guessUlike");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("guess_ulike >=", value, "guessUlike");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeLessThan(Integer value) {
            addCriterion("guess_ulike <", value, "guessUlike");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeLessThanOrEqualTo(Integer value) {
            addCriterion("guess_ulike <=", value, "guessUlike");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeIn(List<Integer> values) {
            addCriterion("guess_ulike in", values, "guessUlike");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeNotIn(List<Integer> values) {
            addCriterion("guess_ulike not in", values, "guessUlike");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeBetween(Integer value1, Integer value2) {
            addCriterion("guess_ulike between", value1, value2, "guessUlike");
            return (Criteria) this;
        }

        public Criteria andGuessUlikeNotBetween(Integer value1, Integer value2) {
            addCriterion("guess_ulike not between", value1, value2, "guessUlike");
            return (Criteria) this;
        }

        public Criteria andPutawayIsNull() {
            addCriterion("putaway is null");
            return (Criteria) this;
        }

        public Criteria andPutawayIsNotNull() {
            addCriterion("putaway is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayEqualTo(Integer value) {
            addCriterion("putaway =", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayNotEqualTo(Integer value) {
            addCriterion("putaway <>", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayGreaterThan(Integer value) {
            addCriterion("putaway >", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayGreaterThanOrEqualTo(Integer value) {
            addCriterion("putaway >=", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayLessThan(Integer value) {
            addCriterion("putaway <", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayLessThanOrEqualTo(Integer value) {
            addCriterion("putaway <=", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayIn(List<Integer> values) {
            addCriterion("putaway in", values, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayNotIn(List<Integer> values) {
            addCriterion("putaway not in", values, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayBetween(Integer value1, Integer value2) {
            addCriterion("putaway between", value1, value2, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayNotBetween(Integer value1, Integer value2) {
            addCriterion("putaway not between", value1, value2, "putaway");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNull() {
            addCriterion("describes is null");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNotNull() {
            addCriterion("describes is not null");
            return (Criteria) this;
        }

        public Criteria andDescribesEqualTo(String value) {
            addCriterion("describes =", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotEqualTo(String value) {
            addCriterion("describes <>", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThan(String value) {
            addCriterion("describes >", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThanOrEqualTo(String value) {
            addCriterion("describes >=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThan(String value) {
            addCriterion("describes <", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThanOrEqualTo(String value) {
            addCriterion("describes <=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLike(String value) {
            addCriterion("describes like", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotLike(String value) {
            addCriterion("describes not like", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesIn(List<String> values) {
            addCriterion("describes in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotIn(List<String> values) {
            addCriterion("describes not in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesBetween(String value1, String value2) {
            addCriterion("describes between", value1, value2, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotBetween(String value1, String value2) {
            addCriterion("describes not between", value1, value2, "describes");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("create_id like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("create_id not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("mod_id is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("mod_id is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("mod_id =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("mod_id <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("mod_id >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("mod_id >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("mod_id <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("mod_id <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("mod_id like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("mod_id not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("mod_id in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("mod_id not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("mod_id between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("mod_id not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("mod_time is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("mod_time is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("mod_time =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("mod_time <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("mod_time >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mod_time >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("mod_time <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("mod_time <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("mod_time in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("mod_time not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("mod_time between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("mod_time not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("client not between", value1, value2, "client");
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