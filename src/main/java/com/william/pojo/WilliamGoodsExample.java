package com.william.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WilliamGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startPos;

    private int pageSize;

    public WilliamGoodsExample() {
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

    public WilliamGoodsExample(int startPos, int pageSize) {
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
            addCriterion("william_goods.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("william_goods.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("william_goods.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("william_goods.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("william_goods.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("william_goods.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("william_goods.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("william_goods.id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("william_goods.id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("william_goods.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("william_goods.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("william_goods.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("william_goods.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("william_goods.code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("william_goods.code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("william_goods.code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("william_goods.code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("william_goods.code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("william_goods.code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("william_goods.code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("william_goods.code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("william_goods.code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("william_goods.code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("william_goods.code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("william_goods.code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("william_goods.code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("william_goods.name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("william_goods.name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("william_goods.name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("william_goods.name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("william_goods.name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("william_goods.name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("william_goods.name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("william_goods.name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("william_goods.name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("william_goods.name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("william_goods.name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("william_goods.name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("william_goods.name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("william_goods.title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("william_goods.title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("william_goods.title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("william_goods.title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("william_goods.title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("william_goods.title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("william_goods.title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("william_goods.title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("william_goods.title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("william_goods.title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("william_goods.title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("william_goods.title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("william_goods.title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSellIsNull() {
            addCriterion("william_goods.sell is null");
            return (Criteria) this;
        }

        public Criteria andSellIsNotNull() {
            addCriterion("william_goods.sell is not null");
            return (Criteria) this;
        }

        public Criteria andSellEqualTo(BigDecimal value) {
            addCriterion("william_goods.sell =", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotEqualTo(BigDecimal value) {
            addCriterion("william_goods.sell <>", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellGreaterThan(BigDecimal value) {
            addCriterion("william_goods.sell >", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_goods.sell >=", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellLessThan(BigDecimal value) {
            addCriterion("william_goods.sell <", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_goods.sell <=", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellIn(List<BigDecimal> values) {
            addCriterion("william_goods.sell in", values, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotIn(List<BigDecimal> values) {
            addCriterion("william_goods.sell not in", values, "sell");
            return (Criteria) this;
        }

        public Criteria andSellBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_goods.sell between", value1, value2, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_goods.sell not between", value1, value2, "sell");
            return (Criteria) this;
        }

        public Criteria andMarketSellIsNull() {
            addCriterion("william_goods.market_sell is null");
            return (Criteria) this;
        }

        public Criteria andMarketSellIsNotNull() {
            addCriterion("william_goods.market_sell is not null");
            return (Criteria) this;
        }

        public Criteria andMarketSellEqualTo(BigDecimal value) {
            addCriterion("william_goods.market_sell =", value, "marketSell");
            return (Criteria) this;
        }

        public Criteria andMarketSellNotEqualTo(BigDecimal value) {
            addCriterion("william_goods.market_sell <>", value, "marketSell");
            return (Criteria) this;
        }

        public Criteria andMarketSellGreaterThan(BigDecimal value) {
            addCriterion("william_goods.market_sell >", value, "marketSell");
            return (Criteria) this;
        }

        public Criteria andMarketSellGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_goods.market_sell >=", value, "marketSell");
            return (Criteria) this;
        }

        public Criteria andMarketSellLessThan(BigDecimal value) {
            addCriterion("william_goods.market_sell <", value, "marketSell");
            return (Criteria) this;
        }

        public Criteria andMarketSellLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_goods.market_sell <=", value, "marketSell");
            return (Criteria) this;
        }

        public Criteria andMarketSellIn(List<BigDecimal> values) {
            addCriterion("william_goods.market_sell in", values, "marketSell");
            return (Criteria) this;
        }

        public Criteria andMarketSellNotIn(List<BigDecimal> values) {
            addCriterion("william_goods.market_sell not in", values, "marketSell");
            return (Criteria) this;
        }

        public Criteria andMarketSellBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_goods.market_sell between", value1, value2, "marketSell");
            return (Criteria) this;
        }

        public Criteria andMarketSellNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_goods.market_sell not between", value1, value2, "marketSell");
            return (Criteria) this;
        }

        public Criteria andBaseValueIsNull() {
            addCriterion("william_goods.base_value is null");
            return (Criteria) this;
        }

        public Criteria andBaseValueIsNotNull() {
            addCriterion("william_goods.base_value is not null");
            return (Criteria) this;
        }

        public Criteria andBaseValueEqualTo(BigDecimal value) {
            addCriterion("william_goods.base_value =", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueNotEqualTo(BigDecimal value) {
            addCriterion("william_goods.base_value <>", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueGreaterThan(BigDecimal value) {
            addCriterion("william_goods.base_value >", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_goods.base_value >=", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueLessThan(BigDecimal value) {
            addCriterion("william_goods.base_value <", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_goods.base_value <=", value, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueIn(List<BigDecimal> values) {
            addCriterion("william_goods.base_value in", values, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueNotIn(List<BigDecimal> values) {
            addCriterion("william_goods.base_value not in", values, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_goods.base_value between", value1, value2, "baseValue");
            return (Criteria) this;
        }

        public Criteria andBaseValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_goods.base_value not between", value1, value2, "baseValue");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("william_goods.discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("william_goods.discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("william_goods.discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("william_goods.discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("william_goods.discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_goods.discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("william_goods.discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_goods.discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("william_goods.discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("william_goods.discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_goods.discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_goods.discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andSellTotalIsNull() {
            addCriterion("william_goods.sell_total is null");
            return (Criteria) this;
        }

        public Criteria andSellTotalIsNotNull() {
            addCriterion("william_goods.sell_total is not null");
            return (Criteria) this;
        }

        public Criteria andSellTotalEqualTo(Integer value) {
            addCriterion("william_goods.sell_total =", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalNotEqualTo(Integer value) {
            addCriterion("william_goods.sell_total <>", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalGreaterThan(Integer value) {
            addCriterion("william_goods.sell_total >", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.sell_total >=", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalLessThan(Integer value) {
            addCriterion("william_goods.sell_total <", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.sell_total <=", value, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalIn(List<Integer> values) {
            addCriterion("william_goods.sell_total in", values, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalNotIn(List<Integer> values) {
            addCriterion("william_goods.sell_total not in", values, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.sell_total between", value1, value2, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.sell_total not between", value1, value2, "sellTotal");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalIsNull() {
            addCriterion("william_goods.sell_value_total is null");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalIsNotNull() {
            addCriterion("william_goods.sell_value_total is not null");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalEqualTo(BigDecimal value) {
            addCriterion("william_goods.sell_value_total =", value, "sellValueTotal");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalNotEqualTo(BigDecimal value) {
            addCriterion("william_goods.sell_value_total <>", value, "sellValueTotal");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalGreaterThan(BigDecimal value) {
            addCriterion("william_goods.sell_value_total >", value, "sellValueTotal");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_goods.sell_value_total >=", value, "sellValueTotal");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalLessThan(BigDecimal value) {
            addCriterion("william_goods.sell_value_total <", value, "sellValueTotal");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_goods.sell_value_total <=", value, "sellValueTotal");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalIn(List<BigDecimal> values) {
            addCriterion("william_goods.sell_value_total in", values, "sellValueTotal");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalNotIn(List<BigDecimal> values) {
            addCriterion("william_goods.sell_value_total not in", values, "sellValueTotal");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_goods.sell_value_total between", value1, value2, "sellValueTotal");
            return (Criteria) this;
        }

        public Criteria andSellValueTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_goods.sell_value_total not between", value1, value2, "sellValueTotal");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNull() {
            addCriterion("william_goods.exchange_type is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNotNull() {
            addCriterion("william_goods.exchange_type is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeEqualTo(Integer value) {
            addCriterion("william_goods.exchange_type =", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotEqualTo(Integer value) {
            addCriterion("william_goods.exchange_type <>", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThan(Integer value) {
            addCriterion("william_goods.exchange_type >", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.exchange_type >=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThan(Integer value) {
            addCriterion("william_goods.exchange_type <", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.exchange_type <=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIn(List<Integer> values) {
            addCriterion("william_goods.exchange_type in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotIn(List<Integer> values) {
            addCriterion("william_goods.exchange_type not in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.exchange_type between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.exchange_type not between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangePointIsNull() {
            addCriterion("william_goods.exchange_point is null");
            return (Criteria) this;
        }

        public Criteria andExchangePointIsNotNull() {
            addCriterion("william_goods.exchange_point is not null");
            return (Criteria) this;
        }

        public Criteria andExchangePointEqualTo(Integer value) {
            addCriterion("william_goods.exchange_point =", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointNotEqualTo(Integer value) {
            addCriterion("william_goods.exchange_point <>", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointGreaterThan(Integer value) {
            addCriterion("william_goods.exchange_point >", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.exchange_point >=", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointLessThan(Integer value) {
            addCriterion("william_goods.exchange_point <", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.exchange_point <=", value, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointIn(List<Integer> values) {
            addCriterion("william_goods.exchange_point in", values, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointNotIn(List<Integer> values) {
            addCriterion("william_goods.exchange_point not in", values, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.exchange_point between", value1, value2, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andExchangePointNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.exchange_point not between", value1, value2, "exchangePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointIsNull() {
            addCriterion("william_goods.give_point is null");
            return (Criteria) this;
        }

        public Criteria andGivePointIsNotNull() {
            addCriterion("william_goods.give_point is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointEqualTo(Integer value) {
            addCriterion("william_goods.give_point =", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotEqualTo(Integer value) {
            addCriterion("william_goods.give_point <>", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointGreaterThan(Integer value) {
            addCriterion("william_goods.give_point >", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.give_point >=", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointLessThan(Integer value) {
            addCriterion("william_goods.give_point <", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.give_point <=", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointIn(List<Integer> values) {
            addCriterion("william_goods.give_point in", values, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotIn(List<Integer> values) {
            addCriterion("william_goods.give_point not in", values, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.give_point between", value1, value2, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.give_point not between", value1, value2, "givePoint");
            return (Criteria) this;
        }

        public Criteria andUserPointIsNull() {
            addCriterion("william_goods.user_point is null");
            return (Criteria) this;
        }

        public Criteria andUserPointIsNotNull() {
            addCriterion("william_goods.user_point is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointEqualTo(Integer value) {
            addCriterion("william_goods.user_point =", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotEqualTo(Integer value) {
            addCriterion("william_goods.user_point <>", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointGreaterThan(Integer value) {
            addCriterion("william_goods.user_point >", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.user_point >=", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointLessThan(Integer value) {
            addCriterion("william_goods.user_point <", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.user_point <=", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointIn(List<Integer> values) {
            addCriterion("william_goods.user_point in", values, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotIn(List<Integer> values) {
            addCriterion("william_goods.user_point not in", values, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.user_point between", value1, value2, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.user_point not between", value1, value2, "userPoint");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("william_goods.total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("william_goods.total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("william_goods.total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("william_goods.total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("william_goods.total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("william_goods.total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("william_goods.total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("william_goods.total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andResidueIsNull() {
            addCriterion("william_goods.residue is null");
            return (Criteria) this;
        }

        public Criteria andResidueIsNotNull() {
            addCriterion("william_goods.residue is not null");
            return (Criteria) this;
        }

        public Criteria andResidueEqualTo(Integer value) {
            addCriterion("william_goods.residue =", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueNotEqualTo(Integer value) {
            addCriterion("william_goods.residue <>", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueGreaterThan(Integer value) {
            addCriterion("william_goods.residue >", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.residue >=", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueLessThan(Integer value) {
            addCriterion("william_goods.residue <", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.residue <=", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueIn(List<Integer> values) {
            addCriterion("william_goods.residue in", values, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueNotIn(List<Integer> values) {
            addCriterion("william_goods.residue not in", values, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.residue between", value1, value2, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.residue not between", value1, value2, "residue");
            return (Criteria) this;
        }

        public Criteria andMonthSellIsNull() {
            addCriterion("william_goods.month_sell is null");
            return (Criteria) this;
        }

        public Criteria andMonthSellIsNotNull() {
            addCriterion("william_goods.month_sell is not null");
            return (Criteria) this;
        }

        public Criteria andMonthSellEqualTo(Integer value) {
            addCriterion("william_goods.month_sell =", value, "monthSell");
            return (Criteria) this;
        }

        public Criteria andMonthSellNotEqualTo(Integer value) {
            addCriterion("william_goods.month_sell <>", value, "monthSell");
            return (Criteria) this;
        }

        public Criteria andMonthSellGreaterThan(Integer value) {
            addCriterion("william_goods.month_sell >", value, "monthSell");
            return (Criteria) this;
        }

        public Criteria andMonthSellGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.month_sell >=", value, "monthSell");
            return (Criteria) this;
        }

        public Criteria andMonthSellLessThan(Integer value) {
            addCriterion("william_goods.month_sell <", value, "monthSell");
            return (Criteria) this;
        }

        public Criteria andMonthSellLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.month_sell <=", value, "monthSell");
            return (Criteria) this;
        }

        public Criteria andMonthSellIn(List<Integer> values) {
            addCriterion("william_goods.month_sell in", values, "monthSell");
            return (Criteria) this;
        }

        public Criteria andMonthSellNotIn(List<Integer> values) {
            addCriterion("william_goods.month_sell not in", values, "monthSell");
            return (Criteria) this;
        }

        public Criteria andMonthSellBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.month_sell between", value1, value2, "monthSell");
            return (Criteria) this;
        }

        public Criteria andMonthSellNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.month_sell not between", value1, value2, "monthSell");
            return (Criteria) this;
        }

        public Criteria andServiceTagsIsNull() {
            addCriterion("william_goods.service_tags is null");
            return (Criteria) this;
        }

        public Criteria andServiceTagsIsNotNull() {
            addCriterion("william_goods.service_tags is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTagsEqualTo(String value) {
            addCriterion("william_goods.service_tags =", value, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsNotEqualTo(String value) {
            addCriterion("william_goods.service_tags <>", value, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsGreaterThan(String value) {
            addCriterion("william_goods.service_tags >", value, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.service_tags >=", value, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsLessThan(String value) {
            addCriterion("william_goods.service_tags <", value, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsLessThanOrEqualTo(String value) {
            addCriterion("william_goods.service_tags <=", value, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsLike(String value) {
            addCriterion("william_goods.service_tags like", value, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsNotLike(String value) {
            addCriterion("william_goods.service_tags not like", value, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsIn(List<String> values) {
            addCriterion("william_goods.service_tags in", values, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsNotIn(List<String> values) {
            addCriterion("william_goods.service_tags not in", values, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsBetween(String value1, String value2) {
            addCriterion("william_goods.service_tags between", value1, value2, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andServiceTagsNotBetween(String value1, String value2) {
            addCriterion("william_goods.service_tags not between", value1, value2, "serviceTags");
            return (Criteria) this;
        }

        public Criteria andFavoriteIsNull() {
            addCriterion("william_goods.favorite is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteIsNotNull() {
            addCriterion("william_goods.favorite is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteEqualTo(Integer value) {
            addCriterion("william_goods.favorite =", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotEqualTo(Integer value) {
            addCriterion("william_goods.favorite <>", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteGreaterThan(Integer value) {
            addCriterion("william_goods.favorite >", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.favorite >=", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteLessThan(Integer value) {
            addCriterion("william_goods.favorite <", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.favorite <=", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteIn(List<Integer> values) {
            addCriterion("william_goods.favorite in", values, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotIn(List<Integer> values) {
            addCriterion("william_goods.favorite not in", values, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.favorite between", value1, value2, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.favorite not between", value1, value2, "favorite");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("william_goods.category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("william_goods.category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("william_goods.category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("william_goods.category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("william_goods.category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("william_goods.category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("william_goods.category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("william_goods.category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdIsNull() {
            addCriterion("william_goods.title_category_id is null");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdIsNotNull() {
            addCriterion("william_goods.title_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdEqualTo(Integer value) {
            addCriterion("william_goods.title_category_id =", value, "titleCategoryId");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdNotEqualTo(Integer value) {
            addCriterion("william_goods.title_category_id <>", value, "titleCategoryId");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdGreaterThan(Integer value) {
            addCriterion("william_goods.title_category_id >", value, "titleCategoryId");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.title_category_id >=", value, "titleCategoryId");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdLessThan(Integer value) {
            addCriterion("william_goods.title_category_id <", value, "titleCategoryId");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.title_category_id <=", value, "titleCategoryId");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdIn(List<Integer> values) {
            addCriterion("william_goods.title_category_id in", values, "titleCategoryId");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdNotIn(List<Integer> values) {
            addCriterion("william_goods.title_category_id not in", values, "titleCategoryId");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.title_category_id between", value1, value2, "titleCategoryId");
            return (Criteria) this;
        }

        public Criteria andTitleCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.title_category_id not between", value1, value2, "titleCategoryId");
            return (Criteria) this;
        }

        public Criteria andPutawayIsNull() {
            addCriterion("william_goods.putaway is null");
            return (Criteria) this;
        }

        public Criteria andPutawayIsNotNull() {
            addCriterion("william_goods.putaway is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayEqualTo(Integer value) {
            addCriterion("william_goods.putaway =", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayNotEqualTo(Integer value) {
            addCriterion("william_goods.putaway <>", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayGreaterThan(Integer value) {
            addCriterion("william_goods.putaway >", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.putaway >=", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayLessThan(Integer value) {
            addCriterion("william_goods.putaway <", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.putaway <=", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayIn(List<Integer> values) {
            addCriterion("william_goods.putaway in", values, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayNotIn(List<Integer> values) {
            addCriterion("william_goods.putaway not in", values, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.putaway between", value1, value2, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.putaway not between", value1, value2, "putaway");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNull() {
            addCriterion("william_goods.describes is null");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNotNull() {
            addCriterion("william_goods.describes is not null");
            return (Criteria) this;
        }

        public Criteria andDescribesEqualTo(String value) {
            addCriterion("william_goods.describes =", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotEqualTo(String value) {
            addCriterion("william_goods.describes <>", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThan(String value) {
            addCriterion("william_goods.describes >", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.describes >=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThan(String value) {
            addCriterion("william_goods.describes <", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThanOrEqualTo(String value) {
            addCriterion("william_goods.describes <=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLike(String value) {
            addCriterion("william_goods.describes like", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotLike(String value) {
            addCriterion("william_goods.describes not like", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesIn(List<String> values) {
            addCriterion("william_goods.describes in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotIn(List<String> values) {
            addCriterion("william_goods.describes not in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesBetween(String value1, String value2) {
            addCriterion("william_goods.describes between", value1, value2, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotBetween(String value1, String value2) {
            addCriterion("william_goods.describes not between", value1, value2, "describes");
            return (Criteria) this;
        }

        public Criteria andImgsIsNull() {
            addCriterion("william_goods.imgs is null");
            return (Criteria) this;
        }

        public Criteria andImgsIsNotNull() {
            addCriterion("william_goods.imgs is not null");
            return (Criteria) this;
        }

        public Criteria andImgsEqualTo(String value) {
            addCriterion("william_goods.imgs =", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotEqualTo(String value) {
            addCriterion("william_goods.imgs <>", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsGreaterThan(String value) {
            addCriterion("william_goods.imgs >", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.imgs >=", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsLessThan(String value) {
            addCriterion("william_goods.imgs <", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsLessThanOrEqualTo(String value) {
            addCriterion("william_goods.imgs <=", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsLike(String value) {
            addCriterion("william_goods.imgs like", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotLike(String value) {
            addCriterion("william_goods.imgs not like", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsIn(List<String> values) {
            addCriterion("william_goods.imgs in", values, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotIn(List<String> values) {
            addCriterion("william_goods.imgs not in", values, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsBetween(String value1, String value2) {
            addCriterion("william_goods.imgs between", value1, value2, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotBetween(String value1, String value2) {
            addCriterion("william_goods.imgs not between", value1, value2, "imgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsIsNull() {
            addCriterion("william_goods.detail_banner_imgs is null");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsIsNotNull() {
            addCriterion("william_goods.detail_banner_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsEqualTo(String value) {
            addCriterion("william_goods.detail_banner_imgs =", value, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsNotEqualTo(String value) {
            addCriterion("william_goods.detail_banner_imgs <>", value, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsGreaterThan(String value) {
            addCriterion("william_goods.detail_banner_imgs >", value, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.detail_banner_imgs >=", value, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsLessThan(String value) {
            addCriterion("william_goods.detail_banner_imgs <", value, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsLessThanOrEqualTo(String value) {
            addCriterion("william_goods.detail_banner_imgs <=", value, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsLike(String value) {
            addCriterion("william_goods.detail_banner_imgs like", value, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsNotLike(String value) {
            addCriterion("william_goods.detail_banner_imgs not like", value, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsIn(List<String> values) {
            addCriterion("william_goods.detail_banner_imgs in", values, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsNotIn(List<String> values) {
            addCriterion("william_goods.detail_banner_imgs not in", values, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsBetween(String value1, String value2) {
            addCriterion("william_goods.detail_banner_imgs between", value1, value2, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailBannerImgsNotBetween(String value1, String value2) {
            addCriterion("william_goods.detail_banner_imgs not between", value1, value2, "detailBannerImgs");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("william_goods.detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("william_goods.detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("william_goods.detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("william_goods.detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("william_goods.detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("william_goods.detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("william_goods.detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("william_goods.detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("william_goods.detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("william_goods.detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("william_goods.detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("william_goods.detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("william_goods.detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("william_goods.goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("william_goods.goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(Integer value) {
            addCriterion("william_goods.goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Integer value) {
            addCriterion("william_goods.goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Integer value) {
            addCriterion("william_goods.goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Integer value) {
            addCriterion("william_goods.goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Integer> values) {
            addCriterion("william_goods.goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Integer> values) {
            addCriterion("william_goods.goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andMaxBuyIsNull() {
            addCriterion("william_goods.max_buy is null");
            return (Criteria) this;
        }

        public Criteria andMaxBuyIsNotNull() {
            addCriterion("william_goods.max_buy is not null");
            return (Criteria) this;
        }

        public Criteria andMaxBuyEqualTo(Integer value) {
            addCriterion("william_goods.max_buy =", value, "maxBuy");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNotEqualTo(Integer value) {
            addCriterion("william_goods.max_buy <>", value, "maxBuy");
            return (Criteria) this;
        }

        public Criteria andMaxBuyGreaterThan(Integer value) {
            addCriterion("william_goods.max_buy >", value, "maxBuy");
            return (Criteria) this;
        }

        public Criteria andMaxBuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.max_buy >=", value, "maxBuy");
            return (Criteria) this;
        }

        public Criteria andMaxBuyLessThan(Integer value) {
            addCriterion("william_goods.max_buy <", value, "maxBuy");
            return (Criteria) this;
        }

        public Criteria andMaxBuyLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.max_buy <=", value, "maxBuy");
            return (Criteria) this;
        }

        public Criteria andMaxBuyIn(List<Integer> values) {
            addCriterion("william_goods.max_buy in", values, "maxBuy");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNotIn(List<Integer> values) {
            addCriterion("william_goods.max_buy not in", values, "maxBuy");
            return (Criteria) this;
        }

        public Criteria andMaxBuyBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.max_buy between", value1, value2, "maxBuy");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.max_buy not between", value1, value2, "maxBuy");
            return (Criteria) this;
        }

        public Criteria andShipAddressIsNull() {
            addCriterion("william_goods.ship_address is null");
            return (Criteria) this;
        }

        public Criteria andShipAddressIsNotNull() {
            addCriterion("william_goods.ship_address is not null");
            return (Criteria) this;
        }

        public Criteria andShipAddressEqualTo(String value) {
            addCriterion("william_goods.ship_address =", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotEqualTo(String value) {
            addCriterion("william_goods.ship_address <>", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressGreaterThan(String value) {
            addCriterion("william_goods.ship_address >", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.ship_address >=", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressLessThan(String value) {
            addCriterion("william_goods.ship_address <", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressLessThanOrEqualTo(String value) {
            addCriterion("william_goods.ship_address <=", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressLike(String value) {
            addCriterion("william_goods.ship_address like", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotLike(String value) {
            addCriterion("william_goods.ship_address not like", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressIn(List<String> values) {
            addCriterion("william_goods.ship_address in", values, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotIn(List<String> values) {
            addCriterion("william_goods.ship_address not in", values, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressBetween(String value1, String value2) {
            addCriterion("william_goods.ship_address between", value1, value2, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotBetween(String value1, String value2) {
            addCriterion("william_goods.ship_address not between", value1, value2, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("william_goods.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("william_goods.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("william_goods.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("william_goods.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("william_goods.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_goods.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("william_goods.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_goods.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("william_goods.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("william_goods.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_goods.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("william_goods.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("william_goods.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("william_goods.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("william_goods.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("william_goods.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_goods.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("william_goods.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_goods.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("william_goods.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("william_goods.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("william_goods.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_goods.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("william_goods.create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("william_goods.create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("william_goods.create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("william_goods.create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("william_goods.create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("william_goods.create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("william_goods.create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("william_goods.create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("william_goods.create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("william_goods.create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("william_goods.create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("william_goods.create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("william_goods.create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("william_goods.create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("william_goods.create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("william_goods.create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("william_goods.create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("william_goods.create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("william_goods.create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("william_goods.create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("william_goods.create_id like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("william_goods.create_id not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("william_goods.create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("william_goods.create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("william_goods.create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("william_goods.create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("william_goods.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("william_goods.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("william_goods.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("william_goods.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("william_goods.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_goods.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("william_goods.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_goods.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("william_goods.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("william_goods.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("william_goods.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_goods.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNull() {
            addCriterion("william_goods.update_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNotNull() {
            addCriterion("william_goods.update_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameEqualTo(String value) {
            addCriterion("william_goods.update_name =", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotEqualTo(String value) {
            addCriterion("william_goods.update_name <>", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThan(String value) {
            addCriterion("william_goods.update_name >", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.update_name >=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThan(String value) {
            addCriterion("william_goods.update_name <", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThanOrEqualTo(String value) {
            addCriterion("william_goods.update_name <=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLike(String value) {
            addCriterion("william_goods.update_name like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotLike(String value) {
            addCriterion("william_goods.update_name not like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIn(List<String> values) {
            addCriterion("william_goods.update_name in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotIn(List<String> values) {
            addCriterion("william_goods.update_name not in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameBetween(String value1, String value2) {
            addCriterion("william_goods.update_name between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotBetween(String value1, String value2) {
            addCriterion("william_goods.update_name not between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("william_goods.update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("william_goods.update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(String value) {
            addCriterion("william_goods.update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(String value) {
            addCriterion("william_goods.update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(String value) {
            addCriterion("william_goods.update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(String value) {
            addCriterion("william_goods.update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("william_goods.update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLike(String value) {
            addCriterion("william_goods.update_id like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotLike(String value) {
            addCriterion("william_goods.update_id not like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<String> values) {
            addCriterion("william_goods.update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<String> values) {
            addCriterion("william_goods.update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(String value1, String value2) {
            addCriterion("william_goods.update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(String value1, String value2) {
            addCriterion("william_goods.update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("william_goods.tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("william_goods.tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("william_goods.tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("william_goods.tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("william_goods.tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("william_goods.tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("william_goods.tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("william_goods.tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("william_goods.tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("william_goods.tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("william_goods.tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("william_goods.tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("william_goods.tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("william_goods.client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("william_goods.client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("william_goods.client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("william_goods.client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("william_goods.client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("william_goods.client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("william_goods.client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("william_goods.client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("william_goods.client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("william_goods.client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("william_goods.client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("william_goods.client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("william_goods.client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("william_goods.client not between", value1, value2, "client");
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