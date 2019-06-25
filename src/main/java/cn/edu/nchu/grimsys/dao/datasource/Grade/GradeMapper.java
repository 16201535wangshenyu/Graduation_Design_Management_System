package cn.edu.nchu.grimsys.dao.datasource.Grade;

import cn.edu.nchu.grimsys.domain.AbstrGrade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GradeMapper {


    /**
     * 添加成绩记录
     * @param grade
     * @return
     */
    boolean addGradeRecord(@Param("grade") AbstrGrade grade);


    /**
     * 修改成绩
     * @param grade
     * @return
     */
    boolean updateGradeRecord(@Param("grade") AbstrGrade grade);


    /**
     * 根据学生学号删除成绩
     * @param id
     * @return
     */
    boolean deleteGradeRecord(@Param("id") String id);


    /**
     * 根据成绩ID查询成绩
     * @param id
     * @return
     */
    AbstrGrade loadGradeByGradeId(@Param("id") String id);


}
