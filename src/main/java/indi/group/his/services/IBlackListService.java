package indi.group.his.services;

import indi.group.his.model.Blacklist;

public interface IBlackListService {
    int addRecord(Blacklist blacklist);
    int deleteRecord(Blacklist blacklist);
    /**
     * 查询管理员
     * @param blacklist 查询字段
     * @param findby 0：按ID查询  1：按客户名查询 2：取所有值
     * @return
     */
    Blacklist[] getRecord(String queryId,String queryName,int findby);
    int modifyRecord(Blacklist blacklist);
}
