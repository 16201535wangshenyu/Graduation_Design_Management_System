package cn.edu.nchu.grimsys.domain;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
public abstract class AbstrGroupStuDefense {

    protected String group_id;/*答辩小组编号*/
    protected String sno;/*学号*/
    protected String res_grade;/*答辩成绩*/


    public abstract String getGroup_id();

    public abstract void setGroup_id(String group_id);

    public abstract String getSno();

    public abstract void setSno(String sno);

    public abstract String getRes_grade();

    public abstract void setRes_grade(String res_grade);
}
