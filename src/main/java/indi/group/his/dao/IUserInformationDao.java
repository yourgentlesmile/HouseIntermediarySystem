package indi.group.his.dao;

import indi.group.his.model.UserInformation;
import indi.group.his.model.UserInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserInformationDao {
    int deleteByExample(UserInformationExample example);

    int insert(UserInformation record);

    int insertSelective(UserInformation record);

    List<UserInformation> selectByExample(UserInformationExample example);

    int updateByExampleSelective(@Param("record") UserInformation record, @Param("example") UserInformationExample example);

    int updateByExample(@Param("record") UserInformation record, @Param("example") UserInformationExample example);
}