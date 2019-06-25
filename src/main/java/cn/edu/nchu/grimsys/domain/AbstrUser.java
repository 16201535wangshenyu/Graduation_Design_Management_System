package cn.edu.nchu.grimsys.domain;


public abstract class AbstrUser {
    protected  String id;/**用户编号**/
    protected  String name;/**用户姓名**/
    protected  String gender;/**性别**/
    protected  String Birthday;/**出生年月**/
    protected  String Faculties;/**院系**/
    protected  String employ_time;/**任职时间**/
    protected  String Profession_title;/**职称**/
    protected  String Telephone;/**手机号**/
    protected  String IDcard_type;/**证件类型**/
    protected  String IDcard_number;/**证件号**/
    protected  String Profession;/**专业**/
    protected  String Sclass;/**班级**/

    public abstract String getId() ;

    public abstract void setId(String id) ;

    public abstract String getName() ;

    public abstract void setName(String name);

    public abstract String getGender() ;

    public abstract void setGender(String gender) ;

    public abstract String getBirthday() ;

    public abstract void setBirthday(String birthday) ;

    public abstract String getTelephone() ;

    public abstract void setTelephone(String telephone);

    public abstract String getIDcard_type() ;

    public abstract void setIDcard_type(String IDcard_type) ;

    public abstract String getIDcard_number() ;

    public abstract void setIDcard_number(String IDcard_number) ;

}
