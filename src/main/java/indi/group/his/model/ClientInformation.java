package indi.group.his.model;

import java.io.Serializable;

/**
 * @author 
 */
public class ClientInformation implements Serializable {
    /**
     * 主键
     */
    private Integer clientId;

    /**
     * 客户手机号码
     */
    private String clientTelephone;

    /**
     * 意向房源列表
     */
    private String clientIntentionlist;

    /**
     * 购买记录
     */
    private String purchaseHistory;

    /**
     * 总业绩
     */
    private String performanceTotal;

    /**
     * 面积意向区间
     */
    private Float intentionArea;

    /**
     * 价格意向区间
     */
    private Float intentionPrice;

    /**
     * 客户姓名
     */
    private String clientName;

    /**
     * 客户性别
     */
    private Boolean clientSex;

    private static final long serialVersionUID = 1L;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientTelephone() {
        return clientTelephone;
    }

    public void setClientTelephone(String clientTelephone) {
        this.clientTelephone = clientTelephone;
    }

    public String getClientIntentionlist() {
        return clientIntentionlist;
    }

    public void setClientIntentionlist(String clientIntentionlist) {
        this.clientIntentionlist = clientIntentionlist;
    }

    public String getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public String getPerformanceTotal() {
        return performanceTotal;
    }

    public void setPerformanceTotal(String performanceTotal) {
        this.performanceTotal = performanceTotal;
    }

    public Float getIntentionArea() {
        return intentionArea;
    }

    public void setIntentionArea(Float intentionArea) {
        this.intentionArea = intentionArea;
    }

    public Float getIntentionPrice() {
        return intentionPrice;
    }

    public void setIntentionPrice(Float intentionPrice) {
        this.intentionPrice = intentionPrice;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Boolean getClientSex() {
        return clientSex;
    }

    public void setClientSex(Boolean clientSex) {
        this.clientSex = clientSex;
    }
}