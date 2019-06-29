package cn.edu.nchu.grimsys.domain;


/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
public abstract class AbstrAdminGroupOper {

    protected String ano;/*管理员编号*/
    protected String group_no;/*答辩小组编号*/
    protected String operate_time;/*操作日期*/
    protected String operate_type;/*操作类型*/


    public abstract String getAno();

    public abstract void setAno(String ano);

    public abstract String getGroup_no();

    public abstract void setGroup_no(String group_no);

    public abstract String getOperate_time();

    public abstract void setOperate_time(String operate_time);

    public abstract String getOperate_type();

    public abstract void setOperate_type(String operate_type);
}
