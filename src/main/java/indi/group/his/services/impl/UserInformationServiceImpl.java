package indi.group.his.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import indi.group.his.dao.IClientInformationDao;
import indi.group.his.dao.IUserInformationDao;
import indi.group.his.model.ClientInformation;
import indi.group.his.model.ClientInformationExample;
import indi.group.his.model.User;
import indi.group.his.model.UserExample;
import indi.group.his.model.UserInformation;
import indi.group.his.model.UserInformationExample;
import indi.group.his.services.IClientInformationService;
import indi.group.his.services.IUserInformationService;

@Service
public class UserInformationServiceImpl implements IUserInformationService {

    public static final int QUERY_BY_ID   = 0;
    public static final int QUERY_ALLDATA = 1;
    
    @Autowired
    private IUserInformationDao userInformationDao= null;
    @Override
    public int addUserInformation(UserInformation userInformation) {
        return userInformationDao.insert(userInformation);
    }

    @Override
    public int modifyUserInformation(UserInformation userInformation) {
        UserInformationExample example = new UserInformationExample();
        UserInformationExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userInformation.getUserId());
        return userInformationDao.updateByExampleSelective(userInformation, example);
    }

    @Override
    public int deleteUserInformation(UserInformation userInformation) {
        UserInformationExample example = new UserInformationExample();
        UserInformationExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userInformation.getUserId());
        return userInformationDao.deleteByExample(example);
    }

    @Override
    public UserInformation[] getUserInformation(UserInformation userInformation, int findby) {
        UserInformationExample example = new UserInformationExample();
        UserInformationExample.Criteria criteria = example.createCriteria();
        if(findby == QUERY_BY_ID){
            criteria.andUserIdEqualTo(userInformation.getUserId());
        }
        List<UserInformation> list = userInformationDao.selectByExample(example);
        UserInformation[] result = list.toArray(new UserInformation[list.size()]);
        return result;
    }
    
    @Override
    public int getUserId(String username){
        UserInformationExample example = new UserInformationExample();
        UserInformationExample.Criteria criteria = example.createCriteria();
        criteria.andRealNameEqualTo(username);
        return ((UserInformation)userInformationDao.selectByExample(example).toArray()[0]).getUserId();
    }
  
}
