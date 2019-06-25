package cn.edu.nchu.grimsys.dao.datasource.Group_tea_form;

import cn.edu.nchu.grimsys.domain.AbstrGroupTeaForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Group_tea_formMapper {

    /**
     * 添加一条答辩小组-教师记录
     * @param abstrGroupTeaForm
     * @return
     */
    boolean addGroupTeaForm(@Param("groupTeaForm") AbstrGroupTeaForm abstrGroupTeaForm);

    /**
     * 删除答辩小组中的一位教师
     * @param tno
     * @return
     */
    boolean deleteOneTeaInGroup(@Param("tno") String tno);


    /**
     * 修改答辩小组-教师之间的关系
     * @param abstrGroupTeaForm
     * @return
     */
    boolean updateGroupTeaForm(@Param("groupTeaForm") AbstrGroupTeaForm abstrGroupTeaForm);


    /**
     * 根据答辩小组编号查询答辩小组中所有的教师
     * @param group_id
     * @return
     */
    List<AbstrGroupTeaForm> selectGroupTeaFormByGId(@Param("group_id") String group_id);


    /**
     * 根据教师工号查询该教师所在的答辩小组
     * @param tno
     * @return
     */
    AbstrGroupTeaForm selectGroupTeaFormByTno(@Param("tno") String tno);

}
