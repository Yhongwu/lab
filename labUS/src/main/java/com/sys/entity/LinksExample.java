package com.sys.entity;

import java.util.ArrayList;
import java.util.List;

import com.sys.util.Page;

public class LinksExample {
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

	public LinksExample() {
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

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(Integer value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(Integer value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(Integer value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(Integer value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(Integer value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<Integer> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<Integer> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(Integer value1, Integer value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(Integer value1, Integer value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLNameIsNull() {
            addCriterion("l_name is null");
            return (Criteria) this;
        }

        public Criteria andLNameIsNotNull() {
            addCriterion("l_name is not null");
            return (Criteria) this;
        }

        public Criteria andLNameEqualTo(String value) {
            addCriterion("l_name =", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotEqualTo(String value) {
            addCriterion("l_name <>", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThan(String value) {
            addCriterion("l_name >", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThanOrEqualTo(String value) {
            addCriterion("l_name >=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThan(String value) {
            addCriterion("l_name <", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThanOrEqualTo(String value) {
            addCriterion("l_name <=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLike(String value) {
            addCriterion("l_name like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotLike(String value) {
            addCriterion("l_name not like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameIn(List<String> values) {
            addCriterion("l_name in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotIn(List<String> values) {
            addCriterion("l_name not in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameBetween(String value1, String value2) {
            addCriterion("l_name between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotBetween(String value1, String value2) {
            addCriterion("l_name not between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLUrlIsNull() {
            addCriterion("l_url is null");
            return (Criteria) this;
        }

        public Criteria andLUrlIsNotNull() {
            addCriterion("l_url is not null");
            return (Criteria) this;
        }

        public Criteria andLUrlEqualTo(String value) {
            addCriterion("l_url =", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotEqualTo(String value) {
            addCriterion("l_url <>", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlGreaterThan(String value) {
            addCriterion("l_url >", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlGreaterThanOrEqualTo(String value) {
            addCriterion("l_url >=", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLessThan(String value) {
            addCriterion("l_url <", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLessThanOrEqualTo(String value) {
            addCriterion("l_url <=", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLike(String value) {
            addCriterion("l_url like", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotLike(String value) {
            addCriterion("l_url not like", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlIn(List<String> values) {
            addCriterion("l_url in", values, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotIn(List<String> values) {
            addCriterion("l_url not in", values, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlBetween(String value1, String value2) {
            addCriterion("l_url between", value1, value2, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotBetween(String value1, String value2) {
            addCriterion("l_url not between", value1, value2, "lUrl");
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