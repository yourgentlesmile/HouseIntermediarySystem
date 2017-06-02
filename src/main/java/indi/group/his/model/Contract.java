package indi.group.his.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Contract implements Serializable {
    private Integer contractId;

    /**
     * 客户身份证号码
     */
    private String clientId;

    private String clientName;

    /**
     * 业务员名称
     */
    private String employeeName;

    /**
     * 签约时间
     */
    private Date signtime;

    /**
     * 意向金
     */
    private Integer intentionGold;

    /**
     * 成交金额
     */
    private Integer dealGold;

    /**
     * 楼盘面积
     */
    private Float housesArea;

    /**
     * 楼盘价格
     */
    private Float housesPrice;

    /**
     * 楼盘名称
     */
    private String housesName;

    /**
     * 客户性别
     */
    private Boolean clientSex;

    private static final long serialVersionUID = 1L;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public Integer getIntentionGold() {
        return intentionGold;
    }

    public void setIntentionGold(Integer intentionGold) {
        this.intentionGold = intentionGold;
    }

    public Integer getDealGold() {
        return dealGold;
    }

    public void setDealGold(Integer dealGold) {
        this.dealGold = dealGold;
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

    public Boolean getClientSex() {
        return clientSex;
    }

    public void setClientSex(Boolean clientSex) {
        this.clientSex = clientSex;
    }
}