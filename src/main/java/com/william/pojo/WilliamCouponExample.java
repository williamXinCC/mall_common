package com.william.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WilliamCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startPos;

    private int pageSize;

    public WilliamCouponExample() {
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

    public WilliamCouponExample(int startPos, int pageSize) {
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
            addCriterion("william_coupon.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("william_coupon.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("william_coupon.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("william_coupon.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("william_coupon.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("william_coupon.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("william_coupon.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("william_coupon.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("william_coupon.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("william_coupon.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("william_coupon.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("william_coupon.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("william_coupon.type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("william_coupon.type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("william_coupon.type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("william_coupon.type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("william_coupon.type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("william_coupon.type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("william_coupon.type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("william_coupon.type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("william_coupon.name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("william_coupon.name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("william_coupon.name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("william_coupon.name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("william_coupon.name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon.name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("william_coupon.name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("william_coupon.name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("william_coupon.name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("william_coupon.name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("william_coupon.name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("william_coupon.name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("william_coupon.name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("william_coupon.name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("william_coupon.image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("william_coupon.image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("william_coupon.image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("william_coupon.image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("william_coupon.image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon.image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("william_coupon.image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("william_coupon.image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("william_coupon.image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("william_coupon.image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("william_coupon.image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("william_coupon.image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("william_coupon.image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("william_coupon.image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("william_coupon.platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("william_coupon.platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Integer value) {
            addCriterion("william_coupon.platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Integer value) {
            addCriterion("william_coupon.platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Integer value) {
            addCriterion("william_coupon.platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Integer value) {
            addCriterion("william_coupon.platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Integer> values) {
            addCriterion("william_coupon.platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Integer> values) {
            addCriterion("william_coupon.platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("william_coupon.count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("william_coupon.count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("william_coupon.count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("william_coupon.count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("william_coupon.count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("william_coupon.count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("william_coupon.count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("william_coupon.count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andResidueCountIsNull() {
            addCriterion("william_coupon.residue_count is null");
            return (Criteria) this;
        }

        public Criteria andResidueCountIsNotNull() {
            addCriterion("william_coupon.residue_count is not null");
            return (Criteria) this;
        }

        public Criteria andResidueCountEqualTo(Integer value) {
            addCriterion("william_coupon.residue_count =", value, "residueCount");
            return (Criteria) this;
        }

        public Criteria andResidueCountNotEqualTo(Integer value) {
            addCriterion("william_coupon.residue_count <>", value, "residueCount");
            return (Criteria) this;
        }

        public Criteria andResidueCountGreaterThan(Integer value) {
            addCriterion("william_coupon.residue_count >", value, "residueCount");
            return (Criteria) this;
        }

        public Criteria andResidueCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.residue_count >=", value, "residueCount");
            return (Criteria) this;
        }

        public Criteria andResidueCountLessThan(Integer value) {
            addCriterion("william_coupon.residue_count <", value, "residueCount");
            return (Criteria) this;
        }

        public Criteria andResidueCountLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.residue_count <=", value, "residueCount");
            return (Criteria) this;
        }

        public Criteria andResidueCountIn(List<Integer> values) {
            addCriterion("william_coupon.residue_count in", values, "residueCount");
            return (Criteria) this;
        }

        public Criteria andResidueCountNotIn(List<Integer> values) {
            addCriterion("william_coupon.residue_count not in", values, "residueCount");
            return (Criteria) this;
        }

        public Criteria andResidueCountBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.residue_count between", value1, value2, "residueCount");
            return (Criteria) this;
        }

        public Criteria andResidueCountNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.residue_count not between", value1, value2, "residueCount");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("william_coupon.amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("william_coupon.amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("william_coupon.amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("william_coupon.amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("william_coupon.amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_coupon.amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("william_coupon.amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_coupon.amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("william_coupon.amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("william_coupon.amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_coupon.amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_coupon.amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPerLimitIsNull() {
            addCriterion("william_coupon.per_limit is null");
            return (Criteria) this;
        }

        public Criteria andPerLimitIsNotNull() {
            addCriterion("william_coupon.per_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPerLimitEqualTo(Integer value) {
            addCriterion("william_coupon.per_limit =", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitNotEqualTo(Integer value) {
            addCriterion("william_coupon.per_limit <>", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitGreaterThan(Integer value) {
            addCriterion("william_coupon.per_limit >", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.per_limit >=", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitLessThan(Integer value) {
            addCriterion("william_coupon.per_limit <", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.per_limit <=", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitIn(List<Integer> values) {
            addCriterion("william_coupon.per_limit in", values, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitNotIn(List<Integer> values) {
            addCriterion("william_coupon.per_limit not in", values, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.per_limit between", value1, value2, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.per_limit not between", value1, value2, "perLimit");
            return (Criteria) this;
        }

        public Criteria andUseLevelIsNull() {
            addCriterion("william_coupon.use_level is null");
            return (Criteria) this;
        }

        public Criteria andUseLevelIsNotNull() {
            addCriterion("william_coupon.use_level is not null");
            return (Criteria) this;
        }

        public Criteria andUseLevelEqualTo(Integer value) {
            addCriterion("william_coupon.use_level =", value, "useLevel");
            return (Criteria) this;
        }

        public Criteria andUseLevelNotEqualTo(Integer value) {
            addCriterion("william_coupon.use_level <>", value, "useLevel");
            return (Criteria) this;
        }

        public Criteria andUseLevelGreaterThan(Integer value) {
            addCriterion("william_coupon.use_level >", value, "useLevel");
            return (Criteria) this;
        }

        public Criteria andUseLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.use_level >=", value, "useLevel");
            return (Criteria) this;
        }

        public Criteria andUseLevelLessThan(Integer value) {
            addCriterion("william_coupon.use_level <", value, "useLevel");
            return (Criteria) this;
        }

        public Criteria andUseLevelLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.use_level <=", value, "useLevel");
            return (Criteria) this;
        }

        public Criteria andUseLevelIn(List<Integer> values) {
            addCriterion("william_coupon.use_level in", values, "useLevel");
            return (Criteria) this;
        }

        public Criteria andUseLevelNotIn(List<Integer> values) {
            addCriterion("william_coupon.use_level not in", values, "useLevel");
            return (Criteria) this;
        }

        public Criteria andUseLevelBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.use_level between", value1, value2, "useLevel");
            return (Criteria) this;
        }

        public Criteria andUseLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.use_level not between", value1, value2, "useLevel");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("william_coupon.coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("william_coupon.coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Integer value) {
            addCriterion("william_coupon.coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Integer value) {
            addCriterion("william_coupon.coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Integer value) {
            addCriterion("william_coupon.coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Integer value) {
            addCriterion("william_coupon.coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Integer> values) {
            addCriterion("william_coupon.coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Integer> values) {
            addCriterion("william_coupon.coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueIsNull() {
            addCriterion("william_coupon.coupon_type_value is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueIsNotNull() {
            addCriterion("william_coupon.coupon_type_value is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueEqualTo(Integer value) {
            addCriterion("william_coupon.coupon_type_value =", value, "couponTypeValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueNotEqualTo(Integer value) {
            addCriterion("william_coupon.coupon_type_value <>", value, "couponTypeValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueGreaterThan(Integer value) {
            addCriterion("william_coupon.coupon_type_value >", value, "couponTypeValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.coupon_type_value >=", value, "couponTypeValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueLessThan(Integer value) {
            addCriterion("william_coupon.coupon_type_value <", value, "couponTypeValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.coupon_type_value <=", value, "couponTypeValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueIn(List<Integer> values) {
            addCriterion("william_coupon.coupon_type_value in", values, "couponTypeValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueNotIn(List<Integer> values) {
            addCriterion("william_coupon.coupon_type_value not in", values, "couponTypeValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.coupon_type_value between", value1, value2, "couponTypeValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeValueNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.coupon_type_value not between", value1, value2, "couponTypeValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountIsNull() {
            addCriterion("william_coupon.coupon_type_discount is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountIsNotNull() {
            addCriterion("william_coupon.coupon_type_discount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountEqualTo(String value) {
            addCriterion("william_coupon.coupon_type_discount =", value, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountNotEqualTo(String value) {
            addCriterion("william_coupon.coupon_type_discount <>", value, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountGreaterThan(String value) {
            addCriterion("william_coupon.coupon_type_discount >", value, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon.coupon_type_discount >=", value, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountLessThan(String value) {
            addCriterion("william_coupon.coupon_type_discount <", value, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountLessThanOrEqualTo(String value) {
            addCriterion("william_coupon.coupon_type_discount <=", value, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountLike(String value) {
            addCriterion("william_coupon.coupon_type_discount like", value, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountNotLike(String value) {
            addCriterion("william_coupon.coupon_type_discount not like", value, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountIn(List<String> values) {
            addCriterion("william_coupon.coupon_type_discount in", values, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountNotIn(List<String> values) {
            addCriterion("william_coupon.coupon_type_discount not in", values, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountBetween(String value1, String value2) {
            addCriterion("william_coupon.coupon_type_discount between", value1, value2, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeDiscountNotBetween(String value1, String value2) {
            addCriterion("william_coupon.coupon_type_discount not between", value1, value2, "couponTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNull() {
            addCriterion("william_coupon.use_type is null");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNotNull() {
            addCriterion("william_coupon.use_type is not null");
            return (Criteria) this;
        }

        public Criteria andUseTypeEqualTo(Integer value) {
            addCriterion("william_coupon.use_type =", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotEqualTo(Integer value) {
            addCriterion("william_coupon.use_type <>", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThan(Integer value) {
            addCriterion("william_coupon.use_type >", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.use_type >=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThan(Integer value) {
            addCriterion("william_coupon.use_type <", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.use_type <=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeIn(List<Integer> values) {
            addCriterion("william_coupon.use_type in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotIn(List<Integer> values) {
            addCriterion("william_coupon.use_type not in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.use_type between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.use_type not between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueIsNull() {
            addCriterion("william_coupon.use_type_value is null");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueIsNotNull() {
            addCriterion("william_coupon.use_type_value is not null");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueEqualTo(String value) {
            addCriterion("william_coupon.use_type_value =", value, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueNotEqualTo(String value) {
            addCriterion("william_coupon.use_type_value <>", value, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueGreaterThan(String value) {
            addCriterion("william_coupon.use_type_value >", value, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon.use_type_value >=", value, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueLessThan(String value) {
            addCriterion("william_coupon.use_type_value <", value, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueLessThanOrEqualTo(String value) {
            addCriterion("william_coupon.use_type_value <=", value, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueLike(String value) {
            addCriterion("william_coupon.use_type_value like", value, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueNotLike(String value) {
            addCriterion("william_coupon.use_type_value not like", value, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueIn(List<String> values) {
            addCriterion("william_coupon.use_type_value in", values, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueNotIn(List<String> values) {
            addCriterion("william_coupon.use_type_value not in", values, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueBetween(String value1, String value2) {
            addCriterion("william_coupon.use_type_value between", value1, value2, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andUseTypeValueNotBetween(String value1, String value2) {
            addCriterion("william_coupon.use_type_value not between", value1, value2, "useTypeValue");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("william_coupon.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("william_coupon.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("william_coupon.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("william_coupon.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("william_coupon.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("william_coupon.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("william_coupon.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("william_coupon.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("william_coupon.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("william_coupon.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("william_coupon.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("william_coupon.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("william_coupon.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNull() {
            addCriterion("william_coupon.member_level is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNotNull() {
            addCriterion("william_coupon.member_level is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelEqualTo(Integer value) {
            addCriterion("william_coupon.member_level =", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotEqualTo(Integer value) {
            addCriterion("william_coupon.member_level <>", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThan(Integer value) {
            addCriterion("william_coupon.member_level >", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.member_level >=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThan(Integer value) {
            addCriterion("william_coupon.member_level <", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.member_level <=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIn(List<Integer> values) {
            addCriterion("william_coupon.member_level in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotIn(List<Integer> values) {
            addCriterion("william_coupon.member_level not in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.member_level between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.member_level not between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeIsNull() {
            addCriterion("william_coupon.expiry_type is null");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeIsNotNull() {
            addCriterion("william_coupon.expiry_type is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeEqualTo(Integer value) {
            addCriterion("william_coupon.expiry_type =", value, "expiryType");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeNotEqualTo(Integer value) {
            addCriterion("william_coupon.expiry_type <>", value, "expiryType");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeGreaterThan(Integer value) {
            addCriterion("william_coupon.expiry_type >", value, "expiryType");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.expiry_type >=", value, "expiryType");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeLessThan(Integer value) {
            addCriterion("william_coupon.expiry_type <", value, "expiryType");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.expiry_type <=", value, "expiryType");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeIn(List<Integer> values) {
            addCriterion("william_coupon.expiry_type in", values, "expiryType");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeNotIn(List<Integer> values) {
            addCriterion("william_coupon.expiry_type not in", values, "expiryType");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.expiry_type between", value1, value2, "expiryType");
            return (Criteria) this;
        }

        public Criteria andExpiryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.expiry_type not between", value1, value2, "expiryType");
            return (Criteria) this;
        }

        public Criteria andExpiryValueIsNull() {
            addCriterion("william_coupon.expiry_value is null");
            return (Criteria) this;
        }

        public Criteria andExpiryValueIsNotNull() {
            addCriterion("william_coupon.expiry_value is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryValueEqualTo(Integer value) {
            addCriterion("william_coupon.expiry_value =", value, "expiryValue");
            return (Criteria) this;
        }

        public Criteria andExpiryValueNotEqualTo(Integer value) {
            addCriterion("william_coupon.expiry_value <>", value, "expiryValue");
            return (Criteria) this;
        }

        public Criteria andExpiryValueGreaterThan(Integer value) {
            addCriterion("william_coupon.expiry_value >", value, "expiryValue");
            return (Criteria) this;
        }

        public Criteria andExpiryValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.expiry_value >=", value, "expiryValue");
            return (Criteria) this;
        }

        public Criteria andExpiryValueLessThan(Integer value) {
            addCriterion("william_coupon.expiry_value <", value, "expiryValue");
            return (Criteria) this;
        }

        public Criteria andExpiryValueLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.expiry_value <=", value, "expiryValue");
            return (Criteria) this;
        }

        public Criteria andExpiryValueIn(List<Integer> values) {
            addCriterion("william_coupon.expiry_value in", values, "expiryValue");
            return (Criteria) this;
        }

        public Criteria andExpiryValueNotIn(List<Integer> values) {
            addCriterion("william_coupon.expiry_value not in", values, "expiryValue");
            return (Criteria) this;
        }

        public Criteria andExpiryValueBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.expiry_value between", value1, value2, "expiryValue");
            return (Criteria) this;
        }

        public Criteria andExpiryValueNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.expiry_value not between", value1, value2, "expiryValue");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeIsNull() {
            addCriterion("william_coupon.expiry_start_time is null");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeIsNotNull() {
            addCriterion("william_coupon.expiry_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeEqualTo(Date value) {
            addCriterion("william_coupon.expiry_start_time =", value, "expiryStartTime");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeNotEqualTo(Date value) {
            addCriterion("william_coupon.expiry_start_time <>", value, "expiryStartTime");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeGreaterThan(Date value) {
            addCriterion("william_coupon.expiry_start_time >", value, "expiryStartTime");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_coupon.expiry_start_time >=", value, "expiryStartTime");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeLessThan(Date value) {
            addCriterion("william_coupon.expiry_start_time <", value, "expiryStartTime");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_coupon.expiry_start_time <=", value, "expiryStartTime");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeIn(List<Date> values) {
            addCriterion("william_coupon.expiry_start_time in", values, "expiryStartTime");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeNotIn(List<Date> values) {
            addCriterion("william_coupon.expiry_start_time not in", values, "expiryStartTime");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeBetween(Date value1, Date value2) {
            addCriterion("william_coupon.expiry_start_time between", value1, value2, "expiryStartTime");
            return (Criteria) this;
        }

        public Criteria andExpiryStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_coupon.expiry_start_time not between", value1, value2, "expiryStartTime");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeIsNull() {
            addCriterion("william_coupon.expiry_end_time is null");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeIsNotNull() {
            addCriterion("william_coupon.expiry_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeEqualTo(Date value) {
            addCriterion("william_coupon.expiry_end_time =", value, "expiryEndTime");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeNotEqualTo(Date value) {
            addCriterion("william_coupon.expiry_end_time <>", value, "expiryEndTime");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeGreaterThan(Date value) {
            addCriterion("william_coupon.expiry_end_time >", value, "expiryEndTime");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_coupon.expiry_end_time >=", value, "expiryEndTime");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeLessThan(Date value) {
            addCriterion("william_coupon.expiry_end_time <", value, "expiryEndTime");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_coupon.expiry_end_time <=", value, "expiryEndTime");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeIn(List<Date> values) {
            addCriterion("william_coupon.expiry_end_time in", values, "expiryEndTime");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeNotIn(List<Date> values) {
            addCriterion("william_coupon.expiry_end_time not in", values, "expiryEndTime");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeBetween(Date value1, Date value2) {
            addCriterion("william_coupon.expiry_end_time between", value1, value2, "expiryEndTime");
            return (Criteria) this;
        }

        public Criteria andExpiryEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_coupon.expiry_end_time not between", value1, value2, "expiryEndTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("william_coupon.create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("william_coupon.create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("william_coupon.create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("william_coupon.create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("william_coupon.create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon.create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("william_coupon.create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("william_coupon.create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("william_coupon.create_id like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("william_coupon.create_id not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("william_coupon.create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("william_coupon.create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("william_coupon.create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("william_coupon.create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("william_coupon.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("william_coupon.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("william_coupon.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("william_coupon.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("william_coupon.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_coupon.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("william_coupon.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_coupon.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("william_coupon.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("william_coupon.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("william_coupon.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_coupon.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("william_coupon.mod_id is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("william_coupon.mod_id is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("william_coupon.mod_id =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("william_coupon.mod_id <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("william_coupon.mod_id >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon.mod_id >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("william_coupon.mod_id <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("william_coupon.mod_id <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("william_coupon.mod_id like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("william_coupon.mod_id not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("william_coupon.mod_id in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("william_coupon.mod_id not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("william_coupon.mod_id between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("william_coupon.mod_id not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("william_coupon.mod_time is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("william_coupon.mod_time is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("william_coupon.mod_time =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("william_coupon.mod_time <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("william_coupon.mod_time >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_coupon.mod_time >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("william_coupon.mod_time <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_coupon.mod_time <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("william_coupon.mod_time in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("william_coupon.mod_time not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("william_coupon.mod_time between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_coupon.mod_time not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("william_coupon.tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("william_coupon.tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("william_coupon.tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("william_coupon.tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("william_coupon.tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon.tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("william_coupon.tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("william_coupon.tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("william_coupon.tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("william_coupon.tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("william_coupon.tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("william_coupon.tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("william_coupon.tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("william_coupon.tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("william_coupon.client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("william_coupon.client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("william_coupon.client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("william_coupon.client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("william_coupon.client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("william_coupon.client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("william_coupon.client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("william_coupon.client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("william_coupon.client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("william_coupon.client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("william_coupon.client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("william_coupon.client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("william_coupon.client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("william_coupon.client not between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("william_coupon.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("william_coupon.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("william_coupon.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("william_coupon.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("william_coupon.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("william_coupon.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_coupon.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("william_coupon.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("william_coupon.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_coupon.status not between", value1, value2, "status");
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