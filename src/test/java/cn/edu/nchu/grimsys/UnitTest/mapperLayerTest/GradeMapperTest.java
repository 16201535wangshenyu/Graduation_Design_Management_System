package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.GradeMapper;
import cn.edu.nchu.grimsys.domain.AbstrGrade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GradeMapperTest {
    @Autowired
    private GradeMapper gradeMapper;

    @Autowired
    private AbstrGrade grade;

    @Test
    public void  addGradeRecordTest() {
        grade.setId("1");
        grade.setSno("3");
        grade.setFinal_grade("95");
        grade.setGrade_level("优");

        gradeMapper.addGradeRecord(grade);
    }
    @Test
    public void  updateGradeRecordTest() {
        grade.setId("1");
        grade.setSno("3");
        grade.setFinal_grade("93");
        grade.setGrade_level("优");

        gradeMapper.updateGradeRecord(grade);
    }
    @Test
    public void  deleteGradeRecordTest() {
        gradeMapper.deleteGradeRecord("3");
    }
    @Test
    public void  loadGradeByGradeIdTest() {
        gradeMapper.loadGradeByGradeId("1");
    }

}
