package indi.group.his.dao;

import indi.group.his.model.WorkInfoUnionUser;
import indi.group.his.model.WorkInformation;
import indi.group.his.model.WorkInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IWorkInformationDao {
    int deleteByExample(WorkInformationExample example);

    int insert(WorkInformation record);

    int insertSelective(WorkInformation record);

    List<WorkInformation> selectByExample(WorkInformationExample example);

    int updateByExampleSelective(@Param("record") WorkInformation record, @Param("example") WorkInformationExample example);

    int updateByExample(@Param("record") WorkInformation record, @Param("example") WorkInformationExample example);
    
    List<WorkInfoUnionUser> getAllUserAchivement(int order);
    
}