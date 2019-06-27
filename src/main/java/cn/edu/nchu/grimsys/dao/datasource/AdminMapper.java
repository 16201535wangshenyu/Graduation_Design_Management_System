package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrAdmin;
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
public interface AdminMapper {
    /**
     * 根据管理员ID查找管理员
     * @param adminNum
     * @return
     */
   AbstrAdmin selectAdminByid(@Param("adminNum") String adminNum);

    /**
     * 向管理员表增加管理员记录
     * @param admin
     * @return
     */

   boolean insertAdmin(@Param("admin") AbstrAdmin admin);

    /**
     * 修改管理员的信息
     * @param admin
     * @return
     */

   boolean updateAdmin(@Param("admin") AbstrAdmin admin);

    /**
     * 删除管理员记录通过ID
     * @param adminNum
     * @return
     */
   boolean deleteAdminById(@Param("adminNum") String adminNum);


}
