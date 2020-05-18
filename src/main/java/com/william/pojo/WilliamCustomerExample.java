package com.william.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WilliamCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startPos;

    private int pageSize;

    public WilliamCustomerExample() {
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

    public WilliamCustomerExample(int startPos, int pageSize) {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("william_customer.customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("william_customer.customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("william_customer.customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("william_customer.customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("william_customer.customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("william_customer.customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("william_customer.customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("william_customer.customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("william_customer.customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("william_customer.customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("william_customer.customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("william_customer.customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("william_customer.customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("william_customer.customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("william_customer.customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("william_customer.customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("william_customer.customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("william_customer.customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("william_customer.customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("william_customer.customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("william_customer.customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("william_customer.customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("william_customer.channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("william_customer.channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("william_customer.channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("william_customer.channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("william_customer.channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("william_customer.channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("william_customer.channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("william_customer.channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("william_customer.channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("william_customer.channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("william_customer.channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("william_customer.channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("william_customer.channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("william_customer.enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("william_customer.enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(String value) {
            addCriterion("william_customer.enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(String value) {
            addCriterion("william_customer.enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(String value) {
            addCriterion("william_customer.enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(String value) {
            addCriterion("william_customer.enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(String value) {
            addCriterion("william_customer.enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLike(String value) {
            addCriterion("william_customer.enterprise_id like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotLike(String value) {
            addCriterion("william_customer.enterprise_id not like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<String> values) {
            addCriterion("william_customer.enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<String> values) {
            addCriterion("william_customer.enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(String value1, String value2) {
            addCriterion("william_customer.enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(String value1, String value2) {
            addCriterion("william_customer.enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andChannelAccountIsNull() {
            addCriterion("william_customer.channel_account is null");
            return (Criteria) this;
        }

        public Criteria andChannelAccountIsNotNull() {
            addCriterion("william_customer.channel_account is not null");
            return (Criteria) this;
        }

        public Criteria andChannelAccountEqualTo(String value) {
            addCriterion("william_customer.channel_account =", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountNotEqualTo(String value) {
            addCriterion("william_customer.channel_account <>", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountGreaterThan(String value) {
            addCriterion("william_customer.channel_account >", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.channel_account >=", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountLessThan(String value) {
            addCriterion("william_customer.channel_account <", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountLessThanOrEqualTo(String value) {
            addCriterion("william_customer.channel_account <=", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountLike(String value) {
            addCriterion("william_customer.channel_account like", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountNotLike(String value) {
            addCriterion("william_customer.channel_account not like", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountIn(List<String> values) {
            addCriterion("william_customer.channel_account in", values, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountNotIn(List<String> values) {
            addCriterion("william_customer.channel_account not in", values, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountBetween(String value1, String value2) {
            addCriterion("william_customer.channel_account between", value1, value2, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountNotBetween(String value1, String value2) {
            addCriterion("william_customer.channel_account not between", value1, value2, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNull() {
            addCriterion("william_customer.customer_password is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNotNull() {
            addCriterion("william_customer.customer_password is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordEqualTo(String value) {
            addCriterion("william_customer.customer_password =", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotEqualTo(String value) {
            addCriterion("william_customer.customer_password <>", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThan(String value) {
            addCriterion("william_customer.customer_password >", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_password >=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThan(String value) {
            addCriterion("william_customer.customer_password <", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_password <=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLike(String value) {
            addCriterion("william_customer.customer_password like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotLike(String value) {
            addCriterion("william_customer.customer_password not like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIn(List<String> values) {
            addCriterion("william_customer.customer_password in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotIn(List<String> values) {
            addCriterion("william_customer.customer_password not in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordBetween(String value1, String value2) {
            addCriterion("william_customer.customer_password between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_password not between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("william_customer.customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("william_customer.customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("william_customer.customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("william_customer.customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("william_customer.customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("william_customer.customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("william_customer.customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("william_customer.customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("william_customer.customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("william_customer.customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("william_customer.customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIsNull() {
            addCriterion("william_customer.customer_gender is null");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIsNotNull() {
            addCriterion("william_customer.customer_gender is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderEqualTo(Integer value) {
            addCriterion("william_customer.customer_gender =", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotEqualTo(Integer value) {
            addCriterion("william_customer.customer_gender <>", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderGreaterThan(Integer value) {
            addCriterion("william_customer.customer_gender >", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_customer.customer_gender >=", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderLessThan(Integer value) {
            addCriterion("william_customer.customer_gender <", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderLessThanOrEqualTo(Integer value) {
            addCriterion("william_customer.customer_gender <=", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIn(List<Integer> values) {
            addCriterion("william_customer.customer_gender in", values, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotIn(List<Integer> values) {
            addCriterion("william_customer.customer_gender not in", values, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.customer_gender between", value1, value2, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.customer_gender not between", value1, value2, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightIsNull() {
            addCriterion("william_customer.customer_height is null");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightIsNotNull() {
            addCriterion("william_customer.customer_height is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightEqualTo(Integer value) {
            addCriterion("william_customer.customer_height =", value, "customerHeight");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightNotEqualTo(Integer value) {
            addCriterion("william_customer.customer_height <>", value, "customerHeight");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightGreaterThan(Integer value) {
            addCriterion("william_customer.customer_height >", value, "customerHeight");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_customer.customer_height >=", value, "customerHeight");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightLessThan(Integer value) {
            addCriterion("william_customer.customer_height <", value, "customerHeight");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightLessThanOrEqualTo(Integer value) {
            addCriterion("william_customer.customer_height <=", value, "customerHeight");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightIn(List<Integer> values) {
            addCriterion("william_customer.customer_height in", values, "customerHeight");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightNotIn(List<Integer> values) {
            addCriterion("william_customer.customer_height not in", values, "customerHeight");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.customer_height between", value1, value2, "customerHeight");
            return (Criteria) this;
        }

        public Criteria andCustomerHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.customer_height not between", value1, value2, "customerHeight");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightIsNull() {
            addCriterion("william_customer.customer_weight is null");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightIsNotNull() {
            addCriterion("william_customer.customer_weight is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightEqualTo(Integer value) {
            addCriterion("william_customer.customer_weight =", value, "customerWeight");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightNotEqualTo(Integer value) {
            addCriterion("william_customer.customer_weight <>", value, "customerWeight");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightGreaterThan(Integer value) {
            addCriterion("william_customer.customer_weight >", value, "customerWeight");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_customer.customer_weight >=", value, "customerWeight");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightLessThan(Integer value) {
            addCriterion("william_customer.customer_weight <", value, "customerWeight");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightLessThanOrEqualTo(Integer value) {
            addCriterion("william_customer.customer_weight <=", value, "customerWeight");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightIn(List<Integer> values) {
            addCriterion("william_customer.customer_weight in", values, "customerWeight");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightNotIn(List<Integer> values) {
            addCriterion("william_customer.customer_weight not in", values, "customerWeight");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.customer_weight between", value1, value2, "customerWeight");
            return (Criteria) this;
        }

        public Criteria andCustomerWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.customer_weight not between", value1, value2, "customerWeight");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthIsNull() {
            addCriterion("william_customer.customer_birth is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthIsNotNull() {
            addCriterion("william_customer.customer_birth is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthEqualTo(Date value) {
            addCriterionForJDBCDate("william_customer.customer_birth =", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("william_customer.customer_birth <>", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("william_customer.customer_birth >", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("william_customer.customer_birth >=", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthLessThan(Date value) {
            addCriterionForJDBCDate("william_customer.customer_birth <", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("william_customer.customer_birth <=", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthIn(List<Date> values) {
            addCriterionForJDBCDate("william_customer.customer_birth in", values, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("william_customer.customer_birth not in", values, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("william_customer.customer_birth between", value1, value2, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("william_customer.customer_birth not between", value1, value2, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountIsNull() {
            addCriterion("william_customer.customer_amount is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountIsNotNull() {
            addCriterion("william_customer.customer_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountEqualTo(Integer value) {
            addCriterion("william_customer.customer_amount =", value, "customerAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountNotEqualTo(Integer value) {
            addCriterion("william_customer.customer_amount <>", value, "customerAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountGreaterThan(Integer value) {
            addCriterion("william_customer.customer_amount >", value, "customerAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_customer.customer_amount >=", value, "customerAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountLessThan(Integer value) {
            addCriterion("william_customer.customer_amount <", value, "customerAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountLessThanOrEqualTo(Integer value) {
            addCriterion("william_customer.customer_amount <=", value, "customerAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountIn(List<Integer> values) {
            addCriterion("william_customer.customer_amount in", values, "customerAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountNotIn(List<Integer> values) {
            addCriterion("william_customer.customer_amount not in", values, "customerAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.customer_amount between", value1, value2, "customerAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.customer_amount not between", value1, value2, "customerAmount");
            return (Criteria) this;
        }

        public Criteria andLuckCountIsNull() {
            addCriterion("william_customer.luck_count is null");
            return (Criteria) this;
        }

        public Criteria andLuckCountIsNotNull() {
            addCriterion("william_customer.luck_count is not null");
            return (Criteria) this;
        }

        public Criteria andLuckCountEqualTo(Integer value) {
            addCriterion("william_customer.luck_count =", value, "luckCount");
            return (Criteria) this;
        }

        public Criteria andLuckCountNotEqualTo(Integer value) {
            addCriterion("william_customer.luck_count <>", value, "luckCount");
            return (Criteria) this;
        }

        public Criteria andLuckCountGreaterThan(Integer value) {
            addCriterion("william_customer.luck_count >", value, "luckCount");
            return (Criteria) this;
        }

        public Criteria andLuckCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_customer.luck_count >=", value, "luckCount");
            return (Criteria) this;
        }

        public Criteria andLuckCountLessThan(Integer value) {
            addCriterion("william_customer.luck_count <", value, "luckCount");
            return (Criteria) this;
        }

        public Criteria andLuckCountLessThanOrEqualTo(Integer value) {
            addCriterion("william_customer.luck_count <=", value, "luckCount");
            return (Criteria) this;
        }

        public Criteria andLuckCountIn(List<Integer> values) {
            addCriterion("william_customer.luck_count in", values, "luckCount");
            return (Criteria) this;
        }

        public Criteria andLuckCountNotIn(List<Integer> values) {
            addCriterion("william_customer.luck_count not in", values, "luckCount");
            return (Criteria) this;
        }

        public Criteria andLuckCountBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.luck_count between", value1, value2, "luckCount");
            return (Criteria) this;
        }

        public Criteria andLuckCountNotBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.luck_count not between", value1, value2, "luckCount");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("william_customer.cert_type is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("william_customer.cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(Integer value) {
            addCriterion("william_customer.cert_type =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(Integer value) {
            addCriterion("william_customer.cert_type <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(Integer value) {
            addCriterion("william_customer.cert_type >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_customer.cert_type >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(Integer value) {
            addCriterion("william_customer.cert_type <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_customer.cert_type <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<Integer> values) {
            addCriterion("william_customer.cert_type in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<Integer> values) {
            addCriterion("william_customer.cert_type not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.cert_type between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.cert_type not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertNumberIsNull() {
            addCriterion("william_customer.cert_number is null");
            return (Criteria) this;
        }

        public Criteria andCertNumberIsNotNull() {
            addCriterion("william_customer.cert_number is not null");
            return (Criteria) this;
        }

        public Criteria andCertNumberEqualTo(String value) {
            addCriterion("william_customer.cert_number =", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberNotEqualTo(String value) {
            addCriterion("william_customer.cert_number <>", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberGreaterThan(String value) {
            addCriterion("william_customer.cert_number >", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.cert_number >=", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberLessThan(String value) {
            addCriterion("william_customer.cert_number <", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberLessThanOrEqualTo(String value) {
            addCriterion("william_customer.cert_number <=", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberLike(String value) {
            addCriterion("william_customer.cert_number like", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberNotLike(String value) {
            addCriterion("william_customer.cert_number not like", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberIn(List<String> values) {
            addCriterion("william_customer.cert_number in", values, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberNotIn(List<String> values) {
            addCriterion("william_customer.cert_number not in", values, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberBetween(String value1, String value2) {
            addCriterion("william_customer.cert_number between", value1, value2, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberNotBetween(String value1, String value2) {
            addCriterion("william_customer.cert_number not between", value1, value2, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceIsNull() {
            addCriterion("william_customer.customer_province is null");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceIsNotNull() {
            addCriterion("william_customer.customer_province is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceEqualTo(String value) {
            addCriterion("william_customer.customer_province =", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotEqualTo(String value) {
            addCriterion("william_customer.customer_province <>", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceGreaterThan(String value) {
            addCriterion("william_customer.customer_province >", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_province >=", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceLessThan(String value) {
            addCriterion("william_customer.customer_province <", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_province <=", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceLike(String value) {
            addCriterion("william_customer.customer_province like", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotLike(String value) {
            addCriterion("william_customer.customer_province not like", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceIn(List<String> values) {
            addCriterion("william_customer.customer_province in", values, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotIn(List<String> values) {
            addCriterion("william_customer.customer_province not in", values, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceBetween(String value1, String value2) {
            addCriterion("william_customer.customer_province between", value1, value2, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_province not between", value1, value2, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIsNull() {
            addCriterion("william_customer.customer_city is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIsNotNull() {
            addCriterion("william_customer.customer_city is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCityEqualTo(String value) {
            addCriterion("william_customer.customer_city =", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotEqualTo(String value) {
            addCriterion("william_customer.customer_city <>", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityGreaterThan(String value) {
            addCriterion("william_customer.customer_city >", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_city >=", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLessThan(String value) {
            addCriterion("william_customer.customer_city <", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_city <=", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLike(String value) {
            addCriterion("william_customer.customer_city like", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotLike(String value) {
            addCriterion("william_customer.customer_city not like", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIn(List<String> values) {
            addCriterion("william_customer.customer_city in", values, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotIn(List<String> values) {
            addCriterion("william_customer.customer_city not in", values, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityBetween(String value1, String value2) {
            addCriterion("william_customer.customer_city between", value1, value2, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_city not between", value1, value2, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsIsNull() {
            addCriterion("william_customer.customer_districts is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsIsNotNull() {
            addCriterion("william_customer.customer_districts is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsEqualTo(String value) {
            addCriterion("william_customer.customer_districts =", value, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsNotEqualTo(String value) {
            addCriterion("william_customer.customer_districts <>", value, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsGreaterThan(String value) {
            addCriterion("william_customer.customer_districts >", value, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_districts >=", value, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsLessThan(String value) {
            addCriterion("william_customer.customer_districts <", value, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_districts <=", value, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsLike(String value) {
            addCriterion("william_customer.customer_districts like", value, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsNotLike(String value) {
            addCriterion("william_customer.customer_districts not like", value, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsIn(List<String> values) {
            addCriterion("william_customer.customer_districts in", values, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsNotIn(List<String> values) {
            addCriterion("william_customer.customer_districts not in", values, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsBetween(String value1, String value2) {
            addCriterion("william_customer.customer_districts between", value1, value2, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictsNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_districts not between", value1, value2, "customerDistricts");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("william_customer.customer_address is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("william_customer.customer_address is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("william_customer.customer_address =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("william_customer.customer_address <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("william_customer.customer_address >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_address >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("william_customer.customer_address <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_address <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("william_customer.customer_address like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("william_customer.customer_address not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("william_customer.customer_address in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("william_customer.customer_address not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("william_customer.customer_address between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_address not between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("william_customer.marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("william_customer.marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Integer value) {
            addCriterion("william_customer.marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Integer value) {
            addCriterion("william_customer.marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Integer value) {
            addCriterion("william_customer.marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_customer.marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Integer value) {
            addCriterion("william_customer.marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_customer.marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Integer> values) {
            addCriterion("william_customer.marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Integer> values) {
            addCriterion("william_customer.marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNull() {
            addCriterion("william_customer.customer_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNotNull() {
            addCriterion("william_customer.customer_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailEqualTo(String value) {
            addCriterion("william_customer.customer_email =", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotEqualTo(String value) {
            addCriterion("william_customer.customer_email <>", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThan(String value) {
            addCriterion("william_customer.customer_email >", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_email >=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThan(String value) {
            addCriterion("william_customer.customer_email <", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_email <=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLike(String value) {
            addCriterion("william_customer.customer_email like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotLike(String value) {
            addCriterion("william_customer.customer_email not like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIn(List<String> values) {
            addCriterion("william_customer.customer_email in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotIn(List<String> values) {
            addCriterion("william_customer.customer_email not in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailBetween(String value1, String value2) {
            addCriterion("william_customer.customer_email between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_email not between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionIsNull() {
            addCriterion("william_customer.customer_profession is null");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionIsNotNull() {
            addCriterion("william_customer.customer_profession is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionEqualTo(String value) {
            addCriterion("william_customer.customer_profession =", value, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionNotEqualTo(String value) {
            addCriterion("william_customer.customer_profession <>", value, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionGreaterThan(String value) {
            addCriterion("william_customer.customer_profession >", value, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_profession >=", value, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionLessThan(String value) {
            addCriterion("william_customer.customer_profession <", value, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_profession <=", value, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionLike(String value) {
            addCriterion("william_customer.customer_profession like", value, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionNotLike(String value) {
            addCriterion("william_customer.customer_profession not like", value, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionIn(List<String> values) {
            addCriterion("william_customer.customer_profession in", values, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionNotIn(List<String> values) {
            addCriterion("william_customer.customer_profession not in", values, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionBetween(String value1, String value2) {
            addCriterion("william_customer.customer_profession between", value1, value2, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andCustomerProfessionNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_profession not between", value1, value2, "customerProfession");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("william_customer.balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("william_customer.balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("william_customer.balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("william_customer.balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("william_customer.balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("william_customer.balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("william_customer.balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("william_customer.balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("william_customer.balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("william_customer.balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_customer.balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("william_customer.balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andCustomerIconIsNull() {
            addCriterion("william_customer.customer_icon is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIconIsNotNull() {
            addCriterion("william_customer.customer_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIconEqualTo(String value) {
            addCriterion("william_customer.customer_icon =", value, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconNotEqualTo(String value) {
            addCriterion("william_customer.customer_icon <>", value, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconGreaterThan(String value) {
            addCriterion("william_customer.customer_icon >", value, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_icon >=", value, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconLessThan(String value) {
            addCriterion("william_customer.customer_icon <", value, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconLessThanOrEqualTo(String value) {
            addCriterion("william_customer.customer_icon <=", value, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconLike(String value) {
            addCriterion("william_customer.customer_icon like", value, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconNotLike(String value) {
            addCriterion("william_customer.customer_icon not like", value, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconIn(List<String> values) {
            addCriterion("william_customer.customer_icon in", values, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconNotIn(List<String> values) {
            addCriterion("william_customer.customer_icon not in", values, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBetween(String value1, String value2) {
            addCriterion("william_customer.customer_icon between", value1, value2, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconNotBetween(String value1, String value2) {
            addCriterion("william_customer.customer_icon not between", value1, value2, "customerIcon");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeIsNull() {
            addCriterion("william_customer.customer_icon_bucket_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeIsNotNull() {
            addCriterion("william_customer.customer_icon_bucket_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeEqualTo(Integer value) {
            addCriterion("william_customer.customer_icon_bucket_type =", value, "customerIconBucketType");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeNotEqualTo(Integer value) {
            addCriterion("william_customer.customer_icon_bucket_type <>", value, "customerIconBucketType");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeGreaterThan(Integer value) {
            addCriterion("william_customer.customer_icon_bucket_type >", value, "customerIconBucketType");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_customer.customer_icon_bucket_type >=", value, "customerIconBucketType");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeLessThan(Integer value) {
            addCriterion("william_customer.customer_icon_bucket_type <", value, "customerIconBucketType");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeLessThanOrEqualTo(Integer value) {
            addCriterion("william_customer.customer_icon_bucket_type <=", value, "customerIconBucketType");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeIn(List<Integer> values) {
            addCriterion("william_customer.customer_icon_bucket_type in", values, "customerIconBucketType");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeNotIn(List<Integer> values) {
            addCriterion("william_customer.customer_icon_bucket_type not in", values, "customerIconBucketType");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.customer_icon_bucket_type between", value1, value2, "customerIconBucketType");
            return (Criteria) this;
        }

        public Criteria andCustomerIconBucketTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.customer_icon_bucket_type not between", value1, value2, "customerIconBucketType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("william_customer.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("william_customer.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("william_customer.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("william_customer.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("william_customer.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_customer.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("william_customer.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_customer.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("william_customer.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("william_customer.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusIsNull() {
            addCriterion("william_customer.official_status is null");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusIsNotNull() {
            addCriterion("william_customer.official_status is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusEqualTo(Integer value) {
            addCriterion("william_customer.official_status =", value, "officialStatus");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusNotEqualTo(Integer value) {
            addCriterion("william_customer.official_status <>", value, "officialStatus");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusGreaterThan(Integer value) {
            addCriterion("william_customer.official_status >", value, "officialStatus");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("william_customer.official_status >=", value, "officialStatus");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusLessThan(Integer value) {
            addCriterion("william_customer.official_status <", value, "officialStatus");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusLessThanOrEqualTo(Integer value) {
            addCriterion("william_customer.official_status <=", value, "officialStatus");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusIn(List<Integer> values) {
            addCriterion("william_customer.official_status in", values, "officialStatus");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusNotIn(List<Integer> values) {
            addCriterion("william_customer.official_status not in", values, "officialStatus");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.official_status between", value1, value2, "officialStatus");
            return (Criteria) this;
        }

        public Criteria andOfficialStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("william_customer.official_status not between", value1, value2, "officialStatus");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("william_customer.tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("william_customer.tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("william_customer.tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("william_customer.tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("william_customer.tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("william_customer.tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("william_customer.tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("william_customer.tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("william_customer.tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("william_customer.tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("william_customer.tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("william_customer.tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("william_customer.tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andCenterDeptIsNull() {
            addCriterion("william_customer.center_dept is null");
            return (Criteria) this;
        }

        public Criteria andCenterDeptIsNotNull() {
            addCriterion("william_customer.center_dept is not null");
            return (Criteria) this;
        }

        public Criteria andCenterDeptEqualTo(String value) {
            addCriterion("william_customer.center_dept =", value, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptNotEqualTo(String value) {
            addCriterion("william_customer.center_dept <>", value, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptGreaterThan(String value) {
            addCriterion("william_customer.center_dept >", value, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.center_dept >=", value, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptLessThan(String value) {
            addCriterion("william_customer.center_dept <", value, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptLessThanOrEqualTo(String value) {
            addCriterion("william_customer.center_dept <=", value, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptLike(String value) {
            addCriterion("william_customer.center_dept like", value, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptNotLike(String value) {
            addCriterion("william_customer.center_dept not like", value, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptIn(List<String> values) {
            addCriterion("william_customer.center_dept in", values, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptNotIn(List<String> values) {
            addCriterion("william_customer.center_dept not in", values, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptBetween(String value1, String value2) {
            addCriterion("william_customer.center_dept between", value1, value2, "centerDept");
            return (Criteria) this;
        }

        public Criteria andCenterDeptNotBetween(String value1, String value2) {
            addCriterion("william_customer.center_dept not between", value1, value2, "centerDept");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("william_customer.user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("william_customer.user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("william_customer.user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("william_customer.user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("william_customer.user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("william_customer.user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("william_customer.user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("william_customer.user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("william_customer.user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("william_customer.user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("william_customer.user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("william_customer.user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("william_customer.user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNull() {
            addCriterion("william_customer.create_person is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNotNull() {
            addCriterion("william_customer.create_person is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonEqualTo(String value) {
            addCriterion("william_customer.create_person =", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotEqualTo(String value) {
            addCriterion("william_customer.create_person <>", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThan(String value) {
            addCriterion("william_customer.create_person >", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.create_person >=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThan(String value) {
            addCriterion("william_customer.create_person <", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThanOrEqualTo(String value) {
            addCriterion("william_customer.create_person <=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLike(String value) {
            addCriterion("william_customer.create_person like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotLike(String value) {
            addCriterion("william_customer.create_person not like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIn(List<String> values) {
            addCriterion("william_customer.create_person in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotIn(List<String> values) {
            addCriterion("william_customer.create_person not in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonBetween(String value1, String value2) {
            addCriterion("william_customer.create_person between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotBetween(String value1, String value2) {
            addCriterion("william_customer.create_person not between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("william_customer.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("william_customer.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("william_customer.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("william_customer.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("william_customer.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_customer.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("william_customer.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_customer.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("william_customer.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("william_customer.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("william_customer.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_customer.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("william_customer.mod_id is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("william_customer.mod_id is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("william_customer.mod_id =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("william_customer.mod_id <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("william_customer.mod_id >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.mod_id >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("william_customer.mod_id <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("william_customer.mod_id <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("william_customer.mod_id like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("william_customer.mod_id not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("william_customer.mod_id in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("william_customer.mod_id not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("william_customer.mod_id between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("william_customer.mod_id not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("william_customer.mod_time is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("william_customer.mod_time is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("william_customer.mod_time =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("william_customer.mod_time <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("william_customer.mod_time >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("william_customer.mod_time >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("william_customer.mod_time <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("william_customer.mod_time <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("william_customer.mod_time in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("william_customer.mod_time not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("william_customer.mod_time between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("william_customer.mod_time not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("william_customer.client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("william_customer.client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("william_customer.client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("william_customer.client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("william_customer.client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("william_customer.client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("william_customer.client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("william_customer.client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("william_customer.client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("william_customer.client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("william_customer.client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("william_customer.client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("william_customer.client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("william_customer.client not between", value1, value2, "client");
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