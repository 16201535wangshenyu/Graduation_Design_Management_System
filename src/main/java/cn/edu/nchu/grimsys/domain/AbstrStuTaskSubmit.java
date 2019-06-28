package cn.edu.nchu.grimsys.domain;


/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
public abstract class AbstrStuTaskSubmit  {

    protected String sno;/*学号*/
    protected String task_no;/*任务号*/
    protected String status;/*任务状态*/
    protected String content;/*提交内容*/
    protected String grade;/*成绩*/
    protected String remark;/*评论*/
    protected String submit_time;/*提交时间*/
    protected boolean is_submit;/*是否提交*/
    protected boolean is_scored;/*是否评分*/


    public abstract String getSno();

    public abstract void setSno(String sno);

    public abstract String getTask_no();

    public abstract void setTask_no(String task_no);

    public abstract String getStatus();

    public abstract void setStatus(String status);

    public abstract String getContent();

    public abstract void setContent(String content);

    public abstract String getGrade();

    public abstract void setGrade(String grade);

    public abstract String getRemark();

    public abstract void setRemark(String remark);

    public abstract String getSubmit_time();

    public abstract void setSubmit_time(String submit_time);

    public abstract boolean isIs_submit();

    public abstract void setIs_submit(boolean is_submit);

    public abstract boolean isIs_scored();

    public abstract void setIs_scored(boolean is_scored);
}
