package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrTask;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
@Mapper

public interface TaskMapper {

    /**
     * 添加新的任务
     * @param task
     * @return
     */
    boolean addTask(@Param("task") AbstrTask task);


    /**
     * 根据任务号删除任务
     * @param task_no
     * @return
     */
    boolean deleteTask(@Param("task_no") String task_no);


    /**
     * 修改任务内容
     * @param task
     * @return
     */
    boolean updateTaskContent(@Param("task") AbstrTask task);


    /**
     * 根据任务Id查找对应任务
     * @param task_no
     * @return
     */
    AbstrTask loadTaskByTaskId(@Param("task_no") String task_no);
}
