package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.TeacherMapper;
import cn.edu.nchu.grimsys.domain.AbstrTeacher;
import cn.edu.nchu.grimsys.util.StringHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherMapperTest {
    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private AbstrTeacher teacher;

    @Test
    public void  insertTeacherTest() {
        teacher.setId("1");
        teacher.setPassword(StringHelper.encrypt("123456"));
        teacher.setName("丁兴宇");
        teacher.setGender("男");
        teacher.setBirthday("1995-11-03 16:44:22");
        teacher.setFaculties("软件工程");
        teacher.setEmploy_time("2016-9-1");
        teacher.setProfession_title("教师");
        teacher.setTelephone("18296378888");
        teacher.setIDcard_number("身份证");
        teacher.setIDcard_type("111");

        teacherMapper.insertTeacher(teacher);
    }
    @Test
    public void  deleteTeacherTest() {
        teacherMapper.deleteTeacher("1");
    }
    @Test
    public void  updateTeacherTest() {
        teacher.setId("1");
        teacher.setPassword(StringHelper.encrypt("123456"));
        teacher.setName("丁兴宇");
        teacher.setGender("男");
        teacher.setBirthday("1997-11-03 16:44:22");
        teacher.setFaculties("软件工程");
        teacher.setEmploy_time("2016-9-1");
        teacher.setProfession_title("教师");
        teacher.setTelephone("18296378888");
        teacher.setIDcard_number("身份证");
        teacher.setIDcard_type("111");

        teacherMapper.updateTeacher(teacher);
    }
    @Test
    public void  selectTeacherByIdTest() {
        teacherMapper.selectTeacherById("1");
    }
}
