package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrTeaTaskCreate;
import cn.edu.nchu.grimsys.domain.impl.vision1.TeaTaskCreateImpl;
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
public interface Tea_task_createMapper {


    /**
     * 添加一条教师-任务关联
     * @param teaTaskCreate
     * @return
     */
    boolean addTeaTaskCreate(@Param("teaTaskCreate") AbstrTeaTaskCreate teaTaskCreate);


    /**
     * 删除一条教师-任务关联
     * @param tno
     * @param task_no
     * @return
     */
    boolean deleteTeaTaskCreate(@Param("tno") String tno,@Param("task_no") String task_no);


    /**
     * 修改一条教师-任务关联
     * 修改任务截止时间
     * @param teaTaskCreate
     * @return
     */
    boolean updateTeaTaskCreate(@Param("teaTaskCreate")AbstrTeaTaskCreate teaTaskCreate);

    /**
     * 查询一条教师-任务关联
     * @param tno
     * @param task_no
     * @return
     */
    TeaTaskCreateImpl selectTeaTaskCreate(@Param("tno") String tno, @Param("task_no") String task_no);

}
