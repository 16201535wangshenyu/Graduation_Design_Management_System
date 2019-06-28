package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrTask;
import org.springframework.stereotype.Component;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Component
public class TaskImpl extends AbstrTask {
    @Override
    public String getTask_no() {
        return this.task_no;
    }

    @Override
    public void setTask_no(String task_no) {
        this.task_no = task_no;
    }

    @Override
    public String getTask_name() {
        return this.task_name;
    }

    @Override
    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    @Override
    public String getTask_content() {
        return this.task_content;
    }

    @Override
    public void setTask_content(String task_content) {
        this.task_content = task_content;
    }
}
