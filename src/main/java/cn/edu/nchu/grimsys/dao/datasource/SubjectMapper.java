package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrSubject;
import cn.edu.nchu.grimsys.domain.impl.vision1.SubjectImpl;
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
public interface SubjectMapper {

    /**
     * 创建课题
     * @param subject
     * @return
     */
    boolean addSubject(@Param("subject") AbstrSubject subject);


    /**
     * 根据课题ID删除课题
     * @param id
     * @return
     */
    boolean deleteSubject(@Param("id") String id);


    /**
     * 修改课题信息
     * @param subject
     * @return
     */
    boolean updateSubject(@Param("subject") AbstrSubject subject);


    AbstrSubject loadSubjectBySubject(@Param("id") String id);

    /**
     * 查询课题通过学号
     * @param studentId
     * @return
     */
    AbstrSubject selectSubjectBySno(@Param("studentId") String studentId);

    /**
     * 加载教师创建的课题
     * @param teacherId
     * @return
     */
    List<SubjectImpl> loadSubjectByTno(@Param("teacherId") String teacherId);

    /**
     * 加载教师已发布的课题
     * @param teacherId
     * @return
     */
    List<SubjectImpl> loadSubmittedSubjectByTno(@Param("teacherId") String teacherId);
}
