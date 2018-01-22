package org.delphy.timetask.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.delphy.timetask.pojo.DelphyMarket;
import org.delphy.timetask.pojo.DelphyMarketExample;

public interface DelphyMarketMapper {
    int countByExample(DelphyMarketExample example);

    int deleteByExample(DelphyMarketExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DelphyMarket record);

    int insertSelective(DelphyMarket record);

    List<DelphyMarket> selectByExample(DelphyMarketExample example);

    DelphyMarket selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DelphyMarket record, @Param("example") DelphyMarketExample example);

    int updateByExample(@Param("record") DelphyMarket record, @Param("example") DelphyMarketExample example);

    int updateByPrimaryKeySelective(DelphyMarket record);

    int updateByPrimaryKey(DelphyMarket record);
}