package cn.edu.nchu.grimsys;

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
public class InsertTest {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private AbstrStudent student;


    @Test
    public void insertStudentTest(){
        student.setId("000004");
        student.setName("何文勇");
        student.setGender("男");
        student.setBirthday("1997-01-17");
        student.setFaculties("ss");
        student.setProfession("软件工程");
        student.setDegree("高中");
        student.setSclass("162015");
        student.setTelephone("13755282130");
        student.setIDcard_type("身份证");
        student.setIDcard_number("110");
        /*student.setPassword(StringHelper.encrypt("123"));*/
        studentMapper.insertStudent(student);
    }
}
