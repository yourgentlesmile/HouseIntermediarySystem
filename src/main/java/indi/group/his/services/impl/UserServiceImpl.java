package indi.group.his.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import indi.group.his.dao.IUserDao;
import indi.group.his.model.User;
import indi.group.his.services.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
    @Autowired
    private IUserDao iUserDao;
    
    @Override
    public User getUserByName(String username) {
        // TODO Auto-generated method stub
        return this.iUserDao.selectByUserName(username);
    }

}
