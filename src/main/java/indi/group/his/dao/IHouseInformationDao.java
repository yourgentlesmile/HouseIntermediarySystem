package indi.group.his.dao;

import indi.group.his.model.HouseInformation;
import indi.group.his.model.HouseInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IHouseInformationDao {
    int deleteByExample(HouseInformationExample example);

    int deleteByPrimaryKey(Integer housesId);

    int insert(HouseInformation record);

    int insertSelective(HouseInformation record);

    List<HouseInformation> selectByExample(HouseInformationExample example);

    HouseInformation selectByPrimaryKey(Integer housesId);

    int updateByExampleSelective(@Param("record") HouseInformation record, @Param("example") HouseInformationExample example);

    int updateByExample(@Param("record") HouseInformation record, @Param("example") HouseInformationExample example);

    int updateByPrimaryKeySelective(HouseInformation record);

    int updateByPrimaryKey(HouseInformation record);
}