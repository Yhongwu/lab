package com.sys.mapper;

import com.sys.entity.Joins;
import com.sys.entity.JoinsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoinsMapper {
    int countByExample(JoinsExample example);

    int deleteByExample(JoinsExample example);

    int deleteByPrimaryKey(Integer jId);

    int insert(Joins record);

    int insertSelective(Joins record);

    List<Joins> selectByExample(JoinsExample example);

    Joins selectByPrimaryKey(Integer jId);

    int updateByExampleSelective(@Param("record") Joins record, @Param("example") JoinsExample example);

    int updateByExample(@Param("record") Joins record, @Param("example") JoinsExample example);

    int updateByPrimaryKeySelective(Joins record);

    int updateByPrimaryKey(Joins record);
    
    List<Joins> search(String word);
}