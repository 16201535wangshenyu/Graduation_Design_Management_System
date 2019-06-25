package cn.edu.nchu.grimsys.domain;

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
