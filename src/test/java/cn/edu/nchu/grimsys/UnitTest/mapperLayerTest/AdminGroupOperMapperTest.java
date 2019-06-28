package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.AdminGroupOperMapper;
import cn.edu.nchu.grimsys.domain.AbstrAdminGroupOper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminGroupOperMapperTest {
    @Autowired
    private AdminGroupOperMapper adminGroupOperMapper;

    @Autowired
    private AbstrAdminGroupOper adminGroupOper;

    @Test
    public void  addAdminGroupOperTest() {
        adminGroupOper.setAno("1");
        adminGroupOper.setGroup_no("1");
        adminGroupOper.setOperate_time("2019-06-10 00:00:00");
        adminGroupOper.setOperate_type("添加");

        adminGroupOperMapper.addAdminGroupOper(adminGroupOper);
    }

    @Test
    public void  deleteAdminGroupOperTest() {
        adminGroupOperMapper.deleteAdminGroupOper("1","1");
    }

    @Test
    public void  selectAdminGroupOperByAnoTest() {
        adminGroupOperMapper.selectAdminGroupOperByAno("1");
    }

    @Test
    public void  selectAdminGroupOperByGIdTest() {
        adminGroupOperMapper.selectAdminGroupOperByGId("1","1");
    }
}
