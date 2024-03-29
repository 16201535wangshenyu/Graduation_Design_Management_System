package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrGrade;
import cn.edu.nchu.grimsys.domain.impl.vision1.GradeImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
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
     * @param sno
     * @return
     */
    boolean deleteGradeRecord(@Param("sno") String sno);


    /**
     * 根据成绩ID查询成绩
     * @param id
     * @return
     */
    GradeImpl loadGradeByGradeId(@Param("id") String id);


}
