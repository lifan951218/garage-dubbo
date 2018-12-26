package com.lifan.garage.pojo;

import java.util.ArrayList;
import java.util.List;

public class GarageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GarageInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Float value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Float value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Float value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Float value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Float> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Float> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Float value1, Float value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeIsNull() {
            addCriterion("longtitude is null");
            return (Criteria) this;
        }

        public Criteria andLongtitudeIsNotNull() {
            addCriterion("longtitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongtitudeEqualTo(Float value) {
            addCriterion("longtitude =", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeNotEqualTo(Float value) {
            addCriterion("longtitude <>", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeGreaterThan(Float value) {
            addCriterion("longtitude >", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("longtitude >=", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeLessThan(Float value) {
            addCriterion("longtitude <", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeLessThanOrEqualTo(Float value) {
            addCriterion("longtitude <=", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeIn(List<Float> values) {
            addCriterion("longtitude in", values, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeNotIn(List<Float> values) {
            addCriterion("longtitude not in", values, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeBetween(Float value1, Float value2) {
            addCriterion("longtitude between", value1, value2, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeNotBetween(Float value1, Float value2) {
            addCriterion("longtitude not between", value1, value2, "longtitude");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andFreeNumIsNull() {
            addCriterion("free_num is null");
            return (Criteria) this;
        }

        public Criteria andFreeNumIsNotNull() {
            addCriterion("free_num is not null");
            return (Criteria) this;
        }

        public Criteria andFreeNumEqualTo(Integer value) {
            addCriterion("free_num =", value, "freeNum");
            return (Criteria) this;
        }

        public Criteria andFreeNumNotEqualTo(Integer value) {
            addCriterion("free_num <>", value, "freeNum");
            return (Criteria) this;
        }

        public Criteria andFreeNumGreaterThan(Integer value) {
            addCriterion("free_num >", value, "freeNum");
            return (Criteria) this;
        }

        public Criteria andFreeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_num >=", value, "freeNum");
            return (Criteria) this;
        }

        public Criteria andFreeNumLessThan(Integer value) {
            addCriterion("free_num <", value, "freeNum");
            return (Criteria) this;
        }

        public Criteria andFreeNumLessThanOrEqualTo(Integer value) {
            addCriterion("free_num <=", value, "freeNum");
            return (Criteria) this;
        }

        public Criteria andFreeNumIn(List<Integer> values) {
            addCriterion("free_num in", values, "freeNum");
            return (Criteria) this;
        }

        public Criteria andFreeNumNotIn(List<Integer> values) {
            addCriterion("free_num not in", values, "freeNum");
            return (Criteria) this;
        }

        public Criteria andFreeNumBetween(Integer value1, Integer value2) {
            addCriterion("free_num between", value1, value2, "freeNum");
            return (Criteria) this;
        }

        public Criteria andFreeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("free_num not between", value1, value2, "freeNum");
            return (Criteria) this;
        }

        public Criteria andPricePerHourIsNull() {
            addCriterion("price_per_hour is null");
            return (Criteria) this;
        }

        public Criteria andPricePerHourIsNotNull() {
            addCriterion("price_per_hour is not null");
            return (Criteria) this;
        }

        public Criteria andPricePerHourEqualTo(Float value) {
            addCriterion("price_per_hour =", value, "pricePerHour");
            return (Criteria) this;
        }

        public Criteria andPricePerHourNotEqualTo(Float value) {
            addCriterion("price_per_hour <>", value, "pricePerHour");
            return (Criteria) this;
        }

        public Criteria andPricePerHourGreaterThan(Float value) {
            addCriterion("price_per_hour >", value, "pricePerHour");
            return (Criteria) this;
        }

        public Criteria andPricePerHourGreaterThanOrEqualTo(Float value) {
            addCriterion("price_per_hour >=", value, "pricePerHour");
            return (Criteria) this;
        }

        public Criteria andPricePerHourLessThan(Float value) {
            addCriterion("price_per_hour <", value, "pricePerHour");
            return (Criteria) this;
        }

        public Criteria andPricePerHourLessThanOrEqualTo(Float value) {
            addCriterion("price_per_hour <=", value, "pricePerHour");
            return (Criteria) this;
        }

        public Criteria andPricePerHourIn(List<Float> values) {
            addCriterion("price_per_hour in", values, "pricePerHour");
            return (Criteria) this;
        }

        public Criteria andPricePerHourNotIn(List<Float> values) {
            addCriterion("price_per_hour not in", values, "pricePerHour");
            return (Criteria) this;
        }

        public Criteria andPricePerHourBetween(Float value1, Float value2) {
            addCriterion("price_per_hour between", value1, value2, "pricePerHour");
            return (Criteria) this;
        }

        public Criteria andPricePerHourNotBetween(Float value1, Float value2) {
            addCriterion("price_per_hour not between", value1, value2, "pricePerHour");
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