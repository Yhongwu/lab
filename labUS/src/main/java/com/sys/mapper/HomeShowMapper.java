package com.sys.mapper;

import com.sys.entity.HomeShow;
import com.sys.entity.HomeShowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomeShowMapper {
    int countByExample(HomeShowExample example);

    int deleteByExample(HomeShowExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(HomeShow record);

    int insertSelective(HomeShow record);

    List<HomeShow> selectByExampleWithBLOBs(HomeShowExample example);

    List<HomeShow> selectByExample(HomeShowExample example);

    HomeShow selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") HomeShow record, @Param("example") HomeShowExample example);

    int updateByExampleWithBLOBs(@Param("record") HomeShow record, @Param("example") HomeShowExample example);

    int updateByExample(@Param("record") HomeShow record, @Param("example") HomeShowExample example);

    int updateByPrimaryKeySelective(HomeShow record);

    int updateByPrimaryKeyWithBLOBs(HomeShow record);

    int updateByPrimaryKey(HomeShow record);
}