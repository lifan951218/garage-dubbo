package com.lifan.mybatis.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class ParkingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkingInfoExample() {
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

        public Criteria andParkingIdIsNull() {
            addCriterion("parking_id is null");
            return (Criteria) this;
        }

        public Criteria andParkingIdIsNotNull() {
            addCriterion("parking_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkingIdEqualTo(Integer value) {
            addCriterion("parking_id =", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotEqualTo(Integer value) {
            addCriterion("parking_id <>", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdGreaterThan(Integer value) {
            addCriterion("parking_id >", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_id >=", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdLessThan(Integer value) {
            addCriterion("parking_id <", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdLessThanOrEqualTo(Integer value) {
            addCriterion("parking_id <=", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdIn(List<Integer> values) {
            addCriterion("parking_id in", values, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotIn(List<Integer> values) {
            addCriterion("parking_id not in", values, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdBetween(Integer value1, Integer value2) {
            addCriterion("parking_id between", value1, value2, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_id not between", value1, value2, "parkingId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(String value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(String value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(String value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(String value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(String value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(String value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLike(String value) {
            addCriterion("car_num like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotLike(String value) {
            addCriterion("car_num not like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<String> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<String> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(String value1, String value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(String value1, String value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andGarageNumIsNull() {
            addCriterion("garage_num is null");
            return (Criteria) this;
        }

        public Criteria andGarageNumIsNotNull() {
            addCriterion("garage_num is not null");
            return (Criteria) this;
        }

        public Criteria andGarageNumEqualTo(Integer value) {
            addCriterion("garage_num =", value, "garageNum");
            return (Criteria) this;
        }

        public Criteria andGarageNumNotEqualTo(Integer value) {
            addCriterion("garage_num <>", value, "garageNum");
            return (Criteria) this;
        }

        public Criteria andGarageNumGreaterThan(Integer value) {
            addCriterion("garage_num >", value, "garageNum");
            return (Criteria) this;
        }

        public Criteria andGarageNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("garage_num >=", value, "garageNum");
            return (Criteria) this;
        }

        public Criteria andGarageNumLessThan(Integer value) {
            addCriterion("garage_num <", value, "garageNum");
            return (Criteria) this;
        }

        public Criteria andGarageNumLessThanOrEqualTo(Integer value) {
            addCriterion("garage_num <=", value, "garageNum");
            return (Criteria) this;
        }

        public Criteria andGarageNumIn(List<Integer> values) {
            addCriterion("garage_num in", values, "garageNum");
            return (Criteria) this;
        }

        public Criteria andGarageNumNotIn(List<Integer> values) {
            addCriterion("garage_num not in", values, "garageNum");
            return (Criteria) this;
        }

        public Criteria andGarageNumBetween(Integer value1, Integer value2) {
            addCriterion("garage_num between", value1, value2, "garageNum");
            return (Criteria) this;
        }

        public Criteria andGarageNumNotBetween(Integer value1, Integer value2) {
            addCriterion("garage_num not between", value1, value2, "garageNum");
            return (Criteria) this;
        }

        public Criteria andCpNumIsNull() {
            addCriterion("cp_num is null");
            return (Criteria) this;
        }

        public Criteria andCpNumIsNotNull() {
            addCriterion("cp_num is not null");
            return (Criteria) this;
        }

        public Criteria andCpNumEqualTo(String value) {
            addCriterion("cp_num =", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumNotEqualTo(String value) {
            addCriterion("cp_num <>", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumGreaterThan(String value) {
            addCriterion("cp_num >", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumGreaterThanOrEqualTo(String value) {
            addCriterion("cp_num >=", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumLessThan(String value) {
            addCriterion("cp_num <", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumLessThanOrEqualTo(String value) {
            addCriterion("cp_num <=", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumLike(String value) {
            addCriterion("cp_num like", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumNotLike(String value) {
            addCriterion("cp_num not like", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumIn(List<String> values) {
            addCriterion("cp_num in", values, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumNotIn(List<String> values) {
            addCriterion("cp_num not in", values, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumBetween(String value1, String value2) {
            addCriterion("cp_num between", value1, value2, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumNotBetween(String value1, String value2) {
            addCriterion("cp_num not between", value1, value2, "cpNum");
            return (Criteria) this;
        }

        public Criteria andFinishParkingIsNull() {
            addCriterion("finish_parking is null");
            return (Criteria) this;
        }

        public Criteria andFinishParkingIsNotNull() {
            addCriterion("finish_parking is not null");
            return (Criteria) this;
        }

        public Criteria andFinishParkingEqualTo(Integer value) {
            addCriterion("finish_parking =", value, "finishParking");
            return (Criteria) this;
        }

        public Criteria andFinishParkingNotEqualTo(Integer value) {
            addCriterion("finish_parking <>", value, "finishParking");
            return (Criteria) this;
        }

        public Criteria andFinishParkingGreaterThan(Integer value) {
            addCriterion("finish_parking >", value, "finishParking");
            return (Criteria) this;
        }

        public Criteria andFinishParkingGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_parking >=", value, "finishParking");
            return (Criteria) this;
        }

        public Criteria andFinishParkingLessThan(Integer value) {
            addCriterion("finish_parking <", value, "finishParking");
            return (Criteria) this;
        }

        public Criteria andFinishParkingLessThanOrEqualTo(Integer value) {
            addCriterion("finish_parking <=", value, "finishParking");
            return (Criteria) this;
        }

        public Criteria andFinishParkingIn(List<Integer> values) {
            addCriterion("finish_parking in", values, "finishParking");
            return (Criteria) this;
        }

        public Criteria andFinishParkingNotIn(List<Integer> values) {
            addCriterion("finish_parking not in", values, "finishParking");
            return (Criteria) this;
        }

        public Criteria andFinishParkingBetween(Integer value1, Integer value2) {
            addCriterion("finish_parking between", value1, value2, "finishParking");
            return (Criteria) this;
        }

        public Criteria andFinishParkingNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_parking not between", value1, value2, "finishParking");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingIsNull() {
            addCriterion("confirm_parking is null");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingIsNotNull() {
            addCriterion("confirm_parking is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingEqualTo(Integer value) {
            addCriterion("confirm_parking =", value, "confirmParking");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingNotEqualTo(Integer value) {
            addCriterion("confirm_parking <>", value, "confirmParking");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingGreaterThan(Integer value) {
            addCriterion("confirm_parking >", value, "confirmParking");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_parking >=", value, "confirmParking");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingLessThan(Integer value) {
            addCriterion("confirm_parking <", value, "confirmParking");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_parking <=", value, "confirmParking");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingIn(List<Integer> values) {
            addCriterion("confirm_parking in", values, "confirmParking");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingNotIn(List<Integer> values) {
            addCriterion("confirm_parking not in", values, "confirmParking");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingBetween(Integer value1, Integer value2) {
            addCriterion("confirm_parking between", value1, value2, "confirmParking");
            return (Criteria) this;
        }

        public Criteria andConfirmParkingNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_parking not between", value1, value2, "confirmParking");
            return (Criteria) this;
        }

        public Criteria andActionTimeIsNull() {
            addCriterion("action_time is null");
            return (Criteria) this;
        }

        public Criteria andActionTimeIsNotNull() {
            addCriterion("action_time is not null");
            return (Criteria) this;
        }

        public Criteria andActionTimeEqualTo(String value) {
            addCriterion("action_time =", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotEqualTo(String value) {
            addCriterion("action_time <>", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeGreaterThan(String value) {
            addCriterion("action_time >", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("action_time >=", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeLessThan(String value) {
            addCriterion("action_time <", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeLessThanOrEqualTo(String value) {
            addCriterion("action_time <=", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeLike(String value) {
            addCriterion("action_time like", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotLike(String value) {
            addCriterion("action_time not like", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeIn(List<String> values) {
            addCriterion("action_time in", values, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotIn(List<String> values) {
            addCriterion("action_time not in", values, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeBetween(String value1, String value2) {
            addCriterion("action_time between", value1, value2, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotBetween(String value1, String value2) {
            addCriterion("action_time not between", value1, value2, "actionTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(String value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(String value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(String value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(String value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(String value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLike(String value) {
            addCriterion("order_time like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotLike(String value) {
            addCriterion("order_time not like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<String> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<String> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(String value1, String value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(String value1, String value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(String value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(String value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(String value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(String value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(String value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLike(String value) {
            addCriterion("leave_time like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotLike(String value) {
            addCriterion("leave_time not like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<String> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<String> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(String value1, String value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(String value1, String value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Float value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Float value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Float value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Float value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Float value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Float> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Float> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Float value1, Float value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Float value1, Float value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmOutIsNull() {
            addCriterion("confirm_out is null");
            return (Criteria) this;
        }

        public Criteria andConfirmOutIsNotNull() {
            addCriterion("confirm_out is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmOutEqualTo(Integer value) {
            addCriterion("confirm_out =", value, "confirmOut");
            return (Criteria) this;
        }

        public Criteria andConfirmOutNotEqualTo(Integer value) {
            addCriterion("confirm_out <>", value, "confirmOut");
            return (Criteria) this;
        }

        public Criteria andConfirmOutGreaterThan(Integer value) {
            addCriterion("confirm_out >", value, "confirmOut");
            return (Criteria) this;
        }

        public Criteria andConfirmOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_out >=", value, "confirmOut");
            return (Criteria) this;
        }

        public Criteria andConfirmOutLessThan(Integer value) {
            addCriterion("confirm_out <", value, "confirmOut");
            return (Criteria) this;
        }

        public Criteria andConfirmOutLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_out <=", value, "confirmOut");
            return (Criteria) this;
        }

        public Criteria andConfirmOutIn(List<Integer> values) {
            addCriterion("confirm_out in", values, "confirmOut");
            return (Criteria) this;
        }

        public Criteria andConfirmOutNotIn(List<Integer> values) {
            addCriterion("confirm_out not in", values, "confirmOut");
            return (Criteria) this;
        }

        public Criteria andConfirmOutBetween(Integer value1, Integer value2) {
            addCriterion("confirm_out between", value1, value2, "confirmOut");
            return (Criteria) this;
        }

        public Criteria andConfirmOutNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_out not between", value1, value2, "confirmOut");
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