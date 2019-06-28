package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrFile;
import org.springframework.stereotype.Component;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Component

public class FileImpl extends AbstrFile {


    @Override
    public String getFile_num() {
        return this.file_num;
    }

    @Override
    public void setFile_num(String file_num) {
        this.file_num = file_num;
    }

    @Override
    public String getFile_name() {
        return this.file_name;
    }

    @Override
    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    @Override
    public String getPath() {
        return this.path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String getFile_type() {
        return this.file_type;
    }

    @Override
    public void setFile_type(String file_type) {
        this.file_type = file_type;
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
    public String getOwn_per_no() {
        return this.own_per_no;
    }

    @Override
    public void setOwn_per_no(String own_per_no) {
        this.own_per_no = own_per_no;
    }
}
