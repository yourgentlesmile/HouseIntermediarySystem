package indi.group.his.model;

import java.io.Serializable;

/**
 * @author 
 */
public class WorkInformation implements Serializable {
    private Integer userId;

    /**
     * 工作手机号码
     */
    private String userTelephone;

    /**
     * 当前跟进客户列表
     */
    private String clientList;

    /**
     * 本月业绩
     */
    private String performanceNow;

    /**
     * 总业绩
     */
    private String performanceTotal;

    /**
     * 跟进房源列表
     */
    private String followList;

    /**
     * 主营楼盘区域
     */
    private String area;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getClientList() {
        return clientList;
    }

    public void setClientList(String clientList) {
        this.clientList = clientList;
    }

    public String getPerformanceNow() {
        return performanceNow;
    }

    public void setPerformanceNow(String performanceNow) {
        this.performanceNow = performanceNow;
    }

    public String getPerformanceTotal() {
        return performanceTotal;
    }

    public void setPerformanceTotal(String performanceTotal) {
        this.performanceTotal = performanceTotal;
    }

    public String getFollowList() {
        return followList;
    }

    public void setFollowList(String followList) {
        this.followList = followList;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "WorkInformation [userId=" + userId + ", userTelephone=" + userTelephone + ", clientList=" + clientList
                + ", performanceNow=" + performanceNow + ", performanceTotal=" + performanceTotal + ", followList="
                + followList + ", area=" + area + "]";
    }
    
}