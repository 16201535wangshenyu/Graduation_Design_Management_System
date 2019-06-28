package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrGroupTeaForm;
import org.springframework.stereotype.Component;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
@Component
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
