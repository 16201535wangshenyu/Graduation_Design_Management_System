package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrTeaSubjectDeclare;
import org.springframework.stereotype.Component;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
@Component
public class TeaSubjectDeclareImpl extends AbstrTeaSubjectDeclare {
    @Override
    public String getTno() {
        return this.tno;
    }

    @Override
    public void setTno(String tno) {
        this.tno = tno;
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
    public String getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
