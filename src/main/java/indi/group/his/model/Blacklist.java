package indi.group.his.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Blacklist implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 客户身份证号码
     */
    private String clientId;

    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 拉黑描述
     */
    private String description;

    /**
     * 拉黑时间
     */
    private Date time;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}