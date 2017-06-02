package indi.group.his.dao;

import indi.group.his.model.Blacklist;
import indi.group.his.model.BlacklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBlacklistDao {
    int deleteByExample(BlacklistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Blacklist record);

    int insertSelective(Blacklist record);

    List<Blacklist> selectByExample(BlacklistExample example);

    Blacklist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Blacklist record, @Param("example") BlacklistExample example);

    int updateByExample(@Param("record") Blacklist record, @Param("example") BlacklistExample example);

    int updateByPrimaryKeySelective(Blacklist record);

    int updateByPrimaryKey(Blacklist record);
}