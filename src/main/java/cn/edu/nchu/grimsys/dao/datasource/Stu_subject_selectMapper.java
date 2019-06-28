package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrStuSubjectSelect;
import cn.edu.nchu.grimsys.domain.impl.vision1.StuSubjectSelectImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Stu_subject_selectMapper {

    /**
     * 学生选题后，添加一条记录到选题表
     * @param stuSubjectSelect
     * @return
     */
    boolean addStuSubjectSelect(@Param("stuSubjectSelect") AbstrStuSubjectSelect stuSubjectSelect);


    /**
     * 删除学生选题记录
     * @param sno
     * @param cno
     * @return
     */
    boolean deleteStuSubjectSelect(@Param("sno") String sno,@Param("cno") String cno);


    /**
     * 查询一条学生选题记录
     * @param sno
     * @param cno
     * @return
     */
    StuSubjectSelectImpl selectStuSubjectSelect(@Param("sno") String sno, @Param("cno") String cno);
}
