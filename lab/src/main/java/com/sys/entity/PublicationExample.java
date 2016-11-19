package com.sys.entity;

import java.util.ArrayList;
import java.util.List;

import com.sys.util.Page;

public class PublicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected Page page;
    
    public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public PublicationExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPYearIsNull() {
            addCriterion("p_year is null");
            return (Criteria) this;
        }

        public Criteria andPYearIsNotNull() {
            addCriterion("p_year is not null");
            return (Criteria) this;
        }

        public Criteria andPYearEqualTo(String value) {
            addCriterion("p_year =", value, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearNotEqualTo(String value) {
            addCriterion("p_year <>", value, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearGreaterThan(String value) {
            addCriterion("p_year >", value, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearGreaterThanOrEqualTo(String value) {
            addCriterion("p_year >=", value, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearLessThan(String value) {
            addCriterion("p_year <", value, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearLessThanOrEqualTo(String value) {
            addCriterion("p_year <=", value, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearLike(String value) {
            addCriterion("p_year like", value, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearNotLike(String value) {
            addCriterion("p_year not like", value, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearIn(List<String> values) {
            addCriterion("p_year in", values, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearNotIn(List<String> values) {
            addCriterion("p_year not in", values, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearBetween(String value1, String value2) {
            addCriterion("p_year between", value1, value2, "pYear");
            return (Criteria) this;
        }

        public Criteria andPYearNotBetween(String value1, String value2) {
            addCriterion("p_year not between", value1, value2, "pYear");
            return (Criteria) this;
        }

        public Criteria andPTimeIsNull() {
            addCriterion("p_time is null");
            return (Criteria) this;
        }

        public Criteria andPTimeIsNotNull() {
            addCriterion("p_time is not null");
            return (Criteria) this;
        }

        public Criteria andPTimeEqualTo(String value) {
            addCriterion("p_time =", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotEqualTo(String value) {
            addCriterion("p_time <>", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeGreaterThan(String value) {
            addCriterion("p_time >", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeGreaterThanOrEqualTo(String value) {
            addCriterion("p_time >=", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeLessThan(String value) {
            addCriterion("p_time <", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeLessThanOrEqualTo(String value) {
            addCriterion("p_time <=", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeLike(String value) {
            addCriterion("p_time like", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotLike(String value) {
            addCriterion("p_time not like", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeIn(List<String> values) {
            addCriterion("p_time in", values, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotIn(List<String> values) {
            addCriterion("p_time not in", values, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeBetween(String value1, String value2) {
            addCriterion("p_time between", value1, value2, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotBetween(String value1, String value2) {
            addCriterion("p_time not between", value1, value2, "pTime");
            return (Criteria) this;
        }

        public Criteria andUTimeIsNull() {
            addCriterion("u_time is null");
            return (Criteria) this;
        }

        public Criteria andUTimeIsNotNull() {
            addCriterion("u_time is not null");
            return (Criteria) this;
        }

        public Criteria andUTimeEqualTo(String value) {
            addCriterion("u_time =", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeNotEqualTo(String value) {
            addCriterion("u_time <>", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeGreaterThan(String value) {
            addCriterion("u_time >", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeGreaterThanOrEqualTo(String value) {
            addCriterion("u_time >=", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeLessThan(String value) {
            addCriterion("u_time <", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeLessThanOrEqualTo(String value) {
            addCriterion("u_time <=", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeLike(String value) {
            addCriterion("u_time like", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeNotLike(String value) {
            addCriterion("u_time not like", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeIn(List<String> values) {
            addCriterion("u_time in", values, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeNotIn(List<String> values) {
            addCriterion("u_time not in", values, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeBetween(String value1, String value2) {
            addCriterion("u_time between", value1, value2, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeNotBetween(String value1, String value2) {
            addCriterion("u_time not between", value1, value2, "uTime");
            return (Criteria) this;
        }

        public Criteria andPContentIsNull() {
            addCriterion("p_content is null");
            return (Criteria) this;
        }

        public Criteria andPContentIsNotNull() {
            addCriterion("p_content is not null");
            return (Criteria) this;
        }

        public Criteria andPContentEqualTo(String value) {
            addCriterion("p_content =", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotEqualTo(String value) {
            addCriterion("p_content <>", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentGreaterThan(String value) {
            addCriterion("p_content >", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentGreaterThanOrEqualTo(String value) {
            addCriterion("p_content >=", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLessThan(String value) {
            addCriterion("p_content <", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLessThanOrEqualTo(String value) {
            addCriterion("p_content <=", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLike(String value) {
            addCriterion("p_content like", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotLike(String value) {
            addCriterion("p_content not like", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentIn(List<String> values) {
            addCriterion("p_content in", values, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotIn(List<String> values) {
            addCriterion("p_content not in", values, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentBetween(String value1, String value2) {
            addCriterion("p_content between", value1, value2, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotBetween(String value1, String value2) {
            addCriterion("p_content not between", value1, value2, "pContent");
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