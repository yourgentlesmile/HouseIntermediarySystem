package indi.group.his.services;

import indi.group.his.model.WorkInfoUnionUser;
import indi.group.his.model.WorkInformation;

public interface IWorkInformationService {
    /**
     * 添加用户信息
     * @param value 用户信息集合
     * @return
     */
    boolean addWorkInformation(WorkInformation value);
    /**
     * 修改用户信息
     * @param value
     * @return
     */
    boolean modifyWorkInformation(WorkInformation value);
    /**
     * 删除用户
     * @param value
     * @return
     */
    boolean deleteWorkInformation(WorkInformation value);
    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    WorkInformation getWorkInformation(int userId);
    /**
     * 获取所有用户业绩信息
     * @param order 1:按业绩升序排列   0:按业绩降序排列
     * @return 用户业绩信息结果集
     */
    WorkInfoUnionUser[] getAllUserAchivement(int order);
    /**
     * 获取所有用户信息
     */
    WorkInformation[] getAllUserInformation();
}
