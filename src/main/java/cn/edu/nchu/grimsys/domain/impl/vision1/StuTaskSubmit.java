package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrStuTaskSubmit;
import org.springframework.stereotype.Component;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
@Component
public class StuTaskSubmit extends AbstrStuTaskSubmit {
    @Override
    public String getSno() {
        return this.sno;
    }

    @Override
    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public String getTask_no() {
        return this.task_no;
    }

    @Override
    public void setTask_no(String task_no) {
        this.task_no = task_no;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getGrade() {
        return this.grade;
    }

    @Override
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String getRemark() {
        return this.remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String getSubmit_time() {
        return this.submit_time;
    }

    @Override
    public void setSubmit_time(String submit_time) {
        this.submit_time = submit_time;
    }

    @Override
    public boolean isIs_submit() {
        return this.is_submit;
    }

    @Override
    public void setIs_submit(boolean is_submit) {
        this.is_submit = is_submit;
    }

    @Override
    public boolean isIs_scored() {
        return this.is_scored;
    }

    @Override
    public void setIs_scored(boolean is_scored) {
        this.is_scored = is_scored;
    }
}
