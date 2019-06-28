package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrTeacher;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TeacherMapper {
    /**
     * 增加教师信息
     * @param teacher
     * @return
     */
    boolean insertTeacher(@Param("teacher") AbstrTeacher teacher);

    /**
     * 删除教师信息
     * @param id
     * @return
     */
    boolean deleteTeacher(@Param("id") String id);

    /**
     * 修改教师信息
     * @param teacher
     * @return
     */
    boolean updateTeacher(@Param("teacher") AbstrTeacher teacher);

    /**
     * 查询教师信息，通过教师ID
     * @param id
     * @return
     */
    Teacher selectTeacherById(@Param("id") String id);


}
