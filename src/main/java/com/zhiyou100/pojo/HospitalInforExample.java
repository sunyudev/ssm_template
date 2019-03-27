package com.zhiyou100.pojo;

import java.util.ArrayList;
import java.util.List;

public class HospitalInforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospitalInforExample() {
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

        public Criteria andCaregiverIsNull() {
            addCriterion("caregiver is null");
            return (Criteria) this;
        }

        public Criteria andCaregiverIsNotNull() {
            addCriterion("caregiver is not null");
            return (Criteria) this;
        }

        public Criteria andCaregiverEqualTo(String value) {
            addCriterion("caregiver =", value, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverNotEqualTo(String value) {
            addCriterion("caregiver <>", value, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverGreaterThan(String value) {
            addCriterion("caregiver >", value, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverGreaterThanOrEqualTo(String value) {
            addCriterion("caregiver >=", value, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverLessThan(String value) {
            addCriterion("caregiver <", value, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverLessThanOrEqualTo(String value) {
            addCriterion("caregiver <=", value, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverLike(String value) {
            addCriterion("caregiver like", value, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverNotLike(String value) {
            addCriterion("caregiver not like", value, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverIn(List<String> values) {
            addCriterion("caregiver in", values, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverNotIn(List<String> values) {
            addCriterion("caregiver not in", values, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverBetween(String value1, String value2) {
            addCriterion("caregiver between", value1, value2, "caregiver");
            return (Criteria) this;
        }

        public Criteria andCaregiverNotBetween(String value1, String value2) {
            addCriterion("caregiver not between", value1, value2, "caregiver");
            return (Criteria) this;
        }

        public Criteria andBedIdIsNull() {
            addCriterion("bed_id is null");
            return (Criteria) this;
        }

        public Criteria andBedIdIsNotNull() {
            addCriterion("bed_id is not null");
            return (Criteria) this;
        }

        public Criteria andBedIdEqualTo(String value) {
            addCriterion("bed_id =", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotEqualTo(String value) {
            addCriterion("bed_id <>", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdGreaterThan(String value) {
            addCriterion("bed_id >", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdGreaterThanOrEqualTo(String value) {
            addCriterion("bed_id >=", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLessThan(String value) {
            addCriterion("bed_id <", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLessThanOrEqualTo(String value) {
            addCriterion("bed_id <=", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLike(String value) {
            addCriterion("bed_id like", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotLike(String value) {
            addCriterion("bed_id not like", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdIn(List<String> values) {
            addCriterion("bed_id in", values, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotIn(List<String> values) {
            addCriterion("bed_id not in", values, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdBetween(String value1, String value2) {
            addCriterion("bed_id between", value1, value2, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotBetween(String value1, String value2) {
            addCriterion("bed_id not between", value1, value2, "bedId");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositIsNull() {
            addCriterion("pay_the_deposit is null");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositIsNotNull() {
            addCriterion("pay_the_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositEqualTo(Double value) {
            addCriterion("pay_the_deposit =", value, "payTheDeposit");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositNotEqualTo(Double value) {
            addCriterion("pay_the_deposit <>", value, "payTheDeposit");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositGreaterThan(Double value) {
            addCriterion("pay_the_deposit >", value, "payTheDeposit");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_the_deposit >=", value, "payTheDeposit");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositLessThan(Double value) {
            addCriterion("pay_the_deposit <", value, "payTheDeposit");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositLessThanOrEqualTo(Double value) {
            addCriterion("pay_the_deposit <=", value, "payTheDeposit");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositIn(List<Double> values) {
            addCriterion("pay_the_deposit in", values, "payTheDeposit");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositNotIn(List<Double> values) {
            addCriterion("pay_the_deposit not in", values, "payTheDeposit");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositBetween(Double value1, Double value2) {
            addCriterion("pay_the_deposit between", value1, value2, "payTheDeposit");
            return (Criteria) this;
        }

        public Criteria andPayTheDepositNotBetween(Double value1, Double value2) {
            addCriterion("pay_the_deposit not between", value1, value2, "payTheDeposit");
            return (Criteria) this;
        }

        public Criteria andStateIllnessIsNull() {
            addCriterion("state_illness is null");
            return (Criteria) this;
        }

        public Criteria andStateIllnessIsNotNull() {
            addCriterion("state_illness is not null");
            return (Criteria) this;
        }

        public Criteria andStateIllnessEqualTo(String value) {
            addCriterion("state_illness =", value, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessNotEqualTo(String value) {
            addCriterion("state_illness <>", value, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessGreaterThan(String value) {
            addCriterion("state_illness >", value, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessGreaterThanOrEqualTo(String value) {
            addCriterion("state_illness >=", value, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessLessThan(String value) {
            addCriterion("state_illness <", value, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessLessThanOrEqualTo(String value) {
            addCriterion("state_illness <=", value, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessLike(String value) {
            addCriterion("state_illness like", value, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessNotLike(String value) {
            addCriterion("state_illness not like", value, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessIn(List<String> values) {
            addCriterion("state_illness in", values, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessNotIn(List<String> values) {
            addCriterion("state_illness not in", values, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessBetween(String value1, String value2) {
            addCriterion("state_illness between", value1, value2, "stateIllness");
            return (Criteria) this;
        }

        public Criteria andStateIllnessNotBetween(String value1, String value2) {
            addCriterion("state_illness not between", value1, value2, "stateIllness");
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