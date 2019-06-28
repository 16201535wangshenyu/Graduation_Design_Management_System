package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.Tea_task_createMapper;
import cn.edu.nchu.grimsys.domain.AbstrTeaTaskCreate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tea_task_createMapperTest {
    @Autowired
    private Tea_task_createMapper tea_task_createMapper;

    @Autowired
    private AbstrTeaTaskCreate teaTaskCreate;

    @Test
    public void  addTeaTaskCreateTest() {
        teaTaskCreate.setTno("1");
        teaTaskCreate.setTask_no("1000");
        teaTaskCreate.setCreate_time("2019-06-1 00:00:00");
        teaTaskCreate.setStart_time("2019-06-5 00:00:00");
        teaTaskCreate.setEnd_time("2019-06-20 00:00:00");

        tea_task_createMapper.addTeaTaskCreate(teaTaskCreate);
    }
    @Test
    public void  deleteTeaTaskCreateTest() {
        tea_task_createMapper.deleteTeaTaskCreate("1","1000");
    }
    @Test
    public void  updateTeaTaskCreateTest() {
        teaTaskCreate.setTno("1");
        teaTaskCreate.setTask_no("1000");
        teaTaskCreate.setCreate_time("2019-06-1 00:00:00");
        teaTaskCreate.setStart_time("2019-06-5 00:00:00");
        teaTaskCreate.setEnd_time("2019-06-25 00:00:00");

        tea_task_createMapper.updateTeaTaskCreate(teaTaskCreate);
    }
    @Test
    public void  selectTeaTaskCreateTest() {
        tea_task_createMapper.selectTeaTaskCreate("1","1000");
    }
}
