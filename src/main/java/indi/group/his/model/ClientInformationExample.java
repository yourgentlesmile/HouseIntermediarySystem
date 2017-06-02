package indi.group.his.model;

import java.util.ArrayList;
import java.util.List;

public class ClientInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ClientInformationExample() {
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

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Integer value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Integer value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Integer value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Integer value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Integer> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Integer> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Integer value1, Integer value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneIsNull() {
            addCriterion("client_telephone is null");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneIsNotNull() {
            addCriterion("client_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneEqualTo(String value) {
            addCriterion("client_telephone =", value, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneNotEqualTo(String value) {
            addCriterion("client_telephone <>", value, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneGreaterThan(String value) {
            addCriterion("client_telephone >", value, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("client_telephone >=", value, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneLessThan(String value) {
            addCriterion("client_telephone <", value, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneLessThanOrEqualTo(String value) {
            addCriterion("client_telephone <=", value, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneLike(String value) {
            addCriterion("client_telephone like", value, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneNotLike(String value) {
            addCriterion("client_telephone not like", value, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneIn(List<String> values) {
            addCriterion("client_telephone in", values, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneNotIn(List<String> values) {
            addCriterion("client_telephone not in", values, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneBetween(String value1, String value2) {
            addCriterion("client_telephone between", value1, value2, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientTelephoneNotBetween(String value1, String value2) {
            addCriterion("client_telephone not between", value1, value2, "clientTelephone");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistIsNull() {
            addCriterion("client_intentionlist is null");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistIsNotNull() {
            addCriterion("client_intentionlist is not null");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistEqualTo(String value) {
            addCriterion("client_intentionlist =", value, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistNotEqualTo(String value) {
            addCriterion("client_intentionlist <>", value, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistGreaterThan(String value) {
            addCriterion("client_intentionlist >", value, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistGreaterThanOrEqualTo(String value) {
            addCriterion("client_intentionlist >=", value, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistLessThan(String value) {
            addCriterion("client_intentionlist <", value, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistLessThanOrEqualTo(String value) {
            addCriterion("client_intentionlist <=", value, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistLike(String value) {
            addCriterion("client_intentionlist like", value, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistNotLike(String value) {
            addCriterion("client_intentionlist not like", value, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistIn(List<String> values) {
            addCriterion("client_intentionlist in", values, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistNotIn(List<String> values) {
            addCriterion("client_intentionlist not in", values, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistBetween(String value1, String value2) {
            addCriterion("client_intentionlist between", value1, value2, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andClientIntentionlistNotBetween(String value1, String value2) {
            addCriterion("client_intentionlist not between", value1, value2, "clientIntentionlist");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryIsNull() {
            addCriterion("purchase_history is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryIsNotNull() {
            addCriterion("purchase_history is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryEqualTo(String value) {
            addCriterion("purchase_history =", value, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryNotEqualTo(String value) {
            addCriterion("purchase_history <>", value, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryGreaterThan(String value) {
            addCriterion("purchase_history >", value, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_history >=", value, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryLessThan(String value) {
            addCriterion("purchase_history <", value, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryLessThanOrEqualTo(String value) {
            addCriterion("purchase_history <=", value, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryLike(String value) {
            addCriterion("purchase_history like", value, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryNotLike(String value) {
            addCriterion("purchase_history not like", value, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryIn(List<String> values) {
            addCriterion("purchase_history in", values, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryNotIn(List<String> values) {
            addCriterion("purchase_history not in", values, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryBetween(String value1, String value2) {
            addCriterion("purchase_history between", value1, value2, "purchaseHistory");
            return (Criteria) this;
        }

        public Criteria andPurchaseHistoryNotBetween(String value1, String value2) {
            addCriterion("purchase_history not between", value1, value2, "purchaseHistory");
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

        public Criteria andIntentionAreaIsNull() {
            addCriterion("intention_area is null");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaIsNotNull() {
            addCriterion("intention_area is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaEqualTo(Float value) {
            addCriterion("intention_area =", value, "intentionArea");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaNotEqualTo(Float value) {
            addCriterion("intention_area <>", value, "intentionArea");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaGreaterThan(Float value) {
            addCriterion("intention_area >", value, "intentionArea");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("intention_area >=", value, "intentionArea");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaLessThan(Float value) {
            addCriterion("intention_area <", value, "intentionArea");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaLessThanOrEqualTo(Float value) {
            addCriterion("intention_area <=", value, "intentionArea");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaIn(List<Float> values) {
            addCriterion("intention_area in", values, "intentionArea");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaNotIn(List<Float> values) {
            addCriterion("intention_area not in", values, "intentionArea");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaBetween(Float value1, Float value2) {
            addCriterion("intention_area between", value1, value2, "intentionArea");
            return (Criteria) this;
        }

        public Criteria andIntentionAreaNotBetween(Float value1, Float value2) {
            addCriterion("intention_area not between", value1, value2, "intentionArea");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceIsNull() {
            addCriterion("intention_price is null");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceIsNotNull() {
            addCriterion("intention_price is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceEqualTo(Float value) {
            addCriterion("intention_price =", value, "intentionPrice");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceNotEqualTo(Float value) {
            addCriterion("intention_price <>", value, "intentionPrice");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceGreaterThan(Float value) {
            addCriterion("intention_price >", value, "intentionPrice");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("intention_price >=", value, "intentionPrice");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceLessThan(Float value) {
            addCriterion("intention_price <", value, "intentionPrice");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceLessThanOrEqualTo(Float value) {
            addCriterion("intention_price <=", value, "intentionPrice");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceIn(List<Float> values) {
            addCriterion("intention_price in", values, "intentionPrice");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceNotIn(List<Float> values) {
            addCriterion("intention_price not in", values, "intentionPrice");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceBetween(Float value1, Float value2) {
            addCriterion("intention_price between", value1, value2, "intentionPrice");
            return (Criteria) this;
        }

        public Criteria andIntentionPriceNotBetween(Float value1, Float value2) {
            addCriterion("intention_price not between", value1, value2, "intentionPrice");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientSexIsNull() {
            addCriterion("client_sex is null");
            return (Criteria) this;
        }

        public Criteria andClientSexIsNotNull() {
            addCriterion("client_sex is not null");
            return (Criteria) this;
        }

        public Criteria andClientSexEqualTo(Boolean value) {
            addCriterion("client_sex =", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexNotEqualTo(Boolean value) {
            addCriterion("client_sex <>", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexGreaterThan(Boolean value) {
            addCriterion("client_sex >", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("client_sex >=", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexLessThan(Boolean value) {
            addCriterion("client_sex <", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexLessThanOrEqualTo(Boolean value) {
            addCriterion("client_sex <=", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexIn(List<Boolean> values) {
            addCriterion("client_sex in", values, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexNotIn(List<Boolean> values) {
            addCriterion("client_sex not in", values, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexBetween(Boolean value1, Boolean value2) {
            addCriterion("client_sex between", value1, value2, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("client_sex not between", value1, value2, "clientSex");
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