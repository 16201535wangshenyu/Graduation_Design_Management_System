package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Component
public class Student extends AbstrStudent {
    @Pattern(regexp="[0-9]{8}",message="* 请输入8位数字")
    protected  String id;/**用户编号**/

    protected  String password;/**用户密码**/
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id=id;

    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender=gender;

    }

    @Override
    public String getBirthday() {
        return Birthday;
    }

    @Override
    public void setBirthday(String birthday) {
        this.Birthday=birthday;

    }

    @Override
    public String getTelephone() {
        return Telephone;
    }

    @Override
    public void setTelephone(String telephone) {
        this.Telephone=telephone;

    }

    @Override
    public String getIDcard_type() {
        return IDcard_type;
    }

    @Override
    public void setIDcard_type(String IDcard_type) {
        this.IDcard_type=IDcard_type;

    }

    @Override
    public String getDegree() {
        return this.degree;
    }
    @Override
    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String getIDcard_number() {
        return IDcard_number;
    }

    @Override
    public void setIDcard_number(String IDcard_number) {
        this.IDcard_number=IDcard_number;

    }
    public String getFaculties() {
        return Faculties;
    }

    public void setFaculties(String faculties) {
        Faculties = faculties;
    }
    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }




    public String getSclass() {
        return Sclass;
    }

    public void setSclass(String sclass) {
        Sclass = sclass;
    }
}
