package cn.edu.nchu.grimsys.domain;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
public abstract class AbstrTeaTaskCreate {
    protected String tno;/*教师工号*/
    protected String task_no;/*任务编号*/
    protected String create_time;/*创建时间*/
    protected String start_time;/*开始时间*/
    protected String end_time;/*截止时间*/


    public abstract String getTno();

    public abstract void setTno(String tno);

    public abstract String getTask_no();

    public abstract void setTask_no(String task_no);

    public abstract String getCreate_time();

    public abstract void setCreate_time(String create_time);

    public abstract String getStart_time();

    public abstract void setStart_time(String start_time);

    public abstract String getEnd_time();

    public abstract void setEnd_time(String end_time);
}
