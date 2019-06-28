package cn.edu.nchu.grimsys.domain;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
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
