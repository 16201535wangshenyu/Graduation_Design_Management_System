package cn.edu.nchu.grimsys.domain;

public abstract class AbstrAdminTeaOper {

    protected String ano;/*管理员编号*/
    protected String tno;/*教师编号*/
    protected String operate_time;/*操作日期*/
    protected String operate_type;/*操作类型*/

    public abstract String getAno();

    public abstract void setAno(String ano);

    public abstract String getTno();

    public abstract void setTno(String tno);

    public abstract String getOperate_time();

    public abstract void setOperate_time(String operate_time);

    public abstract String getOperate_type();

    public abstract void setOperate_type(String operate_type);
}
