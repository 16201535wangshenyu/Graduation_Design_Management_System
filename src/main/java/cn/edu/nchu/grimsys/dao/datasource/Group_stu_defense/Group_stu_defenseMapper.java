package cn.edu.nchu.grimsys.dao.datasource.Group_stu_defense;

import cn.edu.nchu.grimsys.domain.AbstrGroupStuDefense;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Group_stu_defenseMapper {



    /**
     * 添加一条答辩小组-学生-答辩记录
     * @param groupStuDefense
     * @return
     */
    boolean addGroupStuDefense(@Param("groupStuDefense") AbstrGroupStuDefense groupStuDefense);

    /**
     * 删除一条答辩小组-学生-答辩记录
     * @param sno
     * @return
     */
    boolean deleteGroupStuDefense(@Param("sno") String sno);


    /**
     * 修改答辩小组-学生-答辩记录
     * @param groupStuDefense
     * @return
     */
    boolean updateGroupStuDefense(@Param("groupStuDefense") AbstrGroupStuDefense groupStuDefense);


    /**
     * 根据答辩小组编号查询答辩小组答辩的所有学生对象
     * @param group_id
     * @return
     */
    List<AbstrGroupStuDefense> selectGroupStuDefenseByGId(@Param("group_id") String group_id);


    /**
     * 根据学号查询学生答辩详情
     * @param sno
     * @return
     */
    AbstrGroupStuDefense selectGroupStuDefenseByTno(@Param("sno") String sno);
}
