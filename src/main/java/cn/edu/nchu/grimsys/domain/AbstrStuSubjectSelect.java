package cn.edu.nchu.grimsys.domain;

public abstract class AbstrStuSubjectSelect {


    protected String sno;  /*学号*/
    protected String cno;  /*课题编号*/
    protected String select_time;  /*选题时间*/


    public abstract String getSno();

    public abstract void setSno(String sno);

    public abstract String getCno();

    public abstract void setCno(String cno);

    public abstract String getSelect_time();

    public abstract void setSelect_time(String select_time);
}
