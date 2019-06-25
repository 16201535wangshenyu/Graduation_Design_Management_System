package cn.edu.nchu.grimsys.dao.datasource.teacher;

import cn.edu.nchu.grimsys.domain.AbstrTeacher;
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
     * @param teacherID
     * @return
     */
    boolean deleteTeacher(@Param("teacherID")String teacherID );

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
    AbstrTeacher selectTeacherById(@Param("id") String id );


}
