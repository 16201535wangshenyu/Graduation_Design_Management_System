package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrAdminTeaOper;
import org.springframework.stereotype.Component;

@Component

public class AdminTeaOperImpl extends AbstrAdminTeaOper {

    @Override
    public String getAno() {
        return this.ano;
    }

    @Override
    public void setAno(String ano) {
        this.ano = ano;
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
    public String getOperate_time() {
        return this.operate_time;
    }

    @Override
    public void setOperate_time(String operate_time) {
        this.operate_time = operate_time;
    }

    @Override
    public String getOperate_type() {
        return this.operate_type;
    }

    @Override
    public void setOperate_type(String operate_type) {
        this.operate_type = operate_type;
    }
}
