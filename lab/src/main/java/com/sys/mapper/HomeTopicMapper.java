package com.sys.mapper;

import com.sys.entity.HomeTopic;
import com.sys.entity.HomeTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomeTopicMapper {
    int countByExample(HomeTopicExample example);

    int deleteByExample(HomeTopicExample example);

    int deleteByPrimaryKey(Integer hId);

    int insert(HomeTopic record);

    int insertSelective(HomeTopic record);

    List<HomeTopic> selectByExample(HomeTopicExample example);

    HomeTopic selectByPrimaryKey(Integer hId);

    int updateByExampleSelective(@Param("record") HomeTopic record, @Param("example") HomeTopicExample example);

    int updateByExample(@Param("record") HomeTopic record, @Param("example") HomeTopicExample example);

    int updateByPrimaryKeySelective(HomeTopic record);

    int updateByPrimaryKey(HomeTopic record);
    
    List<HomeTopic> search(String word);
}