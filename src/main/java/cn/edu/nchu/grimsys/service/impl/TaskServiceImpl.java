package cn.edu.nchu.grimsys.service.impl;

import cn.edu.nchu.grimsys.dao.datasource.TaskMapper;
import cn.edu.nchu.grimsys.domain.impl.vision1.TaskImpl;
import cn.edu.nchu.grimsys.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskMapper taskMapper;
    /**
     * 加载任务通过学号
     * @param studentId
     * @return
     */
    @Override
    public List<TaskImpl> loadAllTaskBysno(String studentId) {
        return taskMapper.loadAllTaskBySno(studentId);
    }
}
