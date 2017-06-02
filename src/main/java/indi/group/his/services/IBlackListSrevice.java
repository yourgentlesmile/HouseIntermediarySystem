package indi.group.his.services;

import indi.group.his.model.Blacklist;

public interface IBlackListSrevice {
    int addRecord(Blacklist blacklist);
    int deleteRecord(Blacklist blacklist);
    /**
     * 查询管理员
     * @param blacklist 查询字段
     * @param findby 0：单个查询  1：取所有值
     * @return
     */
    Blacklist[] getRecord(Blacklist blacklist,int findby);
    int modifyRecord(Blacklist blacklist);
}
