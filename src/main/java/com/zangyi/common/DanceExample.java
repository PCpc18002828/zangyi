package com.zangyi.common;

import java.util.ArrayList;
import java.util.List;

public class DanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DanceExample() {
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

        public Criteria andPlaceidIsNull() {
            addCriterion("placeId is null");
            return (Criteria) this;
        }

        public Criteria andPlaceidIsNotNull() {
            addCriterion("placeId is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceidEqualTo(String value) {
            addCriterion("placeId =", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotEqualTo(String value) {
            addCriterion("placeId <>", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidGreaterThan(String value) {
            addCriterion("placeId >", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidGreaterThanOrEqualTo(String value) {
            addCriterion("placeId >=", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLessThan(String value) {
            addCriterion("placeId <", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLessThanOrEqualTo(String value) {
            addCriterion("placeId <=", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLike(String value) {
            addCriterion("placeId like", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotLike(String value) {
            addCriterion("placeId not like", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidIn(List<String> values) {
            addCriterion("placeId in", values, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotIn(List<String> values) {
            addCriterion("placeId not in", values, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidBetween(String value1, String value2) {
            addCriterion("placeId between", value1, value2, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotBetween(String value1, String value2) {
            addCriterion("placeId not between", value1, value2, "placeid");
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

        public Criteria andVideoimgIsNull() {
            addCriterion("videoImg is null");
            return (Criteria) this;
        }

        public Criteria andVideoimgIsNotNull() {
            addCriterion("videoImg is not null");
            return (Criteria) this;
        }

        public Criteria andVideoimgEqualTo(String value) {
            addCriterion("videoImg =", value, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgNotEqualTo(String value) {
            addCriterion("videoImg <>", value, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgGreaterThan(String value) {
            addCriterion("videoImg >", value, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgGreaterThanOrEqualTo(String value) {
            addCriterion("videoImg >=", value, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgLessThan(String value) {
            addCriterion("videoImg <", value, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgLessThanOrEqualTo(String value) {
            addCriterion("videoImg <=", value, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgLike(String value) {
            addCriterion("videoImg like", value, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgNotLike(String value) {
            addCriterion("videoImg not like", value, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgIn(List<String> values) {
            addCriterion("videoImg in", values, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgNotIn(List<String> values) {
            addCriterion("videoImg not in", values, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgBetween(String value1, String value2) {
            addCriterion("videoImg between", value1, value2, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideoimgNotBetween(String value1, String value2) {
            addCriterion("videoImg not between", value1, value2, "videoimg");
            return (Criteria) this;
        }

        public Criteria andVideotimeIsNull() {
            addCriterion("videoTime is null");
            return (Criteria) this;
        }

        public Criteria andVideotimeIsNotNull() {
            addCriterion("videoTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideotimeEqualTo(String value) {
            addCriterion("videoTime =", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotEqualTo(String value) {
            addCriterion("videoTime <>", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeGreaterThan(String value) {
            addCriterion("videoTime >", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeGreaterThanOrEqualTo(String value) {
            addCriterion("videoTime >=", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLessThan(String value) {
            addCriterion("videoTime <", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLessThanOrEqualTo(String value) {
            addCriterion("videoTime <=", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLike(String value) {
            addCriterion("videoTime like", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotLike(String value) {
            addCriterion("videoTime not like", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeIn(List<String> values) {
            addCriterion("videoTime in", values, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotIn(List<String> values) {
            addCriterion("videoTime not in", values, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeBetween(String value1, String value2) {
            addCriterion("videoTime between", value1, value2, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotBetween(String value1, String value2) {
            addCriterion("videoTime not between", value1, value2, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNull() {
            addCriterion("videoId is null");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNotNull() {
            addCriterion("videoId is not null");
            return (Criteria) this;
        }

        public Criteria andVideoidEqualTo(String value) {
            addCriterion("videoId =", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotEqualTo(String value) {
            addCriterion("videoId <>", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThan(String value) {
            addCriterion("videoId >", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThanOrEqualTo(String value) {
            addCriterion("videoId >=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThan(String value) {
            addCriterion("videoId <", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThanOrEqualTo(String value) {
            addCriterion("videoId <=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLike(String value) {
            addCriterion("videoId like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotLike(String value) {
            addCriterion("videoId not like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidIn(List<String> values) {
            addCriterion("videoId in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotIn(List<String> values) {
            addCriterion("videoId not in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidBetween(String value1, String value2) {
            addCriterion("videoId between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotBetween(String value1, String value2) {
            addCriterion("videoId not between", value1, value2, "videoid");
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