package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrGroupTeaForm;
import cn.edu.nchu.grimsys.domain.impl.vision1.GroupTeaFormImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Mapper
public interface Group_tea_formMapper {

    /**
     * 添加一条答辩小组-教师记录
     * @param groupTeaForm
     * @return
     */
    boolean addGroupTeaForm(@Param("groupTeaForm") AbstrGroupTeaForm groupTeaForm);

    /**
     * 删除答辩小组中的一位教师
     * @param tno
     * @return
     */
    boolean deleteOneTeaInGroup(@Param("tno") String tno);


    /**
     * 修改答辩小组-教师之间的关系
     * @param groupTeaForm
     * @return
     */
    boolean updateGroupTeaForm(@Param("groupTeaForm") AbstrGroupTeaForm groupTeaForm);


    /**
     * 根据答辩小组编号查询答辩小组中所有的教师
     * @param group_id
     * @return
     */
    List<GroupTeaFormImpl> selectGroupTeaFormByGId(@Param("group_id") String group_id);


    /**
     * 根据教师工号查询该教师所在的答辩小组
     * @param tno
     * @return
     */
    GroupTeaFormImpl selectGroupTeaFormByTno(@Param("tno") String tno);

}
