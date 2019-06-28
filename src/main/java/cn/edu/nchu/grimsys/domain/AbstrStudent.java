package cn.edu.nchu.grimsys.domain;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
public abstract class AbstrStudent extends AbstrUser{
    protected String degree;/*学生学位*/


    public abstract String getDegree();

    public abstract void setDegree(String degree);

    public abstract String getFaculties() ;

    public abstract void setFaculties(String faculties) ;
    public abstract String getProfession() ;

    public abstract void setProfession(String profession) ;

    public abstract String getSclass() ;

    public abstract void setSclass(String sclass) ;
}
