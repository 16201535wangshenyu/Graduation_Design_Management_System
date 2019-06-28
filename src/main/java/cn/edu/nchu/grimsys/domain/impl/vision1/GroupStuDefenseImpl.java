package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrGroupStuDefense;
import org.springframework.stereotype.Component;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Component
public class GroupStuDefenseImpl extends AbstrGroupStuDefense {


    @Override
    public String getGroup_id() {
        return this.group_id;
    }

    @Override
    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    @Override
    public String getSno() {
        return this.sno;
    }

    @Override
    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public String getRes_grade() {
        return this.res_grade;
    }

    @Override
    public void setRes_grade(String res_grade) {
        this.res_grade = res_grade;
    }
}
