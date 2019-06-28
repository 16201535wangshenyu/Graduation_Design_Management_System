package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.Stu_task_submitMapper;
import cn.edu.nchu.grimsys.domain.AbstrStuTaskSubmit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Stu_task_submitMapperTest {
    @Autowired
    private Stu_task_submitMapper stu_task_submitMapper;

    @Autowired
    private AbstrStuTaskSubmit stuTaskSubmit;

    @Test
    public void  addStuTaskSubmitTest() {
        stuTaskSubmit.setSno("3");
        stuTaskSubmit.setTask_no("1000");
        stuTaskSubmit.setStatus("发布");
        stuTaskSubmit.setContent("中期报告");
        stuTaskSubmit.setGrade("85");
        stuTaskSubmit.setRemark("第11组");
        stuTaskSubmit.setSubmit_time("2019-06-19 00:00:00");
        stuTaskSubmit.setIs_submit(false);
        stuTaskSubmit.setIs_scored(false);

        stu_task_submitMapper.addStuTaskSubmit(stuTaskSubmit);
    }
    @Test
    public void  deleteStuTaskSubmitTest() {
        stu_task_submitMapper.deleteStuTaskSubmit("3","1000");
    }
    @Test
    public void  updateStuTaskSubmitTest() {
        stuTaskSubmit.setSno("3");
        stuTaskSubmit.setTask_no("1000");
        stuTaskSubmit.setStatus("发布");
        stuTaskSubmit.setContent("中期报告");
        stuTaskSubmit.setGrade("87");
        stuTaskSubmit.setRemark("第11组");
        stuTaskSubmit.setSubmit_time("2019-06-19 00:00:00");
        stuTaskSubmit.setIs_submit(false);
        stuTaskSubmit.setIs_scored(false);

        stu_task_submitMapper.updateStuTaskSubmit(stuTaskSubmit);
    }
    @Test
    public void  selectStuTaskSubmitTest() {
        stu_task_submitMapper.selectStuTaskSubmit("3","1000");
    }
}
