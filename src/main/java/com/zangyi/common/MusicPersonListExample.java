package com.zangyi.common;

import java.util.ArrayList;
import java.util.List;

public class MusicPersonListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MusicPersonListExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andHeadpicIsNull() {
            addCriterion("headPic is null");
            return (Criteria) this;
        }

        public Criteria andHeadpicIsNotNull() {
            addCriterion("headPic is not null");
            return (Criteria) this;
        }

        public Criteria andHeadpicEqualTo(String value) {
            addCriterion("headPic =", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotEqualTo(String value) {
            addCriterion("headPic <>", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicGreaterThan(String value) {
            addCriterion("headPic >", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicGreaterThanOrEqualTo(String value) {
            addCriterion("headPic >=", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLessThan(String value) {
            addCriterion("headPic <", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLessThanOrEqualTo(String value) {
            addCriterion("headPic <=", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLike(String value) {
            addCriterion("headPic like", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotLike(String value) {
            addCriterion("headPic not like", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicIn(List<String> values) {
            addCriterion("headPic in", values, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotIn(List<String> values) {
            addCriterion("headPic not in", values, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicBetween(String value1, String value2) {
            addCriterion("headPic between", value1, value2, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotBetween(String value1, String value2) {
            addCriterion("headPic not between", value1, value2, "headpic");
            return (Criteria) this;
        }

        public Criteria andNamezangIsNull() {
            addCriterion("nameZang is null");
            return (Criteria) this;
        }

        public Criteria andNamezangIsNotNull() {
            addCriterion("nameZang is not null");
            return (Criteria) this;
        }

        public Criteria andNamezangEqualTo(String value) {
            addCriterion("nameZang =", value, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangNotEqualTo(String value) {
            addCriterion("nameZang <>", value, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangGreaterThan(String value) {
            addCriterion("nameZang >", value, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangGreaterThanOrEqualTo(String value) {
            addCriterion("nameZang >=", value, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangLessThan(String value) {
            addCriterion("nameZang <", value, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangLessThanOrEqualTo(String value) {
            addCriterion("nameZang <=", value, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangLike(String value) {
            addCriterion("nameZang like", value, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangNotLike(String value) {
            addCriterion("nameZang not like", value, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangIn(List<String> values) {
            addCriterion("nameZang in", values, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangNotIn(List<String> values) {
            addCriterion("nameZang not in", values, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangBetween(String value1, String value2) {
            addCriterion("nameZang between", value1, value2, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamezangNotBetween(String value1, String value2) {
            addCriterion("nameZang not between", value1, value2, "namezang");
            return (Criteria) this;
        }

        public Criteria andNamehanIsNull() {
            addCriterion("nameHan is null");
            return (Criteria) this;
        }

        public Criteria andNamehanIsNotNull() {
            addCriterion("nameHan is not null");
            return (Criteria) this;
        }

        public Criteria andNamehanEqualTo(String value) {
            addCriterion("nameHan =", value, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanNotEqualTo(String value) {
            addCriterion("nameHan <>", value, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanGreaterThan(String value) {
            addCriterion("nameHan >", value, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanGreaterThanOrEqualTo(String value) {
            addCriterion("nameHan >=", value, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanLessThan(String value) {
            addCriterion("nameHan <", value, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanLessThanOrEqualTo(String value) {
            addCriterion("nameHan <=", value, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanLike(String value) {
            addCriterion("nameHan like", value, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanNotLike(String value) {
            addCriterion("nameHan not like", value, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanIn(List<String> values) {
            addCriterion("nameHan in", values, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanNotIn(List<String> values) {
            addCriterion("nameHan not in", values, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanBetween(String value1, String value2) {
            addCriterion("nameHan between", value1, value2, "namehan");
            return (Criteria) this;
        }

        public Criteria andNamehanNotBetween(String value1, String value2) {
            addCriterion("nameHan not between", value1, value2, "namehan");
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