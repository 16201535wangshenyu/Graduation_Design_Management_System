package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrGroupStuDefense;

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
