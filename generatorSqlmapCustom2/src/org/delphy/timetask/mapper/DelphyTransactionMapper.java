package org.delphy.timetask.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.delphy.timetask.pojo.DelphyTransaction;
import org.delphy.timetask.pojo.DelphyTransactionExample;

public interface DelphyTransactionMapper {
    int countByExample(DelphyTransactionExample example);

    int deleteByExample(DelphyTransactionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DelphyTransaction record);

    int insertSelective(DelphyTransaction record);

    List<DelphyTransaction> selectByExample(DelphyTransactionExample example);

    DelphyTransaction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DelphyTransaction record, @Param("example") DelphyTransactionExample example);

    int updateByExample(@Param("record") DelphyTransaction record, @Param("example") DelphyTransactionExample example);

    int updateByPrimaryKeySelective(DelphyTransaction record);

    int updateByPrimaryKey(DelphyTransaction record);
}