package indi.group.his.dao;

import indi.group.his.model.ClientInformation;
import indi.group.his.model.ClientInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IClientInformationDao {
    int deleteByExample(ClientInformationExample example);

    int deleteByPrimaryKey(Integer clientId);

    int insert(ClientInformation record);

    int insertSelective(ClientInformation record);

    List<ClientInformation> selectByExample(ClientInformationExample example);

    ClientInformation selectByPrimaryKey(Integer clientId);

    int updateByExampleSelective(@Param("record") ClientInformation record, @Param("example") ClientInformationExample example);

    int updateByExample(@Param("record") ClientInformation record, @Param("example") ClientInformationExample example);

    int updateByPrimaryKeySelective(ClientInformation record);

    int updateByPrimaryKey(ClientInformation record);
    

}