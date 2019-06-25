package cn.edu.nchu.grimsys.domain;

public abstract class AbstrTask {


    protected String task_no;/*任务编号*/
    protected String task_name;/*任务名称*/
    protected String task_content;/*任务内容*/


    public abstract String getTask_no();

    public abstract void setTask_no(String task_no);

    public abstract String getTask_name();

    public abstract void setTask_name(String task_name);

    public abstract String getTask_content();

    public abstract void setTask_content(String task_content);
}
