package indi.group.his.model;

import java.util.ArrayList;
import java.util.List;

public class HouseInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HouseInformationExample() {
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

        public Criteria andHousesIdIsNull() {
            addCriterion("houses_id is null");
            return (Criteria) this;
        }

        public Criteria andHousesIdIsNotNull() {
            addCriterion("houses_id is not null");
            return (Criteria) this;
        }

        public Criteria andHousesIdEqualTo(Integer value) {
            addCriterion("houses_id =", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdNotEqualTo(Integer value) {
            addCriterion("houses_id <>", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdGreaterThan(Integer value) {
            addCriterion("houses_id >", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("houses_id >=", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdLessThan(Integer value) {
            addCriterion("houses_id <", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdLessThanOrEqualTo(Integer value) {
            addCriterion("houses_id <=", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdIn(List<Integer> values) {
            addCriterion("houses_id in", values, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdNotIn(List<Integer> values) {
            addCriterion("houses_id not in", values, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdBetween(Integer value1, Integer value2) {
            addCriterion("houses_id between", value1, value2, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("houses_id not between", value1, value2, "housesId");
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

        public Criteria andHousesOpentimeIsNull() {
            addCriterion("houses_opentime is null");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeIsNotNull() {
            addCriterion("houses_opentime is not null");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeEqualTo(String value) {
            addCriterion("houses_opentime =", value, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeNotEqualTo(String value) {
            addCriterion("houses_opentime <>", value, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeGreaterThan(String value) {
            addCriterion("houses_opentime >", value, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeGreaterThanOrEqualTo(String value) {
            addCriterion("houses_opentime >=", value, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeLessThan(String value) {
            addCriterion("houses_opentime <", value, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeLessThanOrEqualTo(String value) {
            addCriterion("houses_opentime <=", value, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeLike(String value) {
            addCriterion("houses_opentime like", value, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeNotLike(String value) {
            addCriterion("houses_opentime not like", value, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeIn(List<String> values) {
            addCriterion("houses_opentime in", values, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeNotIn(List<String> values) {
            addCriterion("houses_opentime not in", values, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeBetween(String value1, String value2) {
            addCriterion("houses_opentime between", value1, value2, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andHousesOpentimeNotBetween(String value1, String value2) {
            addCriterion("houses_opentime not between", value1, value2, "housesOpentime");
            return (Criteria) this;
        }

        public Criteria andDealHistoryIsNull() {
            addCriterion("\"deal _History\" is null");
            return (Criteria) this;
        }

        public Criteria andDealHistoryIsNotNull() {
            addCriterion("\"deal _History\" is not null");
            return (Criteria) this;
        }

        public Criteria andDealHistoryEqualTo(String value) {
            addCriterion("\"deal _History\" =", value, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryNotEqualTo(String value) {
            addCriterion("\"deal _History\" <>", value, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryGreaterThan(String value) {
            addCriterion("\"deal _History\" >", value, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("\"deal _History\" >=", value, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryLessThan(String value) {
            addCriterion("\"deal _History\" <", value, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryLessThanOrEqualTo(String value) {
            addCriterion("\"deal _History\" <=", value, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryLike(String value) {
            addCriterion("\"deal _History\" like", value, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryNotLike(String value) {
            addCriterion("\"deal _History\" not like", value, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryIn(List<String> values) {
            addCriterion("\"deal _History\" in", values, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryNotIn(List<String> values) {
            addCriterion("\"deal _History\" not in", values, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryBetween(String value1, String value2) {
            addCriterion("\"deal _History\" between", value1, value2, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andDealHistoryNotBetween(String value1, String value2) {
            addCriterion("\"deal _History\" not between", value1, value2, "dealHistory");
            return (Criteria) this;
        }

        public Criteria andEmployeeListIsNull() {
            addCriterion("employee_list is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeListIsNotNull() {
            addCriterion("employee_list is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeListEqualTo(String value) {
            addCriterion("employee_list =", value, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListNotEqualTo(String value) {
            addCriterion("employee_list <>", value, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListGreaterThan(String value) {
            addCriterion("employee_list >", value, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListGreaterThanOrEqualTo(String value) {
            addCriterion("employee_list >=", value, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListLessThan(String value) {
            addCriterion("employee_list <", value, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListLessThanOrEqualTo(String value) {
            addCriterion("employee_list <=", value, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListLike(String value) {
            addCriterion("employee_list like", value, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListNotLike(String value) {
            addCriterion("employee_list not like", value, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListIn(List<String> values) {
            addCriterion("employee_list in", values, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListNotIn(List<String> values) {
            addCriterion("employee_list not in", values, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListBetween(String value1, String value2) {
            addCriterion("employee_list between", value1, value2, "employeeList");
            return (Criteria) this;
        }

        public Criteria andEmployeeListNotBetween(String value1, String value2) {
            addCriterion("employee_list not between", value1, value2, "employeeList");
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