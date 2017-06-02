package indi.group.his.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ContractExample() {
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

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Integer value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Integer value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Integer value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Integer value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Integer> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Integer> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Integer value1, Integer value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
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

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("signtime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("signtime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(Date value) {
            addCriterion("signtime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(Date value) {
            addCriterion("signtime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(Date value) {
            addCriterion("signtime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signtime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(Date value) {
            addCriterion("signtime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(Date value) {
            addCriterion("signtime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<Date> values) {
            addCriterion("signtime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<Date> values) {
            addCriterion("signtime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(Date value1, Date value2) {
            addCriterion("signtime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(Date value1, Date value2) {
            addCriterion("signtime not between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldIsNull() {
            addCriterion("intention_gold is null");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldIsNotNull() {
            addCriterion("intention_gold is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldEqualTo(Integer value) {
            addCriterion("intention_gold =", value, "intentionGold");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldNotEqualTo(Integer value) {
            addCriterion("intention_gold <>", value, "intentionGold");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldGreaterThan(Integer value) {
            addCriterion("intention_gold >", value, "intentionGold");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("intention_gold >=", value, "intentionGold");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldLessThan(Integer value) {
            addCriterion("intention_gold <", value, "intentionGold");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldLessThanOrEqualTo(Integer value) {
            addCriterion("intention_gold <=", value, "intentionGold");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldIn(List<Integer> values) {
            addCriterion("intention_gold in", values, "intentionGold");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldNotIn(List<Integer> values) {
            addCriterion("intention_gold not in", values, "intentionGold");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldBetween(Integer value1, Integer value2) {
            addCriterion("intention_gold between", value1, value2, "intentionGold");
            return (Criteria) this;
        }

        public Criteria andIntentionGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("intention_gold not between", value1, value2, "intentionGold");
            return (Criteria) this;
        }

        public Criteria andDealGoldIsNull() {
            addCriterion("deal_gold is null");
            return (Criteria) this;
        }

        public Criteria andDealGoldIsNotNull() {
            addCriterion("deal_gold is not null");
            return (Criteria) this;
        }

        public Criteria andDealGoldEqualTo(Integer value) {
            addCriterion("deal_gold =", value, "dealGold");
            return (Criteria) this;
        }

        public Criteria andDealGoldNotEqualTo(Integer value) {
            addCriterion("deal_gold <>", value, "dealGold");
            return (Criteria) this;
        }

        public Criteria andDealGoldGreaterThan(Integer value) {
            addCriterion("deal_gold >", value, "dealGold");
            return (Criteria) this;
        }

        public Criteria andDealGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_gold >=", value, "dealGold");
            return (Criteria) this;
        }

        public Criteria andDealGoldLessThan(Integer value) {
            addCriterion("deal_gold <", value, "dealGold");
            return (Criteria) this;
        }

        public Criteria andDealGoldLessThanOrEqualTo(Integer value) {
            addCriterion("deal_gold <=", value, "dealGold");
            return (Criteria) this;
        }

        public Criteria andDealGoldIn(List<Integer> values) {
            addCriterion("deal_gold in", values, "dealGold");
            return (Criteria) this;
        }

        public Criteria andDealGoldNotIn(List<Integer> values) {
            addCriterion("deal_gold not in", values, "dealGold");
            return (Criteria) this;
        }

        public Criteria andDealGoldBetween(Integer value1, Integer value2) {
            addCriterion("deal_gold between", value1, value2, "dealGold");
            return (Criteria) this;
        }

        public Criteria andDealGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_gold not between", value1, value2, "dealGold");
            return (Criteria) this;
        }

        public Criteria andHousesAreaIsNull() {
            addCriterion("houses_area is null");
            return (Criteria) this;
        }

        public Criteria andHousesAreaIsNotNull() {
            addCriterion("houses_area is not null");
            return (Criteria) this;
        }

        public Criteria andHousesAreaEqualTo(Float value) {
            addCriterion("houses_area =", value, "housesArea");
            return (Criteria) this;
        }

        public Criteria andHousesAreaNotEqualTo(Float value) {
            addCriterion("houses_area <>", value, "housesArea");
            return (Criteria) this;
        }

        public Criteria andHousesAreaGreaterThan(Float value) {
            addCriterion("houses_area >", value, "housesArea");
            return (Criteria) this;
        }

        public Criteria andHousesAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("houses_area >=", value, "housesArea");
            return (Criteria) this;
        }

        public Criteria andHousesAreaLessThan(Float value) {
            addCriterion("houses_area <", value, "housesArea");
            return (Criteria) this;
        }

        public Criteria andHousesAreaLessThanOrEqualTo(Float value) {
            addCriterion("houses_area <=", value, "housesArea");
            return (Criteria) this;
        }

        public Criteria andHousesAreaIn(List<Float> values) {
            addCriterion("houses_area in", values, "housesArea");
            return (Criteria) this;
        }

        public Criteria andHousesAreaNotIn(List<Float> values) {
            addCriterion("houses_area not in", values, "housesArea");
            return (Criteria) this;
        }

        public Criteria andHousesAreaBetween(Float value1, Float value2) {
            addCriterion("houses_area between", value1, value2, "housesArea");
            return (Criteria) this;
        }

        public Criteria andHousesAreaNotBetween(Float value1, Float value2) {
            addCriterion("houses_area not between", value1, value2, "housesArea");
            return (Criteria) this;
        }

        public Criteria andHousesPriceIsNull() {
            addCriterion("houses_price is null");
            return (Criteria) this;
        }

        public Criteria andHousesPriceIsNotNull() {
            addCriterion("houses_price is not null");
            return (Criteria) this;
        }

        public Criteria andHousesPriceEqualTo(Float value) {
            addCriterion("houses_price =", value, "housesPrice");
            return (Criteria) this;
        }

        public Criteria andHousesPriceNotEqualTo(Float value) {
            addCriterion("houses_price <>", value, "housesPrice");
            return (Criteria) this;
        }

        public Criteria andHousesPriceGreaterThan(Float value) {
            addCriterion("houses_price >", value, "housesPrice");
            return (Criteria) this;
        }

        public Criteria andHousesPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("houses_price >=", value, "housesPrice");
            return (Criteria) this;
        }

        public Criteria andHousesPriceLessThan(Float value) {
            addCriterion("houses_price <", value, "housesPrice");
            return (Criteria) this;
        }

        public Criteria andHousesPriceLessThanOrEqualTo(Float value) {
            addCriterion("houses_price <=", value, "housesPrice");
            return (Criteria) this;
        }

        public Criteria andHousesPriceIn(List<Float> values) {
            addCriterion("houses_price in", values, "housesPrice");
            return (Criteria) this;
        }

        public Criteria andHousesPriceNotIn(List<Float> values) {
            addCriterion("houses_price not in", values, "housesPrice");
            return (Criteria) this;
        }

        public Criteria andHousesPriceBetween(Float value1, Float value2) {
            addCriterion("houses_price between", value1, value2, "housesPrice");
            return (Criteria) this;
        }

        public Criteria andHousesPriceNotBetween(Float value1, Float value2) {
            addCriterion("houses_price not between", value1, value2, "housesPrice");
            return (Criteria) this;
        }

        public Criteria andHousesNameIsNull() {
            addCriterion("houses_name is null");
            return (Criteria) this;
        }

        public Criteria andHousesNameIsNotNull() {
            addCriterion("houses_name is not null");
            return (Criteria) this;
        }

        public Criteria andHousesNameEqualTo(String value) {
            addCriterion("houses_name =", value, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameNotEqualTo(String value) {
            addCriterion("houses_name <>", value, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameGreaterThan(String value) {
            addCriterion("houses_name >", value, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameGreaterThanOrEqualTo(String value) {
            addCriterion("houses_name >=", value, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameLessThan(String value) {
            addCriterion("houses_name <", value, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameLessThanOrEqualTo(String value) {
            addCriterion("houses_name <=", value, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameLike(String value) {
            addCriterion("houses_name like", value, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameNotLike(String value) {
            addCriterion("houses_name not like", value, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameIn(List<String> values) {
            addCriterion("houses_name in", values, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameNotIn(List<String> values) {
            addCriterion("houses_name not in", values, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameBetween(String value1, String value2) {
            addCriterion("houses_name between", value1, value2, "housesName");
            return (Criteria) this;
        }

        public Criteria andHousesNameNotBetween(String value1, String value2) {
            addCriterion("houses_name not between", value1, value2, "housesName");
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