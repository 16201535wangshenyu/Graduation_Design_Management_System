package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.SubjectMapper;
import cn.edu.nchu.grimsys.domain.AbstrSubject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectMapperTest
{
    @Autowired
    private  SubjectMapper  subjectMapper;

    @Autowired
    private AbstrSubject subject;

    @Test
    public void  addSubjectTest() {
        subject.setId("100");
        subject.setName("毕设信息管理系统");
        subject.setProfession("软件工程");
        subject.setDegree("一般");
        subject.setContent("1)师生信息管理：学生信息管理，教师信息管理，答辩小组管理。\n" +
                "2)课题申报：老师申报课题。\n" +
                "3)师生双选：可通过自动或双选模式为学生分配指导老师。\n" +
                "4)过程管理：学生签到，提交各类毕设文档，定期讨论，定期检查。\n" +
                "5)答辩评分：答辩安排，答辩记录，答辩小组评分。");
        subject.setFile_name("课题作业要求");
        subject.setStatus("发布");
        subject.setAdvice("无");

        subjectMapper.addSubject(subject);
    }
    @Test
    public void  deleteSubjectTest() {
        subjectMapper.deleteSubject("100");
    }
    @Test
    public void  updateSubjectTest() {
        subject.setId("101");
        subject.setName("毕设信息管理系统");
        subject.setProfession("软件工程");
        subject.setDegree("一般");
        subject.setContent("1)师生信息管理：学生信息管理，教师信息管理，答辩小组管理。\n" +
                "2)课题申报：老师申报课题。\n" +
                "3)师生双选：可通过自动或双选模式为学生分配指导老师。\n" +
                "4)过程管理：学生签到，提交各类毕设文档，定期讨论，定期检查。\n" +
                "5)答辩评分：答辩安排，答辩记录，答辩小组评分。");
        subject.setFile_name("课题作业要求");
        subject.setStatus("发布");
        subject.setAdvice("无");

        subjectMapper.updateSubject(subject);
    }
    @Test
    public void  loadSubjectBySubjectTest() {
        subjectMapper.loadSubjectBySubject("101");
    }
}
