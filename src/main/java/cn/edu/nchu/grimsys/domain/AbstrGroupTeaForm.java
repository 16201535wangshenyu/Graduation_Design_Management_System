package cn.edu.nchu.grimsys.domain;

public abstract class AbstrGroupTeaForm {

    protected String group_id;/*答辩小组编号*/
    protected String tno;/*教师工号*/


    public abstract String getGroup_id();

    public abstract void setGroup_id(String group_id);

    public abstract String getTno();

    public abstract void setTno(String tno);
}
