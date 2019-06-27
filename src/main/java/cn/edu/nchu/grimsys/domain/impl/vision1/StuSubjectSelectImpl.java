package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrStuSubjectSelect;
import org.springframework.stereotype.Component;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
@Component
public class StuSubjectSelectImpl extends AbstrStuSubjectSelect {

    @Override
    public String getSno() {
        return this.sno;
    }

    @Override
    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public String getCno() {
        return this.cno;
    }

    @Override
    public void setCno(String cno) {
        this.cno = cno;
    }

    @Override
    public String getSelect_time() {
        return this.select_time;
    }

    @Override
    public void setSelect_time(String select_time) {
        this.select_time = select_time;
    }
}
