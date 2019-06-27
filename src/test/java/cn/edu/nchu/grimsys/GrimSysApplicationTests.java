package cn.edu.nchu.grimsys;

import cn.edu.nchu.grimsys.dao.datasource.AdminMapper;
import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *   162015班  第11组
 *   毕设信息管理系统--模块
 *   @author：
 *   date：2019-6-
 *   主要功能说明：
 */
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
