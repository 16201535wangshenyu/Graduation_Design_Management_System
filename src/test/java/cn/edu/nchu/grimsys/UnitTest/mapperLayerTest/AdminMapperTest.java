package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.AdminMapper;
import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.util.StringHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminMapperTest {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AbstrAdmin admin;


    @Test
    public void insertAdminTest() {
        admin.setId("000000");
        admin.setPassword(StringHelper.encrypt("123456"));
        admin.setName("张三");
        admin.setGender("男");
        admin.setBirthday("1995-11-03 16:44:22");
        admin.setFaculties("软件");
        admin.setEmploy_time("2018年5月8日");
        admin.setProfession_title("院系管理员");
        admin.setTelephone("18296378888");
        admin.setIDcard_number("管理员");
        admin.setIDcard_type("0001");

        adminMapper.insertAdmin(admin);
    }

    @Test
    public void selectAdminByidTest(){
        adminMapper.selectAdminByid("");
    }

    @Test
    public void updateAdminTest(){
        admin.setId("000000");
        admin.setPassword(StringHelper.encrypt("123456"));
        admin.setName("张三");
        admin.setGender("男");
        admin.setBirthday("1995-11-03 16:44:22");
        admin.setFaculties("软件");
        admin.setEmploy_time("2018年5月8日");
        admin.setProfession_title("院系管理员");
        admin.setTelephone("18296378888");
        admin.setIDcard_number("管理员");
        admin.setIDcard_type("0001");

        adminMapper.updateAdmin(admin);
    }

    @Test
    public void deleteAdminByIdTest(){
        adminMapper.deleteAdminById("");
    }
}
