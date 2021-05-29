package com.zangyi.common;

import java.util.ArrayList;
import java.util.List;

public class MusicInstrumentPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MusicInstrumentPicExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("class_id like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("class_id not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andMusicalImgIsNull() {
            addCriterion("musical_img is null");
            return (Criteria) this;
        }

        public Criteria andMusicalImgIsNotNull() {
            addCriterion("musical_img is not null");
            return (Criteria) this;
        }

        public Criteria andMusicalImgEqualTo(String value) {
            addCriterion("musical_img =", value, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgNotEqualTo(String value) {
            addCriterion("musical_img <>", value, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgGreaterThan(String value) {
            addCriterion("musical_img >", value, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgGreaterThanOrEqualTo(String value) {
            addCriterion("musical_img >=", value, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgLessThan(String value) {
            addCriterion("musical_img <", value, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgLessThanOrEqualTo(String value) {
            addCriterion("musical_img <=", value, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgLike(String value) {
            addCriterion("musical_img like", value, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgNotLike(String value) {
            addCriterion("musical_img not like", value, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgIn(List<String> values) {
            addCriterion("musical_img in", values, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgNotIn(List<String> values) {
            addCriterion("musical_img not in", values, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgBetween(String value1, String value2) {
            addCriterion("musical_img between", value1, value2, "musicalImg");
            return (Criteria) this;
        }

        public Criteria andMusicalImgNotBetween(String value1, String value2) {
            addCriterion("musical_img not between", value1, value2, "musicalImg");
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