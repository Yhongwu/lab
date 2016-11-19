package com.sys.mapper;

import com.sys.entity.Press;
import com.sys.entity.PressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PressMapper {
    int countByExample(PressExample example);

    int deleteByExample(PressExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Press record);

    int insertSelective(Press record);

    List<Press> selectByExampleWithBLOBs(PressExample example);

    List<Press> selectByExample(PressExample example);

    Press selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Press record, @Param("example") PressExample example);

    int updateByExampleWithBLOBs(@Param("record") Press record, @Param("example") PressExample example);

    int updateByExample(@Param("record") Press record, @Param("example") PressExample example);

    int updateByPrimaryKeySelective(Press record);

    int updateByPrimaryKeyWithBLOBs(Press record);

    int updateByPrimaryKey(Press record);
    
    List<Press> search(String word);
}