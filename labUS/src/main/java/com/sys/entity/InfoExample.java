package com.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoExample() {
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

        public Criteria andIIdIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(Integer value) {
            addCriterion("i_id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(Integer value) {
            addCriterion("i_id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(Integer value) {
            addCriterion("i_id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(Integer value) {
            addCriterion("i_id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<Integer> values) {
            addCriterion("i_id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<Integer> values) {
            addCriterion("i_id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(Integer value1, Integer value2) {
            addCriterion("i_id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_id not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andITelIsNull() {
            addCriterion("i_tel is null");
            return (Criteria) this;
        }

        public Criteria andITelIsNotNull() {
            addCriterion("i_tel is not null");
            return (Criteria) this;
        }

        public Criteria andITelEqualTo(String value) {
            addCriterion("i_tel =", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelNotEqualTo(String value) {
            addCriterion("i_tel <>", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelGreaterThan(String value) {
            addCriterion("i_tel >", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelGreaterThanOrEqualTo(String value) {
            addCriterion("i_tel >=", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelLessThan(String value) {
            addCriterion("i_tel <", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelLessThanOrEqualTo(String value) {
            addCriterion("i_tel <=", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelLike(String value) {
            addCriterion("i_tel like", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelNotLike(String value) {
            addCriterion("i_tel not like", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelIn(List<String> values) {
            addCriterion("i_tel in", values, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelNotIn(List<String> values) {
            addCriterion("i_tel not in", values, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelBetween(String value1, String value2) {
            addCriterion("i_tel between", value1, value2, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelNotBetween(String value1, String value2) {
            addCriterion("i_tel not between", value1, value2, "iTel");
            return (Criteria) this;
        }

        public Criteria andIEmailIsNull() {
            addCriterion("i_email is null");
            return (Criteria) this;
        }

        public Criteria andIEmailIsNotNull() {
            addCriterion("i_email is not null");
            return (Criteria) this;
        }

        public Criteria andIEmailEqualTo(String value) {
            addCriterion("i_email =", value, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailNotEqualTo(String value) {
            addCriterion("i_email <>", value, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailGreaterThan(String value) {
            addCriterion("i_email >", value, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailGreaterThanOrEqualTo(String value) {
            addCriterion("i_email >=", value, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailLessThan(String value) {
            addCriterion("i_email <", value, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailLessThanOrEqualTo(String value) {
            addCriterion("i_email <=", value, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailLike(String value) {
            addCriterion("i_email like", value, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailNotLike(String value) {
            addCriterion("i_email not like", value, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailIn(List<String> values) {
            addCriterion("i_email in", values, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailNotIn(List<String> values) {
            addCriterion("i_email not in", values, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailBetween(String value1, String value2) {
            addCriterion("i_email between", value1, value2, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIEmailNotBetween(String value1, String value2) {
            addCriterion("i_email not between", value1, value2, "iEmail");
            return (Criteria) this;
        }

        public Criteria andIAddrIsNull() {
            addCriterion("i_addr is null");
            return (Criteria) this;
        }

        public Criteria andIAddrIsNotNull() {
            addCriterion("i_addr is not null");
            return (Criteria) this;
        }

        public Criteria andIAddrEqualTo(String value) {
            addCriterion("i_addr =", value, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrNotEqualTo(String value) {
            addCriterion("i_addr <>", value, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrGreaterThan(String value) {
            addCriterion("i_addr >", value, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrGreaterThanOrEqualTo(String value) {
            addCriterion("i_addr >=", value, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrLessThan(String value) {
            addCriterion("i_addr <", value, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrLessThanOrEqualTo(String value) {
            addCriterion("i_addr <=", value, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrLike(String value) {
            addCriterion("i_addr like", value, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrNotLike(String value) {
            addCriterion("i_addr not like", value, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrIn(List<String> values) {
            addCriterion("i_addr in", values, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrNotIn(List<String> values) {
            addCriterion("i_addr not in", values, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrBetween(String value1, String value2) {
            addCriterion("i_addr between", value1, value2, "iAddr");
            return (Criteria) this;
        }

        public Criteria andIAddrNotBetween(String value1, String value2) {
            addCriterion("i_addr not between", value1, value2, "iAddr");
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