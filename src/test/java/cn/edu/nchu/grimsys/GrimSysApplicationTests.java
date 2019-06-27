package cn.edu.nchu.grimsys;

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
public class GrimSysApplicationTests {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private AbstrAdmin admin;


    @Test
    public void contextLoads() {
        /*admin.setId("000001");
        admin.setName("王慎瑜");
        admin.setGender("男");
        admin.setBirthday("1998-08-01");
        admin.setFaculties("软件工程");
        admin.setEmploy_time("2016-09-01");
        admin.setProfession_title("教授");
        admin.setTelephone("13755282130");
        admin.setIDcard_type("身份证");
        admin.setIDcard_number("110");
        admin.setPassword(StringHelper.encrypt("123"));*/


        admin.setId("000003");
        admin.setName("何文勇");
        admin.setGender("男");
        admin.setBirthday("1997-01-17");
        admin.setFaculties("软件工程");
        admin.setEmploy_time("2016-09-01");
        admin.setProfession_title("教授");
        admin.setTelephone("13755282130");
        admin.setIDcard_type("身份证");
        admin.setIDcard_number("110");
        admin.setPassword(StringHelper.encrypt("123"));


        admin.setId("000003");
        admin.setName("何文勇");
        admin.setGender("男");
        admin.setBirthday("1997-01-17");
        admin.setFaculties("软件工程");
        admin.setEmploy_time("2016-09-01");
        admin.setProfession_title("教授");
        admin.setTelephone("13755282130");
        admin.setIDcard_type("身份证");
        admin.setIDcard_number("110");
        admin.setPassword(StringHelper.encrypt("123"));

        adminMapper.insertAdmin(admin);


    }

}
