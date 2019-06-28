package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.Admin_stu_operMapper;
import cn.edu.nchu.grimsys.domain.AbstrAdminStuOper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Admin_stu_operMapperTest {

    @Autowired
    private  Admin_stu_operMapper admin_stu_operMapper;

    @Autowired
    private AbstrAdminStuOper adminStuOper;

    @Test
    public void addAdminStuOperTest() {
        adminStuOper.setAno("2");
        adminStuOper.setSno("3");
        adminStuOper.setOperate_time("2019-6-26 16:44:22");
        adminStuOper.setOperate_type("删除");

        admin_stu_operMapper.addAdminStuOper(adminStuOper);
    }

    @Test
    public void deleteAdminStuOperTest() {
        admin_stu_operMapper.deleteAdminStuOper("2","3");
    }

    @Test
    public void  selectAdminStuOperByAnoTest() {
        admin_stu_operMapper.selectAdminStuOperByAno("2");
    }

    @Test
    public void  selectAdminStuOperByGIdTest() {
        admin_stu_operMapper.selectAdminStuOperByGId("2","3");
    }
}
