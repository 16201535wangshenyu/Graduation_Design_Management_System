package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrAdminStuOper;
import cn.edu.nchu.grimsys.domain.impl.vision1.AdminStuOperImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Admin_stu_operMapper {



    /**
     * 添加一条管理员对学生的操作日志
     * @param adminStuOper
     * @return
     */
    boolean addAdminStuOper (@Param("adminStuOper") AbstrAdminStuOper adminStuOper);


    /**
     * 根据学生学号，管理员删除日志文件
     * @param ano
     * @param sno
     * @return
     */
    boolean deleteAdminStuOper (@Param("ano") String ano,@Param("sno") String sno);


    /**
     * 查询指定管理员对所有学生的日志操作记录
     * @param ano
     * @return
     */
    List<AdminStuOperImpl> selectAdminStuOperByAno (@Param("ano") String  ano);


    /**
     * 查询指定管理员对指定学生学号的学生的日志操作记录
     * @param ano
     * @param sno
     * @return
     */
    List<AdminStuOperImpl> selectAdminStuOperByGId (@Param("ano") String  ano, @Param("sno") String sno);

}
