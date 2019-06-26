package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrTeaTaskCreate;
import org.springframework.stereotype.Component;

@Component
public class TeaTaskCreateImpl extends AbstrTeaTaskCreate {
    @Override
    public String getTno() {
        return this.tno;
    }

    @Override
    public void setTno(String tno) {
        this.tno = tno;
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
    public String getCreate_time() {
        return this.create_time;
    }

    @Override
    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    @Override
    public String getStart_time() {
        return this.start_time;
    }

    @Override
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    @Override
    public String getEnd_time() {
        return this.end_time;
    }

    @Override
    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}
