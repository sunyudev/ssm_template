package com.zhiyou100.pojo;

import java.util.ArrayList;
import java.util.List;

public class RegistrationInforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationInforExample() {
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

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("certificate_type like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("certificate_type not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andIdNumIsNull() {
            addCriterion("ID_num is null");
            return (Criteria) this;
        }

        public Criteria andIdNumIsNotNull() {
            addCriterion("ID_num is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumEqualTo(String value) {
            addCriterion("ID_num =", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotEqualTo(String value) {
            addCriterion("ID_num <>", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumGreaterThan(String value) {
            addCriterion("ID_num >", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumGreaterThanOrEqualTo(String value) {
            addCriterion("ID_num >=", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLessThan(String value) {
            addCriterion("ID_num <", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLessThanOrEqualTo(String value) {
            addCriterion("ID_num <=", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLike(String value) {
            addCriterion("ID_num like", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotLike(String value) {
            addCriterion("ID_num not like", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumIn(List<String> values) {
            addCriterion("ID_num in", values, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotIn(List<String> values) {
            addCriterion("ID_num not in", values, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumBetween(String value1, String value2) {
            addCriterion("ID_num between", value1, value2, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotBetween(String value1, String value2) {
            addCriterion("ID_num not between", value1, value2, "idNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumIsNull() {
            addCriterion("social_safe_num is null");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumIsNotNull() {
            addCriterion("social_safe_num is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumEqualTo(String value) {
            addCriterion("social_safe_num =", value, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumNotEqualTo(String value) {
            addCriterion("social_safe_num <>", value, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumGreaterThan(String value) {
            addCriterion("social_safe_num >", value, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumGreaterThanOrEqualTo(String value) {
            addCriterion("social_safe_num >=", value, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumLessThan(String value) {
            addCriterion("social_safe_num <", value, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumLessThanOrEqualTo(String value) {
            addCriterion("social_safe_num <=", value, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumLike(String value) {
            addCriterion("social_safe_num like", value, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumNotLike(String value) {
            addCriterion("social_safe_num not like", value, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumIn(List<String> values) {
            addCriterion("social_safe_num in", values, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumNotIn(List<String> values) {
            addCriterion("social_safe_num not in", values, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumBetween(String value1, String value2) {
            addCriterion("social_safe_num between", value1, value2, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andSocialSafeNumNotBetween(String value1, String value2) {
            addCriterion("social_safe_num not between", value1, value2, "socialSafeNum");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSelfPayingIsNull() {
            addCriterion("self_paying is null");
            return (Criteria) this;
        }

        public Criteria andSelfPayingIsNotNull() {
            addCriterion("self_paying is not null");
            return (Criteria) this;
        }

        public Criteria andSelfPayingEqualTo(Integer value) {
            addCriterion("self_paying =", value, "selfPaying");
            return (Criteria) this;
        }

        public Criteria andSelfPayingNotEqualTo(Integer value) {
            addCriterion("self_paying <>", value, "selfPaying");
            return (Criteria) this;
        }

        public Criteria andSelfPayingGreaterThan(Integer value) {
            addCriterion("self_paying >", value, "selfPaying");
            return (Criteria) this;
        }

        public Criteria andSelfPayingGreaterThanOrEqualTo(Integer value) {
            addCriterion("self_paying >=", value, "selfPaying");
            return (Criteria) this;
        }

        public Criteria andSelfPayingLessThan(Integer value) {
            addCriterion("self_paying <", value, "selfPaying");
            return (Criteria) this;
        }

        public Criteria andSelfPayingLessThanOrEqualTo(Integer value) {
            addCriterion("self_paying <=", value, "selfPaying");
            return (Criteria) this;
        }

        public Criteria andSelfPayingIn(List<Integer> values) {
            addCriterion("self_paying in", values, "selfPaying");
            return (Criteria) this;
        }

        public Criteria andSelfPayingNotIn(List<Integer> values) {
            addCriterion("self_paying not in", values, "selfPaying");
            return (Criteria) this;
        }

        public Criteria andSelfPayingBetween(Integer value1, Integer value2) {
            addCriterion("self_paying between", value1, value2, "selfPaying");
            return (Criteria) this;
        }

        public Criteria andSelfPayingNotBetween(Integer value1, Integer value2) {
            addCriterion("self_paying not between", value1, value2, "selfPaying");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCareerIsNull() {
            addCriterion("career is null");
            return (Criteria) this;
        }

        public Criteria andCareerIsNotNull() {
            addCriterion("career is not null");
            return (Criteria) this;
        }

        public Criteria andCareerEqualTo(String value) {
            addCriterion("career =", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotEqualTo(String value) {
            addCriterion("career <>", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThan(String value) {
            addCriterion("career >", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThanOrEqualTo(String value) {
            addCriterion("career >=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThan(String value) {
            addCriterion("career <", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThanOrEqualTo(String value) {
            addCriterion("career <=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLike(String value) {
            addCriterion("career like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotLike(String value) {
            addCriterion("career not like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerIn(List<String> values) {
            addCriterion("career in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotIn(List<String> values) {
            addCriterion("career not in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerBetween(String value1, String value2) {
            addCriterion("career between", value1, value2, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotBetween(String value1, String value2) {
            addCriterion("career not between", value1, value2, "career");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentIsNull() {
            addCriterion("early_appointment is null");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentIsNotNull() {
            addCriterion("early_appointment is not null");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentEqualTo(String value) {
            addCriterion("early_appointment =", value, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentNotEqualTo(String value) {
            addCriterion("early_appointment <>", value, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentGreaterThan(String value) {
            addCriterion("early_appointment >", value, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentGreaterThanOrEqualTo(String value) {
            addCriterion("early_appointment >=", value, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentLessThan(String value) {
            addCriterion("early_appointment <", value, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentLessThanOrEqualTo(String value) {
            addCriterion("early_appointment <=", value, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentLike(String value) {
            addCriterion("early_appointment like", value, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentNotLike(String value) {
            addCriterion("early_appointment not like", value, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentIn(List<String> values) {
            addCriterion("early_appointment in", values, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentNotIn(List<String> values) {
            addCriterion("early_appointment not in", values, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentBetween(String value1, String value2) {
            addCriterion("early_appointment between", value1, value2, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andEarlyAppointmentNotBetween(String value1, String value2) {
            addCriterion("early_appointment not between", value1, value2, "earlyAppointment");
            return (Criteria) this;
        }

        public Criteria andDactorIdIsNull() {
            addCriterion("dactor_id is null");
            return (Criteria) this;
        }

        public Criteria andDactorIdIsNotNull() {
            addCriterion("dactor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDactorIdEqualTo(Integer value) {
            addCriterion("dactor_id =", value, "dactorId");
            return (Criteria) this;
        }

        public Criteria andDactorIdNotEqualTo(Integer value) {
            addCriterion("dactor_id <>", value, "dactorId");
            return (Criteria) this;
        }

        public Criteria andDactorIdGreaterThan(Integer value) {
            addCriterion("dactor_id >", value, "dactorId");
            return (Criteria) this;
        }

        public Criteria andDactorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dactor_id >=", value, "dactorId");
            return (Criteria) this;
        }

        public Criteria andDactorIdLessThan(Integer value) {
            addCriterion("dactor_id <", value, "dactorId");
            return (Criteria) this;
        }

        public Criteria andDactorIdLessThanOrEqualTo(Integer value) {
            addCriterion("dactor_id <=", value, "dactorId");
            return (Criteria) this;
        }

        public Criteria andDactorIdIn(List<Integer> values) {
            addCriterion("dactor_id in", values, "dactorId");
            return (Criteria) this;
        }

        public Criteria andDactorIdNotIn(List<Integer> values) {
            addCriterion("dactor_id not in", values, "dactorId");
            return (Criteria) this;
        }

        public Criteria andDactorIdBetween(Integer value1, Integer value2) {
            addCriterion("dactor_id between", value1, value2, "dactorId");
            return (Criteria) this;
        }

        public Criteria andDactorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dactor_id not between", value1, value2, "dactorId");
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