package indi.group.his.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.group.his.dao.IUserDao;
import indi.group.his.model.User;
import indi.group.his.model.UserExample;
import indi.group.his.model.UserInformation;
import indi.group.his.services.IUserServices;

@Service
public class UserServiceImpl implements IUserServices {

    @Autowired
    private IUserDao userdaoDB;
    public UserServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public int UserLogin(String account, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria cri = userExample.createCriteria();
        cri.andUserNameEqualTo(account);
        List<User> result = userdaoDB.selectByExample(userExample);
        if(result.size() == 0) return -1;
        else{
            User user = result.get(0);
            if(user.getPassword().equals(password)) return 1;
            else return 0;
        }
    }

    @Override
    public boolean registerUser(User user) {
        int index = userdaoDB.insert(user);
        return index >= 0;
    }

    @Override
    public boolean queryUserExist(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria cri = userExample.createCriteria();
        cri.andUserNameEqualTo(username);
        List<User> result = userdaoDB.selectByExample(userExample);
        if(result.size() == 0) return false;
        else return true;
    }

    @Override
    public boolean changePassword(String account, String password) {
        User user = new User();
        user.setUserName(account);
        user.setPassword(password);
        UserExample userExample = new UserExample();
        UserExample.Criteria cri = userExample.createCriteria();
        cri.andUserNameEqualTo(account);
        int index = userdaoDB.updateByExampleSelective(user, userExample);
        return index >= 0;
    }

    @Override
    public User getUser(int userid) {
        return userdaoDB.selectByPrimaryKey(userid);
    }
}
