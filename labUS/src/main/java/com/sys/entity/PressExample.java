package com.sys.entity;

import java.util.ArrayList;
import java.util.List;

import com.sys.util.Page;

public class PressExample {
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

	public PressExample() {
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

        public Criteria andPTitleIsNull() {
            addCriterion("p_title is null");
            return (Criteria) this;
        }

        public Criteria andPTitleIsNotNull() {
            addCriterion("p_title is not null");
            return (Criteria) this;
        }

        public Criteria andPTitleEqualTo(String value) {
            addCriterion("p_title =", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotEqualTo(String value) {
            addCriterion("p_title <>", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleGreaterThan(String value) {
            addCriterion("p_title >", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleGreaterThanOrEqualTo(String value) {
            addCriterion("p_title >=", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLessThan(String value) {
            addCriterion("p_title <", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLessThanOrEqualTo(String value) {
            addCriterion("p_title <=", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLike(String value) {
            addCriterion("p_title like", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotLike(String value) {
            addCriterion("p_title not like", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleIn(List<String> values) {
            addCriterion("p_title in", values, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotIn(List<String> values) {
            addCriterion("p_title not in", values, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleBetween(String value1, String value2) {
            addCriterion("p_title between", value1, value2, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotBetween(String value1, String value2) {
            addCriterion("p_title not between", value1, value2, "pTitle");
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

        public Criteria andPSummaryIsNull() {
            addCriterion("p_summary is null");
            return (Criteria) this;
        }

        public Criteria andPSummaryIsNotNull() {
            addCriterion("p_summary is not null");
            return (Criteria) this;
        }

        public Criteria andPSummaryEqualTo(String value) {
            addCriterion("p_summary =", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryNotEqualTo(String value) {
            addCriterion("p_summary <>", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryGreaterThan(String value) {
            addCriterion("p_summary >", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("p_summary >=", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryLessThan(String value) {
            addCriterion("p_summary <", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryLessThanOrEqualTo(String value) {
            addCriterion("p_summary <=", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryLike(String value) {
            addCriterion("p_summary like", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryNotLike(String value) {
            addCriterion("p_summary not like", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryIn(List<String> values) {
            addCriterion("p_summary in", values, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryNotIn(List<String> values) {
            addCriterion("p_summary not in", values, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryBetween(String value1, String value2) {
            addCriterion("p_summary between", value1, value2, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryNotBetween(String value1, String value2) {
            addCriterion("p_summary not between", value1, value2, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPContent2IsNull() {
            addCriterion("p_content2 is null");
            return (Criteria) this;
        }

        public Criteria andPContent2IsNotNull() {
            addCriterion("p_content2 is not null");
            return (Criteria) this;
        }

        public Criteria andPContent2EqualTo(String value) {
            addCriterion("p_content2 =", value, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2NotEqualTo(String value) {
            addCriterion("p_content2 <>", value, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2GreaterThan(String value) {
            addCriterion("p_content2 >", value, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2GreaterThanOrEqualTo(String value) {
            addCriterion("p_content2 >=", value, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2LessThan(String value) {
            addCriterion("p_content2 <", value, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2LessThanOrEqualTo(String value) {
            addCriterion("p_content2 <=", value, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2Like(String value) {
            addCriterion("p_content2 like", value, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2NotLike(String value) {
            addCriterion("p_content2 not like", value, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2In(List<String> values) {
            addCriterion("p_content2 in", values, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2NotIn(List<String> values) {
            addCriterion("p_content2 not in", values, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2Between(String value1, String value2) {
            addCriterion("p_content2 between", value1, value2, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPContent2NotBetween(String value1, String value2) {
            addCriterion("p_content2 not between", value1, value2, "pContent2");
            return (Criteria) this;
        }

        public Criteria andPVurlIsNull() {
            addCriterion("p_vurl is null");
            return (Criteria) this;
        }

        public Criteria andPVurlIsNotNull() {
            addCriterion("p_vurl is not null");
            return (Criteria) this;
        }

        public Criteria andPVurlEqualTo(String value) {
            addCriterion("p_vurl =", value, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlNotEqualTo(String value) {
            addCriterion("p_vurl <>", value, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlGreaterThan(String value) {
            addCriterion("p_vurl >", value, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlGreaterThanOrEqualTo(String value) {
            addCriterion("p_vurl >=", value, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlLessThan(String value) {
            addCriterion("p_vurl <", value, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlLessThanOrEqualTo(String value) {
            addCriterion("p_vurl <=", value, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlLike(String value) {
            addCriterion("p_vurl like", value, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlNotLike(String value) {
            addCriterion("p_vurl not like", value, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlIn(List<String> values) {
            addCriterion("p_vurl in", values, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlNotIn(List<String> values) {
            addCriterion("p_vurl not in", values, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlBetween(String value1, String value2) {
            addCriterion("p_vurl between", value1, value2, "pVurl");
            return (Criteria) this;
        }

        public Criteria andPVurlNotBetween(String value1, String value2) {
            addCriterion("p_vurl not between", value1, value2, "pVurl");
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