package com.sys.entity;

import java.util.ArrayList;
import java.util.List;

import com.sys.util.Page;

public class HomeTopicExample {
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

	public HomeTopicExample() {
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Integer value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Integer value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Integer value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Integer value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Integer> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Integer> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Integer value1, Integer value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHUrlIsNull() {
            addCriterion("h_url is null");
            return (Criteria) this;
        }

        public Criteria andHUrlIsNotNull() {
            addCriterion("h_url is not null");
            return (Criteria) this;
        }

        public Criteria andHUrlEqualTo(String value) {
            addCriterion("h_url =", value, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlNotEqualTo(String value) {
            addCriterion("h_url <>", value, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlGreaterThan(String value) {
            addCriterion("h_url >", value, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlGreaterThanOrEqualTo(String value) {
            addCriterion("h_url >=", value, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlLessThan(String value) {
            addCriterion("h_url <", value, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlLessThanOrEqualTo(String value) {
            addCriterion("h_url <=", value, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlLike(String value) {
            addCriterion("h_url like", value, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlNotLike(String value) {
            addCriterion("h_url not like", value, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlIn(List<String> values) {
            addCriterion("h_url in", values, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlNotIn(List<String> values) {
            addCriterion("h_url not in", values, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlBetween(String value1, String value2) {
            addCriterion("h_url between", value1, value2, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHUrlNotBetween(String value1, String value2) {
            addCriterion("h_url not between", value1, value2, "hUrl");
            return (Criteria) this;
        }

        public Criteria andHStatusIsNull() {
            addCriterion("h_status is null");
            return (Criteria) this;
        }

        public Criteria andHStatusIsNotNull() {
            addCriterion("h_status is not null");
            return (Criteria) this;
        }

        public Criteria andHStatusEqualTo(Integer value) {
            addCriterion("h_status =", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotEqualTo(Integer value) {
            addCriterion("h_status <>", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusGreaterThan(Integer value) {
            addCriterion("h_status >", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_status >=", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusLessThan(Integer value) {
            addCriterion("h_status <", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusLessThanOrEqualTo(Integer value) {
            addCriterion("h_status <=", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusIn(List<Integer> values) {
            addCriterion("h_status in", values, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotIn(List<Integer> values) {
            addCriterion("h_status not in", values, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusBetween(Integer value1, Integer value2) {
            addCriterion("h_status between", value1, value2, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("h_status not between", value1, value2, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHNumberIsNull() {
            addCriterion("h_number is null");
            return (Criteria) this;
        }

        public Criteria andHNumberIsNotNull() {
            addCriterion("h_number is not null");
            return (Criteria) this;
        }

        public Criteria andHNumberEqualTo(Integer value) {
            addCriterion("h_number =", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberNotEqualTo(Integer value) {
            addCriterion("h_number <>", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberGreaterThan(Integer value) {
            addCriterion("h_number >", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_number >=", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberLessThan(Integer value) {
            addCriterion("h_number <", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberLessThanOrEqualTo(Integer value) {
            addCriterion("h_number <=", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberIn(List<Integer> values) {
            addCriterion("h_number in", values, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberNotIn(List<Integer> values) {
            addCriterion("h_number not in", values, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberBetween(Integer value1, Integer value2) {
            addCriterion("h_number between", value1, value2, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("h_number not between", value1, value2, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHTitleIsNull() {
            addCriterion("h_title is null");
            return (Criteria) this;
        }

        public Criteria andHTitleIsNotNull() {
            addCriterion("h_title is not null");
            return (Criteria) this;
        }

        public Criteria andHTitleEqualTo(String value) {
            addCriterion("h_title =", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotEqualTo(String value) {
            addCriterion("h_title <>", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleGreaterThan(String value) {
            addCriterion("h_title >", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleGreaterThanOrEqualTo(String value) {
            addCriterion("h_title >=", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleLessThan(String value) {
            addCriterion("h_title <", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleLessThanOrEqualTo(String value) {
            addCriterion("h_title <=", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleLike(String value) {
            addCriterion("h_title like", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotLike(String value) {
            addCriterion("h_title not like", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleIn(List<String> values) {
            addCriterion("h_title in", values, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotIn(List<String> values) {
            addCriterion("h_title not in", values, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleBetween(String value1, String value2) {
            addCriterion("h_title between", value1, value2, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotBetween(String value1, String value2) {
            addCriterion("h_title not between", value1, value2, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHContentIsNull() {
            addCriterion("h_content is null");
            return (Criteria) this;
        }

        public Criteria andHContentIsNotNull() {
            addCriterion("h_content is not null");
            return (Criteria) this;
        }

        public Criteria andHContentEqualTo(String value) {
            addCriterion("h_content =", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotEqualTo(String value) {
            addCriterion("h_content <>", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentGreaterThan(String value) {
            addCriterion("h_content >", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentGreaterThanOrEqualTo(String value) {
            addCriterion("h_content >=", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLessThan(String value) {
            addCriterion("h_content <", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLessThanOrEqualTo(String value) {
            addCriterion("h_content <=", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLike(String value) {
            addCriterion("h_content like", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotLike(String value) {
            addCriterion("h_content not like", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentIn(List<String> values) {
            addCriterion("h_content in", values, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotIn(List<String> values) {
            addCriterion("h_content not in", values, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentBetween(String value1, String value2) {
            addCriterion("h_content between", value1, value2, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotBetween(String value1, String value2) {
            addCriterion("h_content not between", value1, value2, "hContent");
            return (Criteria) this;
        }

        public Criteria andHSummaryIsNull() {
            addCriterion("h_summary is null");
            return (Criteria) this;
        }

        public Criteria andHSummaryIsNotNull() {
            addCriterion("h_summary is not null");
            return (Criteria) this;
        }

        public Criteria andHSummaryEqualTo(String value) {
            addCriterion("h_summary =", value, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryNotEqualTo(String value) {
            addCriterion("h_summary <>", value, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryGreaterThan(String value) {
            addCriterion("h_summary >", value, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("h_summary >=", value, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryLessThan(String value) {
            addCriterion("h_summary <", value, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryLessThanOrEqualTo(String value) {
            addCriterion("h_summary <=", value, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryLike(String value) {
            addCriterion("h_summary like", value, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryNotLike(String value) {
            addCriterion("h_summary not like", value, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryIn(List<String> values) {
            addCriterion("h_summary in", values, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryNotIn(List<String> values) {
            addCriterion("h_summary not in", values, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryBetween(String value1, String value2) {
            addCriterion("h_summary between", value1, value2, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHSummaryNotBetween(String value1, String value2) {
            addCriterion("h_summary not between", value1, value2, "hSummary");
            return (Criteria) this;
        }

        public Criteria andHTimeIsNull() {
            addCriterion("h_time is null");
            return (Criteria) this;
        }

        public Criteria andHTimeIsNotNull() {
            addCriterion("h_time is not null");
            return (Criteria) this;
        }

        public Criteria andHTimeEqualTo(String value) {
            addCriterion("h_time =", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotEqualTo(String value) {
            addCriterion("h_time <>", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeGreaterThan(String value) {
            addCriterion("h_time >", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeGreaterThanOrEqualTo(String value) {
            addCriterion("h_time >=", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLessThan(String value) {
            addCriterion("h_time <", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLessThanOrEqualTo(String value) {
            addCriterion("h_time <=", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLike(String value) {
            addCriterion("h_time like", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotLike(String value) {
            addCriterion("h_time not like", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeIn(List<String> values) {
            addCriterion("h_time in", values, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotIn(List<String> values) {
            addCriterion("h_time not in", values, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeBetween(String value1, String value2) {
            addCriterion("h_time between", value1, value2, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotBetween(String value1, String value2) {
            addCriterion("h_time not between", value1, value2, "hTime");
            return (Criteria) this;
        }

        public Criteria andHContent2IsNull() {
            addCriterion("h_content2 is null");
            return (Criteria) this;
        }

        public Criteria andHContent2IsNotNull() {
            addCriterion("h_content2 is not null");
            return (Criteria) this;
        }

        public Criteria andHContent2EqualTo(String value) {
            addCriterion("h_content2 =", value, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2NotEqualTo(String value) {
            addCriterion("h_content2 <>", value, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2GreaterThan(String value) {
            addCriterion("h_content2 >", value, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2GreaterThanOrEqualTo(String value) {
            addCriterion("h_content2 >=", value, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2LessThan(String value) {
            addCriterion("h_content2 <", value, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2LessThanOrEqualTo(String value) {
            addCriterion("h_content2 <=", value, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2Like(String value) {
            addCriterion("h_content2 like", value, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2NotLike(String value) {
            addCriterion("h_content2 not like", value, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2In(List<String> values) {
            addCriterion("h_content2 in", values, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2NotIn(List<String> values) {
            addCriterion("h_content2 not in", values, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2Between(String value1, String value2) {
            addCriterion("h_content2 between", value1, value2, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHContent2NotBetween(String value1, String value2) {
            addCriterion("h_content2 not between", value1, value2, "hContent2");
            return (Criteria) this;
        }

        public Criteria andHVurlIsNull() {
            addCriterion("h_vurl is null");
            return (Criteria) this;
        }

        public Criteria andHVurlIsNotNull() {
            addCriterion("h_vurl is not null");
            return (Criteria) this;
        }

        public Criteria andHVurlEqualTo(String value) {
            addCriterion("h_vurl =", value, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlNotEqualTo(String value) {
            addCriterion("h_vurl <>", value, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlGreaterThan(String value) {
            addCriterion("h_vurl >", value, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlGreaterThanOrEqualTo(String value) {
            addCriterion("h_vurl >=", value, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlLessThan(String value) {
            addCriterion("h_vurl <", value, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlLessThanOrEqualTo(String value) {
            addCriterion("h_vurl <=", value, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlLike(String value) {
            addCriterion("h_vurl like", value, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlNotLike(String value) {
            addCriterion("h_vurl not like", value, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlIn(List<String> values) {
            addCriterion("h_vurl in", values, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlNotIn(List<String> values) {
            addCriterion("h_vurl not in", values, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlBetween(String value1, String value2) {
            addCriterion("h_vurl between", value1, value2, "hVurl");
            return (Criteria) this;
        }

        public Criteria andHVurlNotBetween(String value1, String value2) {
            addCriterion("h_vurl not between", value1, value2, "hVurl");
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