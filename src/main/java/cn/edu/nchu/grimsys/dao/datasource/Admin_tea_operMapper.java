package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrAdminTeaOper;
import cn.edu.nchu.grimsys.domain.impl.vision1.AdminTeaOperImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Admin_tea_operMapper {


    /**
     * 添加一条管理员对教师的操作日志
     * @param adminTeaOper
     * @return
     */
    boolean addAdminTeaOper (@Param("adminTeaOper") AbstrAdminTeaOper adminTeaOper);


    /**
     * 根据教师工号，管理员删除日志文件
     * @param ano
     * @param tno
     * @return
     */
    boolean deleteAdminTeaOper (@Param("ano") String ano,@Param("tno") String tno);


    /**
     * 查询指定管理员对所有教师工号的日志操作记录
     * @param ano
     * @return
     */
    List<AdminTeaOperImpl> selectAdminTeaOperByAno (@Param("ano") String  ano);


    /**
     * 查询指定管理员对指定教师工号的日志操作记录
     * @param ano
     * @param tno
     * @return
     */
    List<AdminTeaOperImpl> selectAdminTeaOperByGId (@Param("ano") String  ano, @Param("tno") String tno);

}
