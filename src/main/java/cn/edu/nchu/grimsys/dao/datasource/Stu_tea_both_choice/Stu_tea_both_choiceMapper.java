package cn.edu.nchu.grimsys.dao.datasource.Stu_tea_both_choice;

import cn.edu.nchu.grimsys.domain.AbstrStuTeaBothChoice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Stu_tea_both_choiceMapper {

    /**
     * 修改师生互选记录
     * @param stuTeaBothChoice
     * @return
     */
    boolean updateStuTeaBothChoice(@Param("stuTeaBothChoice") AbstrStuTeaBothChoice stuTeaBothChoice);


    /**
     * 删除师生互选记录
     * @param stuTeaBothChoice
     * @return
     */
    boolean deleteStuTeaBothChoice(@Param("stuTeaBothChoice") AbstrStuTeaBothChoice stuTeaBothChoice);


    /**
     * 添加师生互选记录
     * @param stuTeaBothChoice
     * @return
     */
    boolean addStuTeaBothChoice(@Param("stuTeaBothChoice") AbstrStuTeaBothChoice stuTeaBothChoice);


    /**
     * 根据学号查询师生互选记录
     * @param sno
     * @return
     */
    AbstrStuTeaBothChoice selectStuTeaBothChoiceBySno(@Param("sno") String sno);


    /**
     * 根据教师工号查询师生互选记录
     * @param tno
     * @return
     */
    AbstrStuTeaBothChoice selectStuTeaBothChoiceByTno(@Param("tno") String tno);
}
