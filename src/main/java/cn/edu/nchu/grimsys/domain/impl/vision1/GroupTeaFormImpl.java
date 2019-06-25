package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrGroupTeaForm;

public class GroupTeaFormImpl extends AbstrGroupTeaForm {
    @Override
    public String getGroup_id() {
        return this.group_id;
    }

    @Override
    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    @Override
    public String getTno() {
        return this.tno;
    }

    @Override
    public void setTno(String tno) {
        this.tno = tno;
    }
}
