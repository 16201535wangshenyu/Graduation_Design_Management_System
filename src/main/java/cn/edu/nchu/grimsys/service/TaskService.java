package cn.edu.nchu.grimsys.service;

import cn.edu.nchu.grimsys.domain.impl.vision1.TaskImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */

public interface TaskService {
    public  List<TaskImpl> loadAllTaskBysno(String studentId);
}
