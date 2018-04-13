package indi.group.his.services;

import indi.group.his.model.User;
import indi.group.his.model.UserInformation;

public interface IUserServices {
    /**
     * 用户登录
     * @param account 用户名
     * @param password 密码
     * @return 登录是否成功
     * 成功返回true，否则返回false
     */
    boolean UserLogin(String account, String password);
    /**
     * 用户注册
     * @param user 用户注册信息，包含账号，密码
     * @return 返回注册是否成功
     */
    boolean registerUser(User user);
    /**
     * 查询用户名是否存在
     * @param username 需要查询的用户名
     * @return 如果存在返回true，不存在返回false
     */
    boolean queryUserExist(String username);
    /**
     * 修改密码
     * @param account 需要修改的用户名
     * @param password 需要修改的密码
     * @param isForgetPassword 是否是忘记密码
     * @return 返回是否修改成功
     */
    boolean changePassword(String account,String password, int isForgetPassword);
    /**
     * 获取用户信息 
     * @param userid 用户id
     * @return 返回查询到的用户信息
     */
    UserInformation getUserInformation(int userid);
    /**
     * 修改用户信息
     * @param account 需要修改的用户账号 
     * @param userInformation 包含修改过的用户信息
     * @return
     */
    boolean modifyUserInformation(String account, UserInformation userInformation);
}
