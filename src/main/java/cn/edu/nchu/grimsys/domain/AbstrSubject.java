package cn.edu.nchu.grimsys.domain;

public abstract class AbstrSubject {

    protected String id;/*课题编号*/
    protected String name;/*课题名称*/
    protected String profession;/*专业*/
    protected String degree;/*课题难度*/
    protected String content;/*课题内容*/
    protected String file_name;/*课题附件*/
    protected String status;/*课题生存状态*/
    protected String advice;/*审核意见*/


    public abstract String getId();

    public abstract void setId(String id);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getProfession();

    public abstract void setProfession(String profession);

    public abstract String getDegree();

    public abstract void setDegree(String degree);

    public abstract String getContent();

    public abstract void setContent(String content);

    public abstract String getFile_name();

    public abstract void setFile_name(String file_name);

    public abstract String getStatus();

    public abstract void setStatus(String status);

    public abstract String getAdvice();

    public abstract void setAdvice(String advice);

}