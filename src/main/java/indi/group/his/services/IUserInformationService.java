package indi.group.his.services;

import indi.group.his.model.UserInformation;

public interface IUserInformationService {
    int addUserInformation(UserInformation userInformation);
    int modifyUserInformation(UserInformation userInformation);
    int deleteUserInformation(UserInformation userInformation);
    /**
     * 
     * @param userInformation
     * @param findby 0:按用户 id 查询，1:取所有值
     * @return
     */
    UserInformation[] getUserInformation(UserInformation userInformation,int findby);
    int getUserId(String username);
}
