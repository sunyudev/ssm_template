package com.zhiyou100.pojo;

import java.util.ArrayList;
import java.util.List;

public class HospitalClearExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospitalClearExample() {
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

        public Criteria andClearStatusIsNull() {
            addCriterion("clear_status is null");
            return (Criteria) this;
        }

        public Criteria andClearStatusIsNotNull() {
            addCriterion("clear_status is not null");
            return (Criteria) this;
        }

        public Criteria andClearStatusEqualTo(String value) {
            addCriterion("clear_status =", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusNotEqualTo(String value) {
            addCriterion("clear_status <>", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusGreaterThan(String value) {
            addCriterion("clear_status >", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusGreaterThanOrEqualTo(String value) {
            addCriterion("clear_status >=", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusLessThan(String value) {
            addCriterion("clear_status <", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusLessThanOrEqualTo(String value) {
            addCriterion("clear_status <=", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusLike(String value) {
            addCriterion("clear_status like", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusNotLike(String value) {
            addCriterion("clear_status not like", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusIn(List<String> values) {
            addCriterion("clear_status in", values, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusNotIn(List<String> values) {
            addCriterion("clear_status not in", values, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusBetween(String value1, String value2) {
            addCriterion("clear_status between", value1, value2, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusNotBetween(String value1, String value2) {
            addCriterion("clear_status not between", value1, value2, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(Double value) {
            addCriterion("total_cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(Double value) {
            addCriterion("total_cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(Double value) {
            addCriterion("total_cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(Double value) {
            addCriterion("total_cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(Double value) {
            addCriterion("total_cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(Double value) {
            addCriterion("total_cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<Double> values) {
            addCriterion("total_cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<Double> values) {
            addCriterion("total_cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(Double value1, Double value2) {
            addCriterion("total_cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(Double value1, Double value2) {
            addCriterion("total_cost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andCashPledgeIsNull() {
            addCriterion("cash_pledge is null");
            return (Criteria) this;
        }

        public Criteria andCashPledgeIsNotNull() {
            addCriterion("cash_pledge is not null");
            return (Criteria) this;
        }

        public Criteria andCashPledgeEqualTo(String value) {
            addCriterion("cash_pledge =", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotEqualTo(String value) {
            addCriterion("cash_pledge <>", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeGreaterThan(String value) {
            addCriterion("cash_pledge >", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeGreaterThanOrEqualTo(String value) {
            addCriterion("cash_pledge >=", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeLessThan(String value) {
            addCriterion("cash_pledge <", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeLessThanOrEqualTo(String value) {
            addCriterion("cash_pledge <=", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeLike(String value) {
            addCriterion("cash_pledge like", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotLike(String value) {
            addCriterion("cash_pledge not like", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeIn(List<String> values) {
            addCriterion("cash_pledge in", values, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotIn(List<String> values) {
            addCriterion("cash_pledge not in", values, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeBetween(String value1, String value2) {
            addCriterion("cash_pledge between", value1, value2, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotBetween(String value1, String value2) {
            addCriterion("cash_pledge not between", value1, value2, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayIsNull() {
            addCriterion("still_need_pay is null");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayIsNotNull() {
            addCriterion("still_need_pay is not null");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayEqualTo(Double value) {
            addCriterion("still_need_pay =", value, "stillNeedPay");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayNotEqualTo(Double value) {
            addCriterion("still_need_pay <>", value, "stillNeedPay");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayGreaterThan(Double value) {
            addCriterion("still_need_pay >", value, "stillNeedPay");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayGreaterThanOrEqualTo(Double value) {
            addCriterion("still_need_pay >=", value, "stillNeedPay");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayLessThan(Double value) {
            addCriterion("still_need_pay <", value, "stillNeedPay");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayLessThanOrEqualTo(Double value) {
            addCriterion("still_need_pay <=", value, "stillNeedPay");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayIn(List<Double> values) {
            addCriterion("still_need_pay in", values, "stillNeedPay");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayNotIn(List<Double> values) {
            addCriterion("still_need_pay not in", values, "stillNeedPay");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayBetween(Double value1, Double value2) {
            addCriterion("still_need_pay between", value1, value2, "stillNeedPay");
            return (Criteria) this;
        }

        public Criteria andStillNeedPayNotBetween(Double value1, Double value2) {
            addCriterion("still_need_pay not between", value1, value2, "stillNeedPay");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andClearTimeIsNull() {
            addCriterion("clear_time is null");
            return (Criteria) this;
        }

        public Criteria andClearTimeIsNotNull() {
            addCriterion("clear_time is not null");
            return (Criteria) this;
        }

        public Criteria andClearTimeEqualTo(String value) {
            addCriterion("clear_time =", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotEqualTo(String value) {
            addCriterion("clear_time <>", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThan(String value) {
            addCriterion("clear_time >", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThanOrEqualTo(String value) {
            addCriterion("clear_time >=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThan(String value) {
            addCriterion("clear_time <", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThanOrEqualTo(String value) {
            addCriterion("clear_time <=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLike(String value) {
            addCriterion("clear_time like", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotLike(String value) {
            addCriterion("clear_time not like", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeIn(List<String> values) {
            addCriterion("clear_time in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotIn(List<String> values) {
            addCriterion("clear_time not in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeBetween(String value1, String value2) {
            addCriterion("clear_time between", value1, value2, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotBetween(String value1, String value2) {
            addCriterion("clear_time not between", value1, value2, "clearTime");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsIsNull() {
            addCriterion("medical_costs is null");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsIsNotNull() {
            addCriterion("medical_costs is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsEqualTo(Double value) {
            addCriterion("medical_costs =", value, "medicalCosts");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsNotEqualTo(Double value) {
            addCriterion("medical_costs <>", value, "medicalCosts");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsGreaterThan(Double value) {
            addCriterion("medical_costs >", value, "medicalCosts");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsGreaterThanOrEqualTo(Double value) {
            addCriterion("medical_costs >=", value, "medicalCosts");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsLessThan(Double value) {
            addCriterion("medical_costs <", value, "medicalCosts");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsLessThanOrEqualTo(Double value) {
            addCriterion("medical_costs <=", value, "medicalCosts");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsIn(List<Double> values) {
            addCriterion("medical_costs in", values, "medicalCosts");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsNotIn(List<Double> values) {
            addCriterion("medical_costs not in", values, "medicalCosts");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsBetween(Double value1, Double value2) {
            addCriterion("medical_costs between", value1, value2, "medicalCosts");
            return (Criteria) this;
        }

        public Criteria andMedicalCostsNotBetween(Double value1, Double value2) {
            addCriterion("medical_costs not between", value1, value2, "medicalCosts");
            return (Criteria) this;
        }

        public Criteria andDrugCostIsNull() {
            addCriterion("drug_cost is null");
            return (Criteria) this;
        }

        public Criteria andDrugCostIsNotNull() {
            addCriterion("drug_cost is not null");
            return (Criteria) this;
        }

        public Criteria andDrugCostEqualTo(Double value) {
            addCriterion("drug_cost =", value, "drugCost");
            return (Criteria) this;
        }

        public Criteria andDrugCostNotEqualTo(Double value) {
            addCriterion("drug_cost <>", value, "drugCost");
            return (Criteria) this;
        }

        public Criteria andDrugCostGreaterThan(Double value) {
            addCriterion("drug_cost >", value, "drugCost");
            return (Criteria) this;
        }

        public Criteria andDrugCostGreaterThanOrEqualTo(Double value) {
            addCriterion("drug_cost >=", value, "drugCost");
            return (Criteria) this;
        }

        public Criteria andDrugCostLessThan(Double value) {
            addCriterion("drug_cost <", value, "drugCost");
            return (Criteria) this;
        }

        public Criteria andDrugCostLessThanOrEqualTo(Double value) {
            addCriterion("drug_cost <=", value, "drugCost");
            return (Criteria) this;
        }

        public Criteria andDrugCostIn(List<Double> values) {
            addCriterion("drug_cost in", values, "drugCost");
            return (Criteria) this;
        }

        public Criteria andDrugCostNotIn(List<Double> values) {
            addCriterion("drug_cost not in", values, "drugCost");
            return (Criteria) this;
        }

        public Criteria andDrugCostBetween(Double value1, Double value2) {
            addCriterion("drug_cost between", value1, value2, "drugCost");
            return (Criteria) this;
        }

        public Criteria andDrugCostNotBetween(Double value1, Double value2) {
            addCriterion("drug_cost not between", value1, value2, "drugCost");
            return (Criteria) this;
        }

        public Criteria andAmountPaidIsNull() {
            addCriterion("amount_paid is null");
            return (Criteria) this;
        }

        public Criteria andAmountPaidIsNotNull() {
            addCriterion("amount_paid is not null");
            return (Criteria) this;
        }

        public Criteria andAmountPaidEqualTo(Double value) {
            addCriterion("amount_paid =", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidNotEqualTo(Double value) {
            addCriterion("amount_paid <>", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidGreaterThan(Double value) {
            addCriterion("amount_paid >", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidGreaterThanOrEqualTo(Double value) {
            addCriterion("amount_paid >=", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidLessThan(Double value) {
            addCriterion("amount_paid <", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidLessThanOrEqualTo(Double value) {
            addCriterion("amount_paid <=", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidIn(List<Double> values) {
            addCriterion("amount_paid in", values, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidNotIn(List<Double> values) {
            addCriterion("amount_paid not in", values, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidBetween(Double value1, Double value2) {
            addCriterion("amount_paid between", value1, value2, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidNotBetween(Double value1, Double value2) {
            addCriterion("amount_paid not between", value1, value2, "amountPaid");
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