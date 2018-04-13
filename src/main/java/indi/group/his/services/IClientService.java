package indi.group.his.services;

import indi.group.his.model.ClientInformation;

public interface IClientService {
    /**
     * 添加客户信息
     * @param user 客户信息集合
     * @return 添加成功返回true 否则false
     */
    boolean addClient(ClientInformation user);
    /**
     * 修改客户信息
     * @param value 需要修改的信息集合
     * @return 修改成功返回true，否则false
     */
    boolean modifyClientInformation(ClientInformation value);
    /**
     * 删除客户信息
     * @param user 需要删除的用户
     * @return 删除成功返回true
     */
    boolean deleteClient(ClientInformation user);
    /**
     * 查询客户信息
     * @param username 按用户姓名查询
     * @param clientId 按客户id查询
     * @param queryBy 为0：按用户姓名查询；为1：按客户id查询
     * @return 返回查询结果集，单个值则为数据0号元素
     */
    ClientInformation[] getClientInformation(String username,int clientId,int queryBy);
    
}
