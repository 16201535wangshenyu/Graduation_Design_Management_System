package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrDefenseGroup;
import cn.edu.nchu.grimsys.domain.impl.vision1.DefenseGroupImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Mapper

public interface Defense_groupMapper {

    /**
     * 添加一个答辩小组
     * @param abstrDefenseGroup
     * @return
     */
    boolean addDefenseGroup(@Param("abstrDefenseGroup") AbstrDefenseGroup abstrDefenseGroup);

    /**
     * 修改答辩小组
     * @param abstrDefenseGroup
     * @return
     */
    boolean updateDefenseGroup(@Param("abstrDefenseGroup") AbstrDefenseGroup abstrDefenseGroup);


    /**
     * 根据ID删除答辩小组
     * @param id
     * @return
     */
    boolean deleteDefenseGroup(@Param("id") String id);


    /**
     * 根据ID查询答辩小组
     * @param id
     * @return
     */
    DefenseGroupImpl loadDefenseGroupByGroupId(@Param("id") String id);
}
