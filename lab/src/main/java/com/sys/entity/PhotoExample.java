package com.sys.entity;

import java.util.ArrayList;
import java.util.List;

import com.sys.util.Page;

public class PhotoExample {
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

	public PhotoExample() {
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

        public Criteria andPUrlIsNull() {
            addCriterion("p_url is null");
            return (Criteria) this;
        }

        public Criteria andPUrlIsNotNull() {
            addCriterion("p_url is not null");
            return (Criteria) this;
        }

        public Criteria andPUrlEqualTo(String value) {
            addCriterion("p_url =", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotEqualTo(String value) {
            addCriterion("p_url <>", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlGreaterThan(String value) {
            addCriterion("p_url >", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlGreaterThanOrEqualTo(String value) {
            addCriterion("p_url >=", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLessThan(String value) {
            addCriterion("p_url <", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLessThanOrEqualTo(String value) {
            addCriterion("p_url <=", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLike(String value) {
            addCriterion("p_url like", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotLike(String value) {
            addCriterion("p_url not like", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlIn(List<String> values) {
            addCriterion("p_url in", values, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotIn(List<String> values) {
            addCriterion("p_url not in", values, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlBetween(String value1, String value2) {
            addCriterion("p_url between", value1, value2, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotBetween(String value1, String value2) {
            addCriterion("p_url not between", value1, value2, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPShowIsNull() {
            addCriterion("p_show is null");
            return (Criteria) this;
        }

        public Criteria andPShowIsNotNull() {
            addCriterion("p_show is not null");
            return (Criteria) this;
        }

        public Criteria andPShowEqualTo(String value) {
            addCriterion("p_show =", value, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowNotEqualTo(String value) {
            addCriterion("p_show <>", value, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowGreaterThan(String value) {
            addCriterion("p_show >", value, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowGreaterThanOrEqualTo(String value) {
            addCriterion("p_show >=", value, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowLessThan(String value) {
            addCriterion("p_show <", value, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowLessThanOrEqualTo(String value) {
            addCriterion("p_show <=", value, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowLike(String value) {
            addCriterion("p_show like", value, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowNotLike(String value) {
            addCriterion("p_show not like", value, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowIn(List<String> values) {
            addCriterion("p_show in", values, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowNotIn(List<String> values) {
            addCriterion("p_show not in", values, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowBetween(String value1, String value2) {
            addCriterion("p_show between", value1, value2, "pShow");
            return (Criteria) this;
        }

        public Criteria andPShowNotBetween(String value1, String value2) {
            addCriterion("p_show not between", value1, value2, "pShow");
            return (Criteria) this;
        }

        public Criteria andPStatusIsNull() {
            addCriterion("p_status is null");
            return (Criteria) this;
        }

        public Criteria andPStatusIsNotNull() {
            addCriterion("p_status is not null");
            return (Criteria) this;
        }

        public Criteria andPStatusEqualTo(Integer value) {
            addCriterion("p_status =", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotEqualTo(Integer value) {
            addCriterion("p_status <>", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusGreaterThan(Integer value) {
            addCriterion("p_status >", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_status >=", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLessThan(Integer value) {
            addCriterion("p_status <", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLessThanOrEqualTo(Integer value) {
            addCriterion("p_status <=", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusIn(List<Integer> values) {
            addCriterion("p_status in", values, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotIn(List<Integer> values) {
            addCriterion("p_status not in", values, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusBetween(Integer value1, Integer value2) {
            addCriterion("p_status between", value1, value2, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("p_status not between", value1, value2, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPLaborteamIsNull() {
            addCriterion("p_laborteam is null");
            return (Criteria) this;
        }

        public Criteria andPLaborteamIsNotNull() {
            addCriterion("p_laborteam is not null");
            return (Criteria) this;
        }

        public Criteria andPLaborteamEqualTo(Integer value) {
            addCriterion("p_laborteam =", value, "pLaborteam");
            return (Criteria) this;
        }

        public Criteria andPLaborteamNotEqualTo(Integer value) {
            addCriterion("p_laborteam <>", value, "pLaborteam");
            return (Criteria) this;
        }

        public Criteria andPLaborteamGreaterThan(Integer value) {
            addCriterion("p_laborteam >", value, "pLaborteam");
            return (Criteria) this;
        }

        public Criteria andPLaborteamGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_laborteam >=", value, "pLaborteam");
            return (Criteria) this;
        }

        public Criteria andPLaborteamLessThan(Integer value) {
            addCriterion("p_laborteam <", value, "pLaborteam");
            return (Criteria) this;
        }

        public Criteria andPLaborteamLessThanOrEqualTo(Integer value) {
            addCriterion("p_laborteam <=", value, "pLaborteam");
            return (Criteria) this;
        }

        public Criteria andPLaborteamIn(List<Integer> values) {
            addCriterion("p_laborteam in", values, "pLaborteam");
            return (Criteria) this;
        }

        public Criteria andPLaborteamNotIn(List<Integer> values) {
            addCriterion("p_laborteam not in", values, "pLaborteam");
            return (Criteria) this;
        }

        public Criteria andPLaborteamBetween(Integer value1, Integer value2) {
            addCriterion("p_laborteam between", value1, value2, "pLaborteam");
            return (Criteria) this;
        }

        public Criteria andPLaborteamNotBetween(Integer value1, Integer value2) {
            addCriterion("p_laborteam not between", value1, value2, "pLaborteam");
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