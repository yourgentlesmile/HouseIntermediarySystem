package indi.group.his.dao;


import indi.group.his.model.User;


public interface IUserDao {
    int deleteByPrimaryKey(Integer id);
    int insert(User record);
    int insertSelective(User record);
    User selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(User record);
    int updateByPrimaryKey(User record);
    User selectByUserName(String username);
}