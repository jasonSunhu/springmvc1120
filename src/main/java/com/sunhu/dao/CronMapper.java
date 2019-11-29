package com.sunhu.dao;

import com.sunhu.entity.Cron;
import com.sunhu.entity.CronExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CronMapper {
    int countByExample(CronExample example);

    int deleteByExample(CronExample example);

    int deleteByPrimaryKey(String id);

    int insert(Cron record);

    int insertSelective(Cron record);

    List<Cron> selectByExample(CronExample example);

    Cron selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Cron record, @Param("example") CronExample example);

    int updateByExample(@Param("record") Cron record, @Param("example") CronExample example);

    int updateByPrimaryKeySelective(Cron record);

    int updateByPrimaryKey(Cron record);
}