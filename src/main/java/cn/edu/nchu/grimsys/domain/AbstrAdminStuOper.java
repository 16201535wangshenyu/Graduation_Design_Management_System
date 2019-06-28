package cn.edu.nchu.grimsys.domain;


import org.springframework.stereotype.Component;

/**
 * 管理员管理学生bean
 */

public abstract class AbstrAdminStuOper {

    protected String ano;/*管理员编号*/
    protected String sno;/*学生编号*/
    protected String operate_time;/*操作日期*/
    protected String operate_type;/*操作类型*/


    public abstract String getAno();

    public abstract void setAno(String ano);

    public abstract String getSno();

    public abstract void setSno(String sno);

    public abstract String getOperate_time();

    public abstract void setOperate_time(String operate_time);

    public abstract String getOperate_type();

    public abstract void setOperate_type(String operate_type);
}
