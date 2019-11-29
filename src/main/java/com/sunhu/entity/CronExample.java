package com.sunhu.entity;

import java.util.ArrayList;
import java.util.List;

public class CronExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CronExample() {
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

        public Criteria andCronClassIsNull() {
            addCriterion("cron_class is null");
            return (Criteria) this;
        }

        public Criteria andCronClassIsNotNull() {
            addCriterion("cron_class is not null");
            return (Criteria) this;
        }

        public Criteria andCronClassEqualTo(String value) {
            addCriterion("cron_class =", value, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassNotEqualTo(String value) {
            addCriterion("cron_class <>", value, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassGreaterThan(String value) {
            addCriterion("cron_class >", value, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassGreaterThanOrEqualTo(String value) {
            addCriterion("cron_class >=", value, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassLessThan(String value) {
            addCriterion("cron_class <", value, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassLessThanOrEqualTo(String value) {
            addCriterion("cron_class <=", value, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassLike(String value) {
            addCriterion("cron_class like", value, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassNotLike(String value) {
            addCriterion("cron_class not like", value, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassIn(List<String> values) {
            addCriterion("cron_class in", values, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassNotIn(List<String> values) {
            addCriterion("cron_class not in", values, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassBetween(String value1, String value2) {
            addCriterion("cron_class between", value1, value2, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronClassNotBetween(String value1, String value2) {
            addCriterion("cron_class not between", value1, value2, "cronClass");
            return (Criteria) this;
        }

        public Criteria andCronIsNull() {
            addCriterion("cron is null");
            return (Criteria) this;
        }

        public Criteria andCronIsNotNull() {
            addCriterion("cron is not null");
            return (Criteria) this;
        }

        public Criteria andCronEqualTo(String value) {
            addCriterion("cron =", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotEqualTo(String value) {
            addCriterion("cron <>", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThan(String value) {
            addCriterion("cron >", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThanOrEqualTo(String value) {
            addCriterion("cron >=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThan(String value) {
            addCriterion("cron <", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThanOrEqualTo(String value) {
            addCriterion("cron <=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLike(String value) {
            addCriterion("cron like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotLike(String value) {
            addCriterion("cron not like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronIn(List<String> values) {
            addCriterion("cron in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotIn(List<String> values) {
            addCriterion("cron not in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronBetween(String value1, String value2) {
            addCriterion("cron between", value1, value2, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotBetween(String value1, String value2) {
            addCriterion("cron not between", value1, value2, "cron");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCronRemarkIsNull() {
            addCriterion("cron_remark is null");
            return (Criteria) this;
        }

        public Criteria andCronRemarkIsNotNull() {
            addCriterion("cron_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCronRemarkEqualTo(String value) {
            addCriterion("cron_remark =", value, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkNotEqualTo(String value) {
            addCriterion("cron_remark <>", value, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkGreaterThan(String value) {
            addCriterion("cron_remark >", value, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cron_remark >=", value, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkLessThan(String value) {
            addCriterion("cron_remark <", value, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkLessThanOrEqualTo(String value) {
            addCriterion("cron_remark <=", value, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkLike(String value) {
            addCriterion("cron_remark like", value, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkNotLike(String value) {
            addCriterion("cron_remark not like", value, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkIn(List<String> values) {
            addCriterion("cron_remark in", values, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkNotIn(List<String> values) {
            addCriterion("cron_remark not in", values, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkBetween(String value1, String value2) {
            addCriterion("cron_remark between", value1, value2, "cronRemark");
            return (Criteria) this;
        }

        public Criteria andCronRemarkNotBetween(String value1, String value2) {
            addCriterion("cron_remark not between", value1, value2, "cronRemark");
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