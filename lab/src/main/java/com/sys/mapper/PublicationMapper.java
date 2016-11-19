package com.sys.mapper;

import com.sys.entity.Publication;
import com.sys.entity.PublicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicationMapper {
    int countByExample(PublicationExample example);

    int deleteByExample(PublicationExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Publication record);

    int insertSelective(Publication record);

    List<Publication> selectByExample(PublicationExample example);

    Publication selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Publication record, @Param("example") PublicationExample example);

    int updateByExample(@Param("record") Publication record, @Param("example") PublicationExample example);

    int updateByPrimaryKeySelective(Publication record);

    int updateByPrimaryKey(Publication record);
    
    List<String> countByYear();
    
    List<Publication> search(String word);
}