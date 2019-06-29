package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.Admin_tea_operMapper;
import cn.edu.nchu.grimsys.domain.AbstrAdminTeaOper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Admin_tea_operMapperTest {
    @Autowired
    private Admin_tea_operMapper admin_tea_operMapper;

    @Autowired
    private AbstrAdminTeaOper adminTeaOper;

    @Test
    public void  addAdminTeaOperTest() {

        adminTeaOper.setAno("2");
        adminTeaOper.setTno("1");
        adminTeaOper.setOperate_time("2019-6-26 16:44:22");
        adminTeaOper.setOperate_type("删除");

        admin_tea_operMapper.addAdminTeaOper(adminTeaOper);
    }

    @Test
    public void deleteAdminTeaOperTest() {
        admin_tea_operMapper.deleteAdminTeaOper("2","1");
    }
    @Test
    public void  selectAdminTeaOperByAnoTest() {
        admin_tea_operMapper.selectAdminTeaOperByAno("2");
    }
    @Test
    public void  selectAdminTeaOperByGIdTest() {
        admin_tea_operMapper.selectAdminTeaOperByGId("2","1");
    }
}
