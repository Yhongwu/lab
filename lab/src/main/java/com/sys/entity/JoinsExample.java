package com.sys.entity;

import java.util.ArrayList;
import java.util.List;

import com.sys.util.Page;

public class JoinsExample {
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

	public JoinsExample() {
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

        public Criteria andJIdIsNull() {
            addCriterion("j_id is null");
            return (Criteria) this;
        }

        public Criteria andJIdIsNotNull() {
            addCriterion("j_id is not null");
            return (Criteria) this;
        }

        public Criteria andJIdEqualTo(Integer value) {
            addCriterion("j_id =", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdNotEqualTo(Integer value) {
            addCriterion("j_id <>", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdGreaterThan(Integer value) {
            addCriterion("j_id >", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("j_id >=", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdLessThan(Integer value) {
            addCriterion("j_id <", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdLessThanOrEqualTo(Integer value) {
            addCriterion("j_id <=", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdIn(List<Integer> values) {
            addCriterion("j_id in", values, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdNotIn(List<Integer> values) {
            addCriterion("j_id not in", values, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdBetween(Integer value1, Integer value2) {
            addCriterion("j_id between", value1, value2, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdNotBetween(Integer value1, Integer value2) {
            addCriterion("j_id not between", value1, value2, "jId");
            return (Criteria) this;
        }

        public Criteria andJComIsNull() {
            addCriterion("j_com is null");
            return (Criteria) this;
        }

        public Criteria andJComIsNotNull() {
            addCriterion("j_com is not null");
            return (Criteria) this;
        }

        public Criteria andJComEqualTo(String value) {
            addCriterion("j_com =", value, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComNotEqualTo(String value) {
            addCriterion("j_com <>", value, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComGreaterThan(String value) {
            addCriterion("j_com >", value, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComGreaterThanOrEqualTo(String value) {
            addCriterion("j_com >=", value, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComLessThan(String value) {
            addCriterion("j_com <", value, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComLessThanOrEqualTo(String value) {
            addCriterion("j_com <=", value, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComLike(String value) {
            addCriterion("j_com like", value, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComNotLike(String value) {
            addCriterion("j_com not like", value, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComIn(List<String> values) {
            addCriterion("j_com in", values, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComNotIn(List<String> values) {
            addCriterion("j_com not in", values, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComBetween(String value1, String value2) {
            addCriterion("j_com between", value1, value2, "jCom");
            return (Criteria) this;
        }

        public Criteria andJComNotBetween(String value1, String value2) {
            addCriterion("j_com not between", value1, value2, "jCom");
            return (Criteria) this;
        }

        public Criteria andJContentIsNull() {
            addCriterion("j_content is null");
            return (Criteria) this;
        }

        public Criteria andJContentIsNotNull() {
            addCriterion("j_content is not null");
            return (Criteria) this;
        }

        public Criteria andJContentEqualTo(String value) {
            addCriterion("j_content =", value, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentNotEqualTo(String value) {
            addCriterion("j_content <>", value, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentGreaterThan(String value) {
            addCriterion("j_content >", value, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentGreaterThanOrEqualTo(String value) {
            addCriterion("j_content >=", value, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentLessThan(String value) {
            addCriterion("j_content <", value, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentLessThanOrEqualTo(String value) {
            addCriterion("j_content <=", value, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentLike(String value) {
            addCriterion("j_content like", value, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentNotLike(String value) {
            addCriterion("j_content not like", value, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentIn(List<String> values) {
            addCriterion("j_content in", values, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentNotIn(List<String> values) {
            addCriterion("j_content not in", values, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentBetween(String value1, String value2) {
            addCriterion("j_content between", value1, value2, "jContent");
            return (Criteria) this;
        }

        public Criteria andJContentNotBetween(String value1, String value2) {
            addCriterion("j_content not between", value1, value2, "jContent");
            return (Criteria) this;
        }

        public Criteria andJTimeIsNull() {
            addCriterion("j_time is null");
            return (Criteria) this;
        }

        public Criteria andJTimeIsNotNull() {
            addCriterion("j_time is not null");
            return (Criteria) this;
        }

        public Criteria andJTimeEqualTo(String value) {
            addCriterion("j_time =", value, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeNotEqualTo(String value) {
            addCriterion("j_time <>", value, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeGreaterThan(String value) {
            addCriterion("j_time >", value, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeGreaterThanOrEqualTo(String value) {
            addCriterion("j_time >=", value, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeLessThan(String value) {
            addCriterion("j_time <", value, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeLessThanOrEqualTo(String value) {
            addCriterion("j_time <=", value, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeLike(String value) {
            addCriterion("j_time like", value, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeNotLike(String value) {
            addCriterion("j_time not like", value, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeIn(List<String> values) {
            addCriterion("j_time in", values, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeNotIn(List<String> values) {
            addCriterion("j_time not in", values, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeBetween(String value1, String value2) {
            addCriterion("j_time between", value1, value2, "jTime");
            return (Criteria) this;
        }

        public Criteria andJTimeNotBetween(String value1, String value2) {
            addCriterion("j_time not between", value1, value2, "jTime");
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

        public Criteria andJPoIsNull() {
            addCriterion("j_po is null");
            return (Criteria) this;
        }

        public Criteria andJPoIsNotNull() {
            addCriterion("j_po is not null");
            return (Criteria) this;
        }

        public Criteria andJPoEqualTo(Integer value) {
            addCriterion("j_po =", value, "jPo");
            return (Criteria) this;
        }

        public Criteria andJPoNotEqualTo(Integer value) {
            addCriterion("j_po <>", value, "jPo");
            return (Criteria) this;
        }

        public Criteria andJPoGreaterThan(Integer value) {
            addCriterion("j_po >", value, "jPo");
            return (Criteria) this;
        }

        public Criteria andJPoGreaterThanOrEqualTo(Integer value) {
            addCriterion("j_po >=", value, "jPo");
            return (Criteria) this;
        }

        public Criteria andJPoLessThan(Integer value) {
            addCriterion("j_po <", value, "jPo");
            return (Criteria) this;
        }

        public Criteria andJPoLessThanOrEqualTo(Integer value) {
            addCriterion("j_po <=", value, "jPo");
            return (Criteria) this;
        }

        public Criteria andJPoIn(List<Integer> values) {
            addCriterion("j_po in", values, "jPo");
            return (Criteria) this;
        }

        public Criteria andJPoNotIn(List<Integer> values) {
            addCriterion("j_po not in", values, "jPo");
            return (Criteria) this;
        }

        public Criteria andJPoBetween(Integer value1, Integer value2) {
            addCriterion("j_po between", value1, value2, "jPo");
            return (Criteria) this;
        }

        public Criteria andJPoNotBetween(Integer value1, Integer value2) {
            addCriterion("j_po not between", value1, value2, "jPo");
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