package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.StudentMapper;
import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.util.StringHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest
{
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private AbstrStudent student;

    @Test
    public void  insertStudentTest() {
        student.setId(5);
        student.setPassword(StringHelper.encrypt("123456"));
        student.setName("丁兴宇");
        student.setGender("男");
        student.setBirthday("1995-11-03 16:44:22");
        student.setFaculties("软件学院");
        student.setProfession("软件工程");
        student.setDegree("高中");
        student.setSclass("162015");
        student.setTelephone("18296378888");
        student.setIDcard_number("身份证");
        student.setIDcard_type("111");

        studentMapper.insertStudent(student);
    }
    @Test
    public void  deleteStudentTest() {
        studentMapper.deleteStudent("5");
    }
    @Test
    public void  updateStudentTest() {
        student.setId(5);
        student.setPassword(StringHelper.encrypt("123456"));
        student.setName("丁兴宇");
        student.setGender("男");
        student.setBirthday("1997-11-03 16:44:22");
        student.setFaculties("软件学院");
        student.setProfession("软件工程");
        student.setDegree("高中");
        student.setSclass("162015");
        student.setTelephone("18296378888");
        student.setIDcard_number("身份证");
        student.setIDcard_type("111");

        studentMapper.updateStudent(student);
    }
    @Test
    public void  selectStudentByIdTest() {
        studentMapper.selectStudentById("5");
    }

}
