package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
@Mapper
public interface StudentMapper {
    /**
     * 增加学生
     * @param student
     * @return
     */
    boolean insertStudent(@Param("student") AbstrStudent student);

    /**
     * 删除学生根据学生ID
     * @param id
     * @return
     */
    boolean deleteStudent(@Param("id") String id);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    boolean updateStudent(@Param("student") AbstrStudent student);

    /**
     * 查询学生通过学生ID
     * @param id
     * @return
     */
    boolean selectStudentById(@Param("id") String id);



}
