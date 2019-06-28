package cn.edu.nchu.grimsys.domain;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
public abstract class AbstrGrade {


    protected String id;/*成绩编号*/
    protected String sno;/*学号*/
    protected String final_grade;/*总成绩*/
    protected String grade_level;/*成绩等级*/


    public abstract String getId();

    public abstract void setId(String id);

    public abstract String getSno();

    public abstract void setSno(String sno);

    public abstract String getFinal_grade();

    public abstract void setFinal_grade(String final_grade);

    public abstract String getGrade_level();

    public abstract void setGrade_level(String grade_level);
}
