package com.zhiyou100.pojo;

import java.util.ArrayList;
import java.util.List;

public class SeccoXuanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeccoXuanExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSeccpNumIsNull() {
            addCriterion("seccp_num is null");
            return (Criteria) this;
        }

        public Criteria andSeccpNumIsNotNull() {
            addCriterion("seccp_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeccpNumEqualTo(String value) {
            addCriterion("seccp_num =", value, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumNotEqualTo(String value) {
            addCriterion("seccp_num <>", value, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumGreaterThan(String value) {
            addCriterion("seccp_num >", value, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumGreaterThanOrEqualTo(String value) {
            addCriterion("seccp_num >=", value, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumLessThan(String value) {
            addCriterion("seccp_num <", value, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumLessThanOrEqualTo(String value) {
            addCriterion("seccp_num <=", value, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumLike(String value) {
            addCriterion("seccp_num like", value, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumNotLike(String value) {
            addCriterion("seccp_num not like", value, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumIn(List<String> values) {
            addCriterion("seccp_num in", values, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumNotIn(List<String> values) {
            addCriterion("seccp_num not in", values, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumBetween(String value1, String value2) {
            addCriterion("seccp_num between", value1, value2, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccpNumNotBetween(String value1, String value2) {
            addCriterion("seccp_num not between", value1, value2, "seccpNum");
            return (Criteria) this;
        }

        public Criteria andSeccoNameIsNull() {
            addCriterion("secco_name is null");
            return (Criteria) this;
        }

        public Criteria andSeccoNameIsNotNull() {
            addCriterion("secco_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeccoNameEqualTo(String value) {
            addCriterion("secco_name =", value, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameNotEqualTo(String value) {
            addCriterion("secco_name <>", value, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameGreaterThan(String value) {
            addCriterion("secco_name >", value, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameGreaterThanOrEqualTo(String value) {
            addCriterion("secco_name >=", value, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameLessThan(String value) {
            addCriterion("secco_name <", value, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameLessThanOrEqualTo(String value) {
            addCriterion("secco_name <=", value, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameLike(String value) {
            addCriterion("secco_name like", value, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameNotLike(String value) {
            addCriterion("secco_name not like", value, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameIn(List<String> values) {
            addCriterion("secco_name in", values, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameNotIn(List<String> values) {
            addCriterion("secco_name not in", values, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameBetween(String value1, String value2) {
            addCriterion("secco_name between", value1, value2, "seccoName");
            return (Criteria) this;
        }

        public Criteria andSeccoNameNotBetween(String value1, String value2) {
            addCriterion("secco_name not between", value1, value2, "seccoName");
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