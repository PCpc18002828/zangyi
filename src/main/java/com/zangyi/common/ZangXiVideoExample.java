package com.zangyi.common;

import java.util.ArrayList;
import java.util.List;

public class ZangXiVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZangXiVideoExample() {
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

        public Criteria andVoideUrlIsNull() {
            addCriterion("voide_url is null");
            return (Criteria) this;
        }

        public Criteria andVoideUrlIsNotNull() {
            addCriterion("voide_url is not null");
            return (Criteria) this;
        }

        public Criteria andVoideUrlEqualTo(String value) {
            addCriterion("voide_url =", value, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlNotEqualTo(String value) {
            addCriterion("voide_url <>", value, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlGreaterThan(String value) {
            addCriterion("voide_url >", value, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlGreaterThanOrEqualTo(String value) {
            addCriterion("voide_url >=", value, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlLessThan(String value) {
            addCriterion("voide_url <", value, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlLessThanOrEqualTo(String value) {
            addCriterion("voide_url <=", value, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlLike(String value) {
            addCriterion("voide_url like", value, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlNotLike(String value) {
            addCriterion("voide_url not like", value, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlIn(List<String> values) {
            addCriterion("voide_url in", values, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlNotIn(List<String> values) {
            addCriterion("voide_url not in", values, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlBetween(String value1, String value2) {
            addCriterion("voide_url between", value1, value2, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andVoideUrlNotBetween(String value1, String value2) {
            addCriterion("voide_url not between", value1, value2, "voideUrl");
            return (Criteria) this;
        }

        public Criteria andNameZangIsNull() {
            addCriterion("name_zang is null");
            return (Criteria) this;
        }

        public Criteria andNameZangIsNotNull() {
            addCriterion("name_zang is not null");
            return (Criteria) this;
        }

        public Criteria andNameZangEqualTo(String value) {
            addCriterion("name_zang =", value, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangNotEqualTo(String value) {
            addCriterion("name_zang <>", value, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangGreaterThan(String value) {
            addCriterion("name_zang >", value, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangGreaterThanOrEqualTo(String value) {
            addCriterion("name_zang >=", value, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangLessThan(String value) {
            addCriterion("name_zang <", value, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangLessThanOrEqualTo(String value) {
            addCriterion("name_zang <=", value, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangLike(String value) {
            addCriterion("name_zang like", value, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangNotLike(String value) {
            addCriterion("name_zang not like", value, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangIn(List<String> values) {
            addCriterion("name_zang in", values, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangNotIn(List<String> values) {
            addCriterion("name_zang not in", values, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangBetween(String value1, String value2) {
            addCriterion("name_zang between", value1, value2, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameZangNotBetween(String value1, String value2) {
            addCriterion("name_zang not between", value1, value2, "nameZang");
            return (Criteria) this;
        }

        public Criteria andNameHanIsNull() {
            addCriterion("name_han is null");
            return (Criteria) this;
        }

        public Criteria andNameHanIsNotNull() {
            addCriterion("name_han is not null");
            return (Criteria) this;
        }

        public Criteria andNameHanEqualTo(String value) {
            addCriterion("name_han =", value, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanNotEqualTo(String value) {
            addCriterion("name_han <>", value, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanGreaterThan(String value) {
            addCriterion("name_han >", value, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanGreaterThanOrEqualTo(String value) {
            addCriterion("name_han >=", value, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanLessThan(String value) {
            addCriterion("name_han <", value, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanLessThanOrEqualTo(String value) {
            addCriterion("name_han <=", value, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanLike(String value) {
            addCriterion("name_han like", value, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanNotLike(String value) {
            addCriterion("name_han not like", value, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanIn(List<String> values) {
            addCriterion("name_han in", values, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanNotIn(List<String> values) {
            addCriterion("name_han not in", values, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanBetween(String value1, String value2) {
            addCriterion("name_han between", value1, value2, "nameHan");
            return (Criteria) this;
        }

        public Criteria andNameHanNotBetween(String value1, String value2) {
            addCriterion("name_han not between", value1, value2, "nameHan");
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