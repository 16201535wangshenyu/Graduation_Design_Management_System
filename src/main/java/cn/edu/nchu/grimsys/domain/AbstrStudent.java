package cn.edu.nchu.grimsys.domain;

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
