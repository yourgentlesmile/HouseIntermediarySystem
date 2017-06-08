package indi.group.his.services;

import indi.group.his.model.Admin;

public interface IAdminService {
    int addAdmin(Admin admin);
    int deleteAdmin(Admin admin);
    /**
     * 查询管理员
     * @param admin 查询字段
     * @param findby 0：单个查询  1：取所有值
     * @return
     */
    Admin[] getAdmin(Admin admin,int findby);
    int modifyAdmin(Admin admin);
    int UserLogin(String account, String password);
}
