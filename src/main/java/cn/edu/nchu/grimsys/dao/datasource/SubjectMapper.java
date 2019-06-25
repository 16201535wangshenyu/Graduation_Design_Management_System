package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrSubject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
}
