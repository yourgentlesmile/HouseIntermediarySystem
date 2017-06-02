package indi.group.his.model;

import java.io.Serializable;

/**
 * @author 
 */
public class HouseInformation implements Serializable {
    private Integer housesId;

    /**
     * 客户手机号码
     */
    private String clientTelephone;

    /**
     * 开盘时间
     */
    private String housesOpentime;

    /**
     * 成交记录
     */
    private String dealHistory;

    /**
     * 楼盘跟进员工列表
     */
    private String employeeList;

    /**
     * 楼盘面积区间
     */
    private Float housesArea;

    /**
     * 楼盘价格区间
     */
    private Float housesPrice;

    /**
     * 楼盘名称
     */
    private String housesName;

    private static final long serialVersionUID = 1L;

    public Integer getHousesId() {
        return housesId;
    }

    public void setHousesId(Integer housesId) {
        this.housesId = housesId;
    }

    public String getClientTelephone() {
        return clientTelephone;
    }

    public void setClientTelephone(String clientTelephone) {
        this.clientTelephone = clientTelephone;
    }

    public String getHousesOpentime() {
        return housesOpentime;
    }

    public void setHousesOpentime(String housesOpentime) {
        this.housesOpentime = housesOpentime;
    }

    public String getDealHistory() {
        return dealHistory;
    }

    public void setDealHistory(String dealHistory) {
        this.dealHistory = dealHistory;
    }

    public String getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(String employeeList) {
        this.employeeList = employeeList;
    }

    public Float getHousesArea() {
        return housesArea;
    }

    public void setHousesArea(Float housesArea) {
        this.housesArea = housesArea;
    }

    public Float getHousesPrice() {
        return housesPrice;
    }

    public void setHousesPrice(Float housesPrice) {
        this.housesPrice = housesPrice;
    }

    public String getHousesName() {
        return housesName;
    }

    public void setHousesName(String housesName) {
        this.housesName = housesName;
    }
}