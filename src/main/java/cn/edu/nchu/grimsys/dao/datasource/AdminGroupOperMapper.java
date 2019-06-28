package cn.edu.nchu.grimsys.dao.datasource;


import cn.edu.nchu.grimsys.domain.AbstrAdminGroupOper;
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
public interface AdminGroupOperMapper {


    /**
     * 添加一条管理员对答辩小组的操作日志
     * @param adminGroupOper
     * @return
     */
    boolean addAdminGroupOper (@Param("adminGroupOper") AbstrAdminGroupOper adminGroupOper);


    /**
     * 根据小组号，管理员删除日志文件
     * @param ano
     * @param group_no
     * @return
     */
    boolean deleteAdminGroupOper (@Param("ano") String ano,@Param("group_no") String group_no);


    /**
     * 查询指定管理员对所有答辩小组的日志操作记录
     * @param ano
     * @return
     */
    List<AbstrAdminGroupOper> selectAdminGroupOperByAno (@Param("ano") String  ano);


    /**
     * 查询指定管理员对指定答辩小组的日志操作记录
     * @param ano
     * @param group_no
     * @return
     */
    List<AbstrAdminGroupOper> selectAdminGroupOperByGId (@Param("ano") String  ano,@Param("group_no") String group_no);


}
