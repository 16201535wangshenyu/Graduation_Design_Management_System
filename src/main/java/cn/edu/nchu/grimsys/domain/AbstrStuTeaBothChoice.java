package cn.edu.nchu.grimsys.domain;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
public abstract class AbstrStuTeaBothChoice  {

    protected String sno;/*学号*/
    protected String tno;/*教师工号*/
    protected String is_receive;/*接收意愿*/

    public abstract String getSno();

    public abstract void setSno(String sno);

    public abstract String getTno();

    public abstract void setTno(String tno);

    public abstract String getIs_receive();

    public abstract void setIs_receive(String is_receive);
}
