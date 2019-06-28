package cn.edu.nchu.grimsys.domain;


import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
public abstract class AbstrUser {
    @Size(min=6, max=6)
    protected  String id;/**用户编号**/

    protected  String name;/**用户姓名**/

    protected  String password;/**用户密码**/

    protected  String gender;/**性别**/

    @DateTimeFormat(pattern="yyyy-MM-dd")
    protected  String Birthday;/**出生年月**/

    protected  String Faculties;/**院系**/

    @DateTimeFormat(pattern="yyyy-MM-dd")
    protected  String employ_time;/**任职时间**/

    protected  String Profession_title;/**职称**/

    @Pattern(regexp="[0-9]{11}",message="* 请输入11位数字")
    protected  String Telephone;/**手机号**/

    protected  String IDcard_type;/**证件类型**/

    @Pattern(regexp="[0-9]{18}",message="* 请输入18位数字")
    protected  String IDcard_number;/**证件号**/

    protected  String Profession;/**专业**/

    @Pattern(regexp="[0-9]{6}",message="* 请输入6位数字")
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

    public abstract String getPassword() ;

    public abstract void setPassword(String password);
}
