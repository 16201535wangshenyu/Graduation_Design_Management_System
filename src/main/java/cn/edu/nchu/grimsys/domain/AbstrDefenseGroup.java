package cn.edu.nchu.grimsys.domain;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
public abstract class AbstrDefenseGroup {

    protected String id;/*答辩小组编号*/
    protected String leader_id;/*组长编号*/
    protected String group_name;/*小组名称*/
    protected String people_num;/*小组人数*/
    protected String build_time;/*成立时间*/


    public abstract String getId();

    public abstract void setId(String id);

    public abstract String getLeader_id();

    public abstract void setLeader_id(String leader_id);

    public abstract String getGroup_name();

    public abstract void setGroup_name(String group_name);

    public abstract String getPeople_num();

    public abstract void setPeople_num(String people_num);

    public abstract String getBuild_time();

    public abstract void setBuild_time(String build_time);
}
