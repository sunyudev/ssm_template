package com.zhiyou100.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugExample() {
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

        public Criteria andDrugUrlIsNull() {
            addCriterion("drug_url is null");
            return (Criteria) this;
        }

        public Criteria andDrugUrlIsNotNull() {
            addCriterion("drug_url is not null");
            return (Criteria) this;
        }

        public Criteria andDrugUrlEqualTo(String value) {
            addCriterion("drug_url =", value, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlNotEqualTo(String value) {
            addCriterion("drug_url <>", value, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlGreaterThan(String value) {
            addCriterion("drug_url >", value, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlGreaterThanOrEqualTo(String value) {
            addCriterion("drug_url >=", value, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlLessThan(String value) {
            addCriterion("drug_url <", value, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlLessThanOrEqualTo(String value) {
            addCriterion("drug_url <=", value, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlLike(String value) {
            addCriterion("drug_url like", value, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlNotLike(String value) {
            addCriterion("drug_url not like", value, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlIn(List<String> values) {
            addCriterion("drug_url in", values, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlNotIn(List<String> values) {
            addCriterion("drug_url not in", values, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlBetween(String value1, String value2) {
            addCriterion("drug_url between", value1, value2, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andDrugUrlNotBetween(String value1, String value2) {
            addCriterion("drug_url not between", value1, value2, "drugUrl");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceIsNull() {
            addCriterion("purchas_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceIsNotNull() {
            addCriterion("purchas_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceEqualTo(Double value) {
            addCriterion("purchas_price =", value, "purchasPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceNotEqualTo(Double value) {
            addCriterion("purchas_price <>", value, "purchasPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceGreaterThan(Double value) {
            addCriterion("purchas_price >", value, "purchasPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("purchas_price >=", value, "purchasPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceLessThan(Double value) {
            addCriterion("purchas_price <", value, "purchasPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceLessThanOrEqualTo(Double value) {
            addCriterion("purchas_price <=", value, "purchasPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceIn(List<Double> values) {
            addCriterion("purchas_price in", values, "purchasPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceNotIn(List<Double> values) {
            addCriterion("purchas_price not in", values, "purchasPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceBetween(Double value1, Double value2) {
            addCriterion("purchas_price between", value1, value2, "purchasPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasPriceNotBetween(Double value1, Double value2) {
            addCriterion("purchas_price not between", value1, value2, "purchasPrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(Double value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(Double value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(Double value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(Double value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(Double value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<Double> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<Double> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(Double value1, Double value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(Double value1, Double value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNull() {
            addCriterion("drug_name is null");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNotNull() {
            addCriterion("drug_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNameEqualTo(String value) {
            addCriterion("drug_name =", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotEqualTo(String value) {
            addCriterion("drug_name <>", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThan(String value) {
            addCriterion("drug_name >", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("drug_name >=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThan(String value) {
            addCriterion("drug_name <", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThanOrEqualTo(String value) {
            addCriterion("drug_name <=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLike(String value) {
            addCriterion("drug_name like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotLike(String value) {
            addCriterion("drug_name not like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameIn(List<String> values) {
            addCriterion("drug_name in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotIn(List<String> values) {
            addCriterion("drug_name not in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameBetween(String value1, String value2) {
            addCriterion("drug_name between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotBetween(String value1, String value2) {
            addCriterion("drug_name not between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIsNull() {
            addCriterion("drug_type is null");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIsNotNull() {
            addCriterion("drug_type is not null");
            return (Criteria) this;
        }

        public Criteria andDrugTypeEqualTo(Integer value) {
            addCriterion("drug_type =", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotEqualTo(Integer value) {
            addCriterion("drug_type <>", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeGreaterThan(Integer value) {
            addCriterion("drug_type >", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_type >=", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLessThan(Integer value) {
            addCriterion("drug_type <", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLessThanOrEqualTo(Integer value) {
            addCriterion("drug_type <=", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIn(List<Integer> values) {
            addCriterion("drug_type in", values, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotIn(List<Integer> values) {
            addCriterion("drug_type not in", values, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeBetween(Integer value1, Integer value2) {
            addCriterion("drug_type between", value1, value2, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_type not between", value1, value2, "drugType");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailIsNull() {
            addCriterion("simple_detail is null");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailIsNotNull() {
            addCriterion("simple_detail is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailEqualTo(String value) {
            addCriterion("simple_detail =", value, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailNotEqualTo(String value) {
            addCriterion("simple_detail <>", value, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailGreaterThan(String value) {
            addCriterion("simple_detail >", value, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailGreaterThanOrEqualTo(String value) {
            addCriterion("simple_detail >=", value, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailLessThan(String value) {
            addCriterion("simple_detail <", value, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailLessThanOrEqualTo(String value) {
            addCriterion("simple_detail <=", value, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailLike(String value) {
            addCriterion("simple_detail like", value, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailNotLike(String value) {
            addCriterion("simple_detail not like", value, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailIn(List<String> values) {
            addCriterion("simple_detail in", values, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailNotIn(List<String> values) {
            addCriterion("simple_detail not in", values, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailBetween(String value1, String value2) {
            addCriterion("simple_detail between", value1, value2, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andSimpleDetailNotBetween(String value1, String value2) {
            addCriterion("simple_detail not between", value1, value2, "simpleDetail");
            return (Criteria) this;
        }

        public Criteria andDataProdecedIsNull() {
            addCriterion("data_prodeced is null");
            return (Criteria) this;
        }

        public Criteria andDataProdecedIsNotNull() {
            addCriterion("data_prodeced is not null");
            return (Criteria) this;
        }

        public Criteria andDataProdecedEqualTo(String value) {
            addCriterion("data_prodeced =", value, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedNotEqualTo(String value) {
            addCriterion("data_prodeced <>", value, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedGreaterThan(String value) {
            addCriterion("data_prodeced >", value, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedGreaterThanOrEqualTo(String value) {
            addCriterion("data_prodeced >=", value, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedLessThan(String value) {
            addCriterion("data_prodeced <", value, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedLessThanOrEqualTo(String value) {
            addCriterion("data_prodeced <=", value, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedLike(String value) {
            addCriterion("data_prodeced like", value, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedNotLike(String value) {
            addCriterion("data_prodeced not like", value, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedIn(List<String> values) {
            addCriterion("data_prodeced in", values, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedNotIn(List<String> values) {
            addCriterion("data_prodeced not in", values, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedBetween(String value1, String value2) {
            addCriterion("data_prodeced between", value1, value2, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andDataProdecedNotBetween(String value1, String value2) {
            addCriterion("data_prodeced not between", value1, value2, "dataProdeced");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNull() {
            addCriterion("expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNotNull() {
            addCriterion("expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateEqualTo(String value) {
            addCriterion("expiration_date =", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotEqualTo(String value) {
            addCriterion("expiration_date <>", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThan(String value) {
            addCriterion("expiration_date >", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThanOrEqualTo(String value) {
            addCriterion("expiration_date >=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThan(String value) {
            addCriterion("expiration_date <", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThanOrEqualTo(String value) {
            addCriterion("expiration_date <=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLike(String value) {
            addCriterion("expiration_date like", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotLike(String value) {
            addCriterion("expiration_date not like", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIn(List<String> values) {
            addCriterion("expiration_date in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotIn(List<String> values) {
            addCriterion("expiration_date not in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateBetween(String value1, String value2) {
            addCriterion("expiration_date between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotBetween(String value1, String value2) {
            addCriterion("expiration_date not between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateIsNull() {
            addCriterion("quality_date is null");
            return (Criteria) this;
        }

        public Criteria andQualityDateIsNotNull() {
            addCriterion("quality_date is not null");
            return (Criteria) this;
        }

        public Criteria andQualityDateEqualTo(Integer value) {
            addCriterion("quality_date =", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateNotEqualTo(Integer value) {
            addCriterion("quality_date <>", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateGreaterThan(Integer value) {
            addCriterion("quality_date >", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_date >=", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateLessThan(Integer value) {
            addCriterion("quality_date <", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateLessThanOrEqualTo(Integer value) {
            addCriterion("quality_date <=", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateIn(List<Integer> values) {
            addCriterion("quality_date in", values, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateNotIn(List<Integer> values) {
            addCriterion("quality_date not in", values, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateBetween(Integer value1, Integer value2) {
            addCriterion("quality_date between", value1, value2, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_date not between", value1, value2, "qualityDate");
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

        public Criteria andManufactureIsNull() {
            addCriterion("manufacture is null");
            return (Criteria) this;
        }

        public Criteria andManufactureIsNotNull() {
            addCriterion("manufacture is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureEqualTo(String value) {
            addCriterion("manufacture =", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotEqualTo(String value) {
            addCriterion("manufacture <>", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureGreaterThan(String value) {
            addCriterion("manufacture >", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureGreaterThanOrEqualTo(String value) {
            addCriterion("manufacture >=", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLessThan(String value) {
            addCriterion("manufacture <", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLessThanOrEqualTo(String value) {
            addCriterion("manufacture <=", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLike(String value) {
            addCriterion("manufacture like", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotLike(String value) {
            addCriterion("manufacture not like", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureIn(List<String> values) {
            addCriterion("manufacture in", values, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotIn(List<String> values) {
            addCriterion("manufacture not in", values, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureBetween(String value1, String value2) {
            addCriterion("manufacture between", value1, value2, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotBetween(String value1, String value2) {
            addCriterion("manufacture not between", value1, value2, "manufacture");
            return (Criteria) this;
        }

        public Criteria andUseInforIsNull() {
            addCriterion("use_infor is null");
            return (Criteria) this;
        }

        public Criteria andUseInforIsNotNull() {
            addCriterion("use_infor is not null");
            return (Criteria) this;
        }

        public Criteria andUseInforEqualTo(String value) {
            addCriterion("use_infor =", value, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforNotEqualTo(String value) {
            addCriterion("use_infor <>", value, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforGreaterThan(String value) {
            addCriterion("use_infor >", value, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforGreaterThanOrEqualTo(String value) {
            addCriterion("use_infor >=", value, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforLessThan(String value) {
            addCriterion("use_infor <", value, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforLessThanOrEqualTo(String value) {
            addCriterion("use_infor <=", value, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforLike(String value) {
            addCriterion("use_infor like", value, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforNotLike(String value) {
            addCriterion("use_infor not like", value, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforIn(List<String> values) {
            addCriterion("use_infor in", values, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforNotIn(List<String> values) {
            addCriterion("use_infor not in", values, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforBetween(String value1, String value2) {
            addCriterion("use_infor between", value1, value2, "useInfor");
            return (Criteria) this;
        }

        public Criteria andUseInforNotBetween(String value1, String value2) {
            addCriterion("use_infor not between", value1, value2, "useInfor");
            return (Criteria) this;
        }

        public Criteria andTotalStockIsNull() {
            addCriterion("total_stock is null");
            return (Criteria) this;
        }

        public Criteria andTotalStockIsNotNull() {
            addCriterion("total_stock is not null");
            return (Criteria) this;
        }

        public Criteria andTotalStockEqualTo(Integer value) {
            addCriterion("total_stock =", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockNotEqualTo(Integer value) {
            addCriterion("total_stock <>", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockGreaterThan(Integer value) {
            addCriterion("total_stock >", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_stock >=", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockLessThan(Integer value) {
            addCriterion("total_stock <", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockLessThanOrEqualTo(Integer value) {
            addCriterion("total_stock <=", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockIn(List<Integer> values) {
            addCriterion("total_stock in", values, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockNotIn(List<Integer> values) {
            addCriterion("total_stock not in", values, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockBetween(Integer value1, Integer value2) {
            addCriterion("total_stock between", value1, value2, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockNotBetween(Integer value1, Integer value2) {
            addCriterion("total_stock not between", value1, value2, "totalStock");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNull() {
            addCriterion("surplus is null");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNotNull() {
            addCriterion("surplus is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusEqualTo(Integer value) {
            addCriterion("surplus =", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotEqualTo(Integer value) {
            addCriterion("surplus <>", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThan(Integer value) {
            addCriterion("surplus >", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus >=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThan(Integer value) {
            addCriterion("surplus <", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThanOrEqualTo(Integer value) {
            addCriterion("surplus <=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusIn(List<Integer> values) {
            addCriterion("surplus in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotIn(List<Integer> values) {
            addCriterion("surplus not in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusBetween(Integer value1, Integer value2) {
            addCriterion("surplus between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus not between", value1, value2, "surplus");
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

        public Criteria andNotedIsNull() {
            addCriterion("noted is null");
            return (Criteria) this;
        }

        public Criteria andNotedIsNotNull() {
            addCriterion("noted is not null");
            return (Criteria) this;
        }

        public Criteria andNotedEqualTo(String value) {
            addCriterion("noted =", value, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedNotEqualTo(String value) {
            addCriterion("noted <>", value, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedGreaterThan(String value) {
            addCriterion("noted >", value, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedGreaterThanOrEqualTo(String value) {
            addCriterion("noted >=", value, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedLessThan(String value) {
            addCriterion("noted <", value, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedLessThanOrEqualTo(String value) {
            addCriterion("noted <=", value, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedLike(String value) {
            addCriterion("noted like", value, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedNotLike(String value) {
            addCriterion("noted not like", value, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedIn(List<String> values) {
            addCriterion("noted in", values, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedNotIn(List<String> values) {
            addCriterion("noted not in", values, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedBetween(String value1, String value2) {
            addCriterion("noted between", value1, value2, "noted");
            return (Criteria) this;
        }

        public Criteria andNotedNotBetween(String value1, String value2) {
            addCriterion("noted not between", value1, value2, "noted");
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