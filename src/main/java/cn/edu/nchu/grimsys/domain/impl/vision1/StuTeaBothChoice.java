package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrStuTeaBothChoice;
import org.springframework.stereotype.Component;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Component
public class StuTeaBothChoice extends AbstrStuTeaBothChoice {
    @Override
    public String getSno() {
        return this.sno;
    }

    @Override
    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public String getTno() {
        return this.tno;
    }

    @Override
    public void setTno(String tno) {
        this.tno = tno;
    }

    @Override
    public String getIs_receive() {
        return this.is_receive;
    }

    @Override
    public void setIs_receive(String is_receive) {
        this.is_receive = is_receive;
    }
}
