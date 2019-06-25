package cn.edu.nchu.grimsys.dao.datasource.student;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {
    /**
     * 增加学生
     * @param student
     * @return
     */
    boolean insertStudent(@Param("student")AbstrStudent student);

    /**
     * 删除学生根据学生ID
     * @param id
     * @return
     */
    boolean deleteStudent(@Param("id")String id);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    boolean updateStudent(@Param("student")AbstrStudent student);

    /**
     * 查询学生通过学生ID
     * @param id
     * @return
     */
    boolean selectStudentById(@Param("id") String id);



}
