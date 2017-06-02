package indi.group.his.model;

import java.util.ArrayList;
import java.util.List;

public class WorkInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public WorkInformationExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneIsNull() {
            addCriterion("user_telephone is null");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneIsNotNull() {
            addCriterion("user_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneEqualTo(String value) {
            addCriterion("user_telephone =", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotEqualTo(String value) {
            addCriterion("user_telephone <>", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneGreaterThan(String value) {
            addCriterion("user_telephone >", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_telephone >=", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneLessThan(String value) {
            addCriterion("user_telephone <", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneLessThanOrEqualTo(String value) {
            addCriterion("user_telephone <=", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneLike(String value) {
            addCriterion("user_telephone like", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotLike(String value) {
            addCriterion("user_telephone not like", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneIn(List<String> values) {
            addCriterion("user_telephone in", values, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotIn(List<String> values) {
            addCriterion("user_telephone not in", values, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneBetween(String value1, String value2) {
            addCriterion("user_telephone between", value1, value2, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotBetween(String value1, String value2) {
            addCriterion("user_telephone not between", value1, value2, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andClientListIsNull() {
            addCriterion("client_list is null");
            return (Criteria) this;
        }

        public Criteria andClientListIsNotNull() {
            addCriterion("client_list is not null");
            return (Criteria) this;
        }

        public Criteria andClientListEqualTo(String value) {
            addCriterion("client_list =", value, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListNotEqualTo(String value) {
            addCriterion("client_list <>", value, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListGreaterThan(String value) {
            addCriterion("client_list >", value, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListGreaterThanOrEqualTo(String value) {
            addCriterion("client_list >=", value, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListLessThan(String value) {
            addCriterion("client_list <", value, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListLessThanOrEqualTo(String value) {
            addCriterion("client_list <=", value, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListLike(String value) {
            addCriterion("client_list like", value, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListNotLike(String value) {
            addCriterion("client_list not like", value, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListIn(List<String> values) {
            addCriterion("client_list in", values, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListNotIn(List<String> values) {
            addCriterion("client_list not in", values, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListBetween(String value1, String value2) {
            addCriterion("client_list between", value1, value2, "clientList");
            return (Criteria) this;
        }

        public Criteria andClientListNotBetween(String value1, String value2) {
            addCriterion("client_list not between", value1, value2, "clientList");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowIsNull() {
            addCriterion("performance_now is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowIsNotNull() {
            addCriterion("performance_now is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowEqualTo(String value) {
            addCriterion("performance_now =", value, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowNotEqualTo(String value) {
            addCriterion("performance_now <>", value, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowGreaterThan(String value) {
            addCriterion("performance_now >", value, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowGreaterThanOrEqualTo(String value) {
            addCriterion("performance_now >=", value, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowLessThan(String value) {
            addCriterion("performance_now <", value, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowLessThanOrEqualTo(String value) {
            addCriterion("performance_now <=", value, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowLike(String value) {
            addCriterion("performance_now like", value, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowNotLike(String value) {
            addCriterion("performance_now not like", value, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowIn(List<String> values) {
            addCriterion("performance_now in", values, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowNotIn(List<String> values) {
            addCriterion("performance_now not in", values, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowBetween(String value1, String value2) {
            addCriterion("performance_now between", value1, value2, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceNowNotBetween(String value1, String value2) {
            addCriterion("performance_now not between", value1, value2, "performanceNow");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalIsNull() {
            addCriterion("performance_total is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalIsNotNull() {
            addCriterion("performance_total is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalEqualTo(String value) {
            addCriterion("performance_total =", value, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalNotEqualTo(String value) {
            addCriterion("performance_total <>", value, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalGreaterThan(String value) {
            addCriterion("performance_total >", value, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalGreaterThanOrEqualTo(String value) {
            addCriterion("performance_total >=", value, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalLessThan(String value) {
            addCriterion("performance_total <", value, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalLessThanOrEqualTo(String value) {
            addCriterion("performance_total <=", value, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalLike(String value) {
            addCriterion("performance_total like", value, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalNotLike(String value) {
            addCriterion("performance_total not like", value, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalIn(List<String> values) {
            addCriterion("performance_total in", values, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalNotIn(List<String> values) {
            addCriterion("performance_total not in", values, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalBetween(String value1, String value2) {
            addCriterion("performance_total between", value1, value2, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andPerformanceTotalNotBetween(String value1, String value2) {
            addCriterion("performance_total not between", value1, value2, "performanceTotal");
            return (Criteria) this;
        }

        public Criteria andFollowListIsNull() {
            addCriterion("follow_list is null");
            return (Criteria) this;
        }

        public Criteria andFollowListIsNotNull() {
            addCriterion("follow_list is not null");
            return (Criteria) this;
        }

        public Criteria andFollowListEqualTo(String value) {
            addCriterion("follow_list =", value, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListNotEqualTo(String value) {
            addCriterion("follow_list <>", value, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListGreaterThan(String value) {
            addCriterion("follow_list >", value, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListGreaterThanOrEqualTo(String value) {
            addCriterion("follow_list >=", value, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListLessThan(String value) {
            addCriterion("follow_list <", value, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListLessThanOrEqualTo(String value) {
            addCriterion("follow_list <=", value, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListLike(String value) {
            addCriterion("follow_list like", value, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListNotLike(String value) {
            addCriterion("follow_list not like", value, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListIn(List<String> values) {
            addCriterion("follow_list in", values, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListNotIn(List<String> values) {
            addCriterion("follow_list not in", values, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListBetween(String value1, String value2) {
            addCriterion("follow_list between", value1, value2, "followList");
            return (Criteria) this;
        }

        public Criteria andFollowListNotBetween(String value1, String value2) {
            addCriterion("follow_list not between", value1, value2, "followList");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }
    }

    /**
     */
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