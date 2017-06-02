package indi.group.his.dao;

import indi.group.his.model.Contract;
import indi.group.his.model.ContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IContractDao {
    int deleteByExample(ContractExample example);

    int deleteByPrimaryKey(Integer contractId);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExample(ContractExample example);

    Contract selectByPrimaryKey(Integer contractId);

    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}