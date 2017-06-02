package indi.group.his.dao;

import indi.group.his.model.CompleteContract;
import indi.group.his.model.CompleteContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICompleteContractDao {
    int deleteByExample(CompleteContractExample example);

    int deleteByPrimaryKey(Integer contractId);

    int insert(CompleteContract record);

    int insertSelective(CompleteContract record);

    List<CompleteContract> selectByExample(CompleteContractExample example);

    CompleteContract selectByPrimaryKey(Integer contractId);

    int updateByExampleSelective(@Param("record") CompleteContract record, @Param("example") CompleteContractExample example);

    int updateByExample(@Param("record") CompleteContract record, @Param("example") CompleteContractExample example);

    int updateByPrimaryKeySelective(CompleteContract record);

    int updateByPrimaryKey(CompleteContract record);
}