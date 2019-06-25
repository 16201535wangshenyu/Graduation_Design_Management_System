package cn.edu.nchu.grimsys.domain;

public abstract class AbstrFile {

    protected String file_num;/*文件编号*/
    protected String file_name;/*文件名称*/
    protected String path;/*路径*/
    protected String file_type;/*文件类型*/
    protected String task_no;/*任务编号*/
    protected String own_per_no;/*文件所属人编号*/

    public abstract String getFile_num();

    public abstract void setFile_num(String file_num);

    public abstract String getFile_name();

    public abstract void setFile_name(String file_name);

    public abstract String getPath();

    public abstract void setPath(String path);

    public abstract String getFile_type();

    public abstract void setFile_type(String file_type);

    public abstract String getTask_no();

    public abstract void setTask_no(String task_no);

    public abstract String getOwn_per_no();

    public abstract void setOwn_per_no(String own_per_no);
}
