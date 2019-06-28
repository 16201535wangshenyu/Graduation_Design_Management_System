package cn.edu.nchu.grimsys.domain;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
public abstract class AbstrGroupTeaForm {

    protected String group_id;/*答辩小组编号*/
    protected String tno;/*教师工号*/


    public abstract String getGroup_id();

    public abstract void setGroup_id(String group_id);

    public abstract String getTno();

    public abstract void setTno(String tno);
}
