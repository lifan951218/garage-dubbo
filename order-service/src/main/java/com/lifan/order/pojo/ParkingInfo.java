package com.lifan.order.pojo;

import java.io.Serializable;

public class ParkingInfo implements Serializable {
    private Integer parkingId;

    private String username;

    private String carNum;

    private Integer garageNum;

    private String cpNum;

    private Integer finishParking;

    private Integer confirmParking;

    private String actionTime;

    private String orderTime;

    private String startTime;

    private String leaveTime;

    private Float money;

    private Integer payStatus;

    private Integer confirmOut;

    public Integer getParkingId() {
        return parkingId;
    }

    public void setParkingId(Integer parkingId) {
        this.parkingId = parkingId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public Integer getGarageNum() {
        return garageNum;
    }

    public void setGarageNum(Integer garageNum) {
        this.garageNum = garageNum;
    }

    public String getCpNum() {
        return cpNum;
    }

    public void setCpNum(String cpNum) {
        this.cpNum = cpNum == null ? null : cpNum.trim();
    }

    public Integer getFinishParking() {
        return finishParking;
    }

    public void setFinishParking(Integer finishParking) {
        this.finishParking = finishParking;
    }

    public Integer getConfirmParking() {
        return confirmParking;
    }

    public void setConfirmParking(Integer confirmParking) {
        this.confirmParking = confirmParking;
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime == null ? null : actionTime.trim();
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime == null ? null : orderTime.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime == null ? null : leaveTime.trim();
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getConfirmOut() {
        return confirmOut;
    }

    public void setConfirmOut(Integer confirmOut) {
        this.confirmOut = confirmOut;
    }
}