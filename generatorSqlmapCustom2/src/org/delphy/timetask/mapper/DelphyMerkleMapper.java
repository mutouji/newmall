package org.delphy.timetask.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.delphy.timetask.pojo.DelphyMerkle;
import org.delphy.timetask.pojo.DelphyMerkleExample;

public interface DelphyMerkleMapper {
    int countByExample(DelphyMerkleExample example);

    int deleteByExample(DelphyMerkleExample example);

    int deleteByPrimaryKey(String rootHash);

    int insert(DelphyMerkle record);

    int insertSelective(DelphyMerkle record);

    List<DelphyMerkle> selectByExample(DelphyMerkleExample example);

    DelphyMerkle selectByPrimaryKey(String rootHash);

    int updateByExampleSelective(@Param("record") DelphyMerkle record, @Param("example") DelphyMerkleExample example);

    int updateByExample(@Param("record") DelphyMerkle record, @Param("example") DelphyMerkleExample example);

    int updateByPrimaryKeySelective(DelphyMerkle record);

    int updateByPrimaryKey(DelphyMerkle record);
}