package cn.edu.nchu.grimsys.domain;

public abstract class AbstrTeaSubjectDeclare {

    protected String tno;/*教师编号*/
    protected String cno;/*课题编号*/
    protected String status;/*审核状态*/

    public abstract String getTno();

    public abstract void setTno(String tno);

    public abstract String getCno();

    public abstract void setCno(String cno);

    public abstract String getStatus();

    public abstract void setStatus(String status);
}
