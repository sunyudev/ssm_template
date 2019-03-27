package com.zhiyou100.pojo;

import java.util.ArrayList;
import java.util.List;

public class DispensingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DispensingExample() {
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

        public Criteria andMedicalRecordIsNull() {
            addCriterion("medical_record is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIsNotNull() {
            addCriterion("medical_record is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordEqualTo(String value) {
            addCriterion("medical_record =", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotEqualTo(String value) {
            addCriterion("medical_record <>", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordGreaterThan(String value) {
            addCriterion("medical_record >", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordGreaterThanOrEqualTo(String value) {
            addCriterion("medical_record >=", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLessThan(String value) {
            addCriterion("medical_record <", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLessThanOrEqualTo(String value) {
            addCriterion("medical_record <=", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLike(String value) {
            addCriterion("medical_record like", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotLike(String value) {
            addCriterion("medical_record not like", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIn(List<String> values) {
            addCriterion("medical_record in", values, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotIn(List<String> values) {
            addCriterion("medical_record not in", values, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordBetween(String value1, String value2) {
            addCriterion("medical_record between", value1, value2, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotBetween(String value1, String value2) {
            addCriterion("medical_record not between", value1, value2, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andDrugNumIsNull() {
            addCriterion("drug_num is null");
            return (Criteria) this;
        }

        public Criteria andDrugNumIsNotNull() {
            addCriterion("drug_num is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNumEqualTo(String value) {
            addCriterion("drug_num =", value, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumNotEqualTo(String value) {
            addCriterion("drug_num <>", value, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumGreaterThan(String value) {
            addCriterion("drug_num >", value, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumGreaterThanOrEqualTo(String value) {
            addCriterion("drug_num >=", value, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumLessThan(String value) {
            addCriterion("drug_num <", value, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumLessThanOrEqualTo(String value) {
            addCriterion("drug_num <=", value, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumLike(String value) {
            addCriterion("drug_num like", value, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumNotLike(String value) {
            addCriterion("drug_num not like", value, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumIn(List<String> values) {
            addCriterion("drug_num in", values, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumNotIn(List<String> values) {
            addCriterion("drug_num not in", values, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumBetween(String value1, String value2) {
            addCriterion("drug_num between", value1, value2, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumNotBetween(String value1, String value2) {
            addCriterion("drug_num not between", value1, value2, "drugNum");
            return (Criteria) this;
        }

        public Criteria andDispensNumIsNull() {
            addCriterion("dispens_num is null");
            return (Criteria) this;
        }

        public Criteria andDispensNumIsNotNull() {
            addCriterion("dispens_num is not null");
            return (Criteria) this;
        }

        public Criteria andDispensNumEqualTo(Integer value) {
            addCriterion("dispens_num =", value, "dispensNum");
            return (Criteria) this;
        }

        public Criteria andDispensNumNotEqualTo(Integer value) {
            addCriterion("dispens_num <>", value, "dispensNum");
            return (Criteria) this;
        }

        public Criteria andDispensNumGreaterThan(Integer value) {
            addCriterion("dispens_num >", value, "dispensNum");
            return (Criteria) this;
        }

        public Criteria andDispensNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispens_num >=", value, "dispensNum");
            return (Criteria) this;
        }

        public Criteria andDispensNumLessThan(Integer value) {
            addCriterion("dispens_num <", value, "dispensNum");
            return (Criteria) this;
        }

        public Criteria andDispensNumLessThanOrEqualTo(Integer value) {
            addCriterion("dispens_num <=", value, "dispensNum");
            return (Criteria) this;
        }

        public Criteria andDispensNumIn(List<Integer> values) {
            addCriterion("dispens_num in", values, "dispensNum");
            return (Criteria) this;
        }

        public Criteria andDispensNumNotIn(List<Integer> values) {
            addCriterion("dispens_num not in", values, "dispensNum");
            return (Criteria) this;
        }

        public Criteria andDispensNumBetween(Integer value1, Integer value2) {
            addCriterion("dispens_num between", value1, value2, "dispensNum");
            return (Criteria) this;
        }

        public Criteria andDispensNumNotBetween(Integer value1, Integer value2) {
            addCriterion("dispens_num not between", value1, value2, "dispensNum");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumIsNull() {
            addCriterion("alread_send_num is null");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumIsNotNull() {
            addCriterion("alread_send_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumEqualTo(Integer value) {
            addCriterion("alread_send_num =", value, "alreadSendNum");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumNotEqualTo(Integer value) {
            addCriterion("alread_send_num <>", value, "alreadSendNum");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumGreaterThan(Integer value) {
            addCriterion("alread_send_num >", value, "alreadSendNum");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("alread_send_num >=", value, "alreadSendNum");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumLessThan(Integer value) {
            addCriterion("alread_send_num <", value, "alreadSendNum");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumLessThanOrEqualTo(Integer value) {
            addCriterion("alread_send_num <=", value, "alreadSendNum");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumIn(List<Integer> values) {
            addCriterion("alread_send_num in", values, "alreadSendNum");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumNotIn(List<Integer> values) {
            addCriterion("alread_send_num not in", values, "alreadSendNum");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumBetween(Integer value1, Integer value2) {
            addCriterion("alread_send_num between", value1, value2, "alreadSendNum");
            return (Criteria) this;
        }

        public Criteria andAlreadSendNumNotBetween(Integer value1, Integer value2) {
            addCriterion("alread_send_num not between", value1, value2, "alreadSendNum");
            return (Criteria) this;
        }

        public Criteria andNotSendNumIsNull() {
            addCriterion("not_send_num is null");
            return (Criteria) this;
        }

        public Criteria andNotSendNumIsNotNull() {
            addCriterion("not_send_num is not null");
            return (Criteria) this;
        }

        public Criteria andNotSendNumEqualTo(Integer value) {
            addCriterion("not_send_num =", value, "notSendNum");
            return (Criteria) this;
        }

        public Criteria andNotSendNumNotEqualTo(Integer value) {
            addCriterion("not_send_num <>", value, "notSendNum");
            return (Criteria) this;
        }

        public Criteria andNotSendNumGreaterThan(Integer value) {
            addCriterion("not_send_num >", value, "notSendNum");
            return (Criteria) this;
        }

        public Criteria andNotSendNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("not_send_num >=", value, "notSendNum");
            return (Criteria) this;
        }

        public Criteria andNotSendNumLessThan(Integer value) {
            addCriterion("not_send_num <", value, "notSendNum");
            return (Criteria) this;
        }

        public Criteria andNotSendNumLessThanOrEqualTo(Integer value) {
            addCriterion("not_send_num <=", value, "notSendNum");
            return (Criteria) this;
        }

        public Criteria andNotSendNumIn(List<Integer> values) {
            addCriterion("not_send_num in", values, "notSendNum");
            return (Criteria) this;
        }

        public Criteria andNotSendNumNotIn(List<Integer> values) {
            addCriterion("not_send_num not in", values, "notSendNum");
            return (Criteria) this;
        }

        public Criteria andNotSendNumBetween(Integer value1, Integer value2) {
            addCriterion("not_send_num between", value1, value2, "notSendNum");
            return (Criteria) this;
        }

        public Criteria andNotSendNumNotBetween(Integer value1, Integer value2) {
            addCriterion("not_send_num not between", value1, value2, "notSendNum");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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