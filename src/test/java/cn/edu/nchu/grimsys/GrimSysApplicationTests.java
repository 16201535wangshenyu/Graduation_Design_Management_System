package cn.edu.nchu.grimsys;

import cn.edu.nchu.grimsys.dao.datasource.AdminMapper;
import cn.edu.nchu.grimsys.domain.AbstrAdmin;
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


        adminMapper.insertAdmin(admin);


    }

}
