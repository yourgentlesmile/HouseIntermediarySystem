package indi.group.his.model;

public class WorkInfoUnionUser {
    private String userName;
    private Integer userId;
    private String performanceNow;
    private String performanceTotal;
    private String area;
    private String telephone;
    public WorkInfoUnionUser() {
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
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
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    @Override
    public String toString() {
        return "WorkInfoUnionUser [userName=" + userName + ", userId=" + userId + ", performanceNow=" + performanceNow
                + ", performanceTotal=" + performanceTotal + ", area=" + area + ", telephone=" + telephone + "]";
    }
    
    
}
