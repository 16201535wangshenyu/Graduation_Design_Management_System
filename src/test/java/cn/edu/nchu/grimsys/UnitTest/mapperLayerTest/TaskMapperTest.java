package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.TaskMapper;
import cn.edu.nchu.grimsys.domain.AbstrTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskMapperTest {
    @Autowired
    private TaskMapper taskMapper;
    @Autowired
    private AbstrTask task;
    @Test
    public void  addTaskTest() {
        task.setTask_no("1000");
        task.setTask_name("中期报告");
        task.setTask_content("大作业中期文档，互评系统");

        taskMapper.addTask(task);
    }
    @Test
    public void  deleteTaskTest() {
        taskMapper.deleteTask("1001");
    }
    @Test
    public void  updateTaskContentTest() {
        task.setTask_no("1001");
        task.setTask_name("中期报告");
        task.setTask_content("大作业中期文档，互评系统");

        taskMapper.updateTaskContent(task);
    }
    @Test
    public void  loadTaskByTaskIdTest() {
        taskMapper.loadTaskByTaskId("1001");
    }
}
