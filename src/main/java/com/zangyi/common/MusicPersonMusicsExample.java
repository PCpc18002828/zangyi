package com.zangyi.common;

import java.util.ArrayList;
import java.util.List;

public class MusicPersonMusicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MusicPersonMusicsExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSongzangIsNull() {
            addCriterion("songZang is null");
            return (Criteria) this;
        }

        public Criteria andSongzangIsNotNull() {
            addCriterion("songZang is not null");
            return (Criteria) this;
        }

        public Criteria andSongzangEqualTo(String value) {
            addCriterion("songZang =", value, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangNotEqualTo(String value) {
            addCriterion("songZang <>", value, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangGreaterThan(String value) {
            addCriterion("songZang >", value, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangGreaterThanOrEqualTo(String value) {
            addCriterion("songZang >=", value, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangLessThan(String value) {
            addCriterion("songZang <", value, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangLessThanOrEqualTo(String value) {
            addCriterion("songZang <=", value, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangLike(String value) {
            addCriterion("songZang like", value, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangNotLike(String value) {
            addCriterion("songZang not like", value, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangIn(List<String> values) {
            addCriterion("songZang in", values, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangNotIn(List<String> values) {
            addCriterion("songZang not in", values, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangBetween(String value1, String value2) {
            addCriterion("songZang between", value1, value2, "songzang");
            return (Criteria) this;
        }

        public Criteria andSongzangNotBetween(String value1, String value2) {
            addCriterion("songZang not between", value1, value2, "songzang");
            return (Criteria) this;
        }

        public Criteria andSonghanIsNull() {
            addCriterion("songHan is null");
            return (Criteria) this;
        }

        public Criteria andSonghanIsNotNull() {
            addCriterion("songHan is not null");
            return (Criteria) this;
        }

        public Criteria andSonghanEqualTo(String value) {
            addCriterion("songHan =", value, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanNotEqualTo(String value) {
            addCriterion("songHan <>", value, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanGreaterThan(String value) {
            addCriterion("songHan >", value, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanGreaterThanOrEqualTo(String value) {
            addCriterion("songHan >=", value, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanLessThan(String value) {
            addCriterion("songHan <", value, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanLessThanOrEqualTo(String value) {
            addCriterion("songHan <=", value, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanLike(String value) {
            addCriterion("songHan like", value, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanNotLike(String value) {
            addCriterion("songHan not like", value, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanIn(List<String> values) {
            addCriterion("songHan in", values, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanNotIn(List<String> values) {
            addCriterion("songHan not in", values, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanBetween(String value1, String value2) {
            addCriterion("songHan between", value1, value2, "songhan");
            return (Criteria) this;
        }

        public Criteria andSonghanNotBetween(String value1, String value2) {
            addCriterion("songHan not between", value1, value2, "songhan");
            return (Criteria) this;
        }

        public Criteria andSongaudioIsNull() {
            addCriterion("songAudio is null");
            return (Criteria) this;
        }

        public Criteria andSongaudioIsNotNull() {
            addCriterion("songAudio is not null");
            return (Criteria) this;
        }

        public Criteria andSongaudioEqualTo(String value) {
            addCriterion("songAudio =", value, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioNotEqualTo(String value) {
            addCriterion("songAudio <>", value, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioGreaterThan(String value) {
            addCriterion("songAudio >", value, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioGreaterThanOrEqualTo(String value) {
            addCriterion("songAudio >=", value, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioLessThan(String value) {
            addCriterion("songAudio <", value, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioLessThanOrEqualTo(String value) {
            addCriterion("songAudio <=", value, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioLike(String value) {
            addCriterion("songAudio like", value, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioNotLike(String value) {
            addCriterion("songAudio not like", value, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioIn(List<String> values) {
            addCriterion("songAudio in", values, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioNotIn(List<String> values) {
            addCriterion("songAudio not in", values, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioBetween(String value1, String value2) {
            addCriterion("songAudio between", value1, value2, "songaudio");
            return (Criteria) this;
        }

        public Criteria andSongaudioNotBetween(String value1, String value2) {
            addCriterion("songAudio not between", value1, value2, "songaudio");
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