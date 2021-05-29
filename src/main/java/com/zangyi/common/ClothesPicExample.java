package com.zangyi.common;

import java.util.ArrayList;
import java.util.List;

public class ClothesPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClothesPicExample() {
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

        public Criteria andClothesIdIsNull() {
            addCriterion("clothes_id is null");
            return (Criteria) this;
        }

        public Criteria andClothesIdIsNotNull() {
            addCriterion("clothes_id is not null");
            return (Criteria) this;
        }

        public Criteria andClothesIdEqualTo(String value) {
            addCriterion("clothes_id =", value, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdNotEqualTo(String value) {
            addCriterion("clothes_id <>", value, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdGreaterThan(String value) {
            addCriterion("clothes_id >", value, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdGreaterThanOrEqualTo(String value) {
            addCriterion("clothes_id >=", value, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdLessThan(String value) {
            addCriterion("clothes_id <", value, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdLessThanOrEqualTo(String value) {
            addCriterion("clothes_id <=", value, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdLike(String value) {
            addCriterion("clothes_id like", value, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdNotLike(String value) {
            addCriterion("clothes_id not like", value, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdIn(List<String> values) {
            addCriterion("clothes_id in", values, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdNotIn(List<String> values) {
            addCriterion("clothes_id not in", values, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdBetween(String value1, String value2) {
            addCriterion("clothes_id between", value1, value2, "clothesId");
            return (Criteria) this;
        }

        public Criteria andClothesIdNotBetween(String value1, String value2) {
            addCriterion("clothes_id not between", value1, value2, "clothesId");
            return (Criteria) this;
        }

        public Criteria andZangNameIsNull() {
            addCriterion("zang_name is null");
            return (Criteria) this;
        }

        public Criteria andZangNameIsNotNull() {
            addCriterion("zang_name is not null");
            return (Criteria) this;
        }

        public Criteria andZangNameEqualTo(String value) {
            addCriterion("zang_name =", value, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameNotEqualTo(String value) {
            addCriterion("zang_name <>", value, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameGreaterThan(String value) {
            addCriterion("zang_name >", value, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameGreaterThanOrEqualTo(String value) {
            addCriterion("zang_name >=", value, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameLessThan(String value) {
            addCriterion("zang_name <", value, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameLessThanOrEqualTo(String value) {
            addCriterion("zang_name <=", value, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameLike(String value) {
            addCriterion("zang_name like", value, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameNotLike(String value) {
            addCriterion("zang_name not like", value, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameIn(List<String> values) {
            addCriterion("zang_name in", values, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameNotIn(List<String> values) {
            addCriterion("zang_name not in", values, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameBetween(String value1, String value2) {
            addCriterion("zang_name between", value1, value2, "zangName");
            return (Criteria) this;
        }

        public Criteria andZangNameNotBetween(String value1, String value2) {
            addCriterion("zang_name not between", value1, value2, "zangName");
            return (Criteria) this;
        }

        public Criteria andHanNameIsNull() {
            addCriterion("han_name is null");
            return (Criteria) this;
        }

        public Criteria andHanNameIsNotNull() {
            addCriterion("han_name is not null");
            return (Criteria) this;
        }

        public Criteria andHanNameEqualTo(String value) {
            addCriterion("han_name =", value, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameNotEqualTo(String value) {
            addCriterion("han_name <>", value, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameGreaterThan(String value) {
            addCriterion("han_name >", value, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameGreaterThanOrEqualTo(String value) {
            addCriterion("han_name >=", value, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameLessThan(String value) {
            addCriterion("han_name <", value, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameLessThanOrEqualTo(String value) {
            addCriterion("han_name <=", value, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameLike(String value) {
            addCriterion("han_name like", value, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameNotLike(String value) {
            addCriterion("han_name not like", value, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameIn(List<String> values) {
            addCriterion("han_name in", values, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameNotIn(List<String> values) {
            addCriterion("han_name not in", values, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameBetween(String value1, String value2) {
            addCriterion("han_name between", value1, value2, "hanName");
            return (Criteria) this;
        }

        public Criteria andHanNameNotBetween(String value1, String value2) {
            addCriterion("han_name not between", value1, value2, "hanName");
            return (Criteria) this;
        }

        public Criteria andClothesPicIsNull() {
            addCriterion("clothes_pic is null");
            return (Criteria) this;
        }

        public Criteria andClothesPicIsNotNull() {
            addCriterion("clothes_pic is not null");
            return (Criteria) this;
        }

        public Criteria andClothesPicEqualTo(String value) {
            addCriterion("clothes_pic =", value, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicNotEqualTo(String value) {
            addCriterion("clothes_pic <>", value, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicGreaterThan(String value) {
            addCriterion("clothes_pic >", value, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicGreaterThanOrEqualTo(String value) {
            addCriterion("clothes_pic >=", value, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicLessThan(String value) {
            addCriterion("clothes_pic <", value, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicLessThanOrEqualTo(String value) {
            addCriterion("clothes_pic <=", value, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicLike(String value) {
            addCriterion("clothes_pic like", value, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicNotLike(String value) {
            addCriterion("clothes_pic not like", value, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicIn(List<String> values) {
            addCriterion("clothes_pic in", values, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicNotIn(List<String> values) {
            addCriterion("clothes_pic not in", values, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicBetween(String value1, String value2) {
            addCriterion("clothes_pic between", value1, value2, "clothesPic");
            return (Criteria) this;
        }

        public Criteria andClothesPicNotBetween(String value1, String value2) {
            addCriterion("clothes_pic not between", value1, value2, "clothesPic");
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