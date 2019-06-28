package cn.edu.nchu.grimsys.domain;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
public abstract class AbstrAdmin extends AbstrUser{

    public abstract String getFaculties() ;

    public abstract void setFaculties(String faculties) ;

    public abstract String getEmploy_time() ;

    public abstract void setEmploy_time(String employ_time);
    public abstract String getProfession_title() ;

    public abstract void setProfession_title(String profession_title);

}
