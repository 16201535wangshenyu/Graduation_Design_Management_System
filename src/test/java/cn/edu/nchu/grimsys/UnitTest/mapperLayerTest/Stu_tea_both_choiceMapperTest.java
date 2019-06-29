package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.Stu_tea_both_choiceMapper;
import cn.edu.nchu.grimsys.domain.AbstrStuTeaBothChoice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Stu_tea_both_choiceMapperTest {
    @Autowired
    private Stu_tea_both_choiceMapper stu_tea_both_choiceMapper;

    @Autowired
    private AbstrStuTeaBothChoice stuTeaBothChoice;

    @Test
    public void  updateStuTeaBothChoiceTest() {
        stuTeaBothChoice.setTno("1");
        stuTeaBothChoice.setSno("4");
        stuTeaBothChoice.setIs_receive("1");

        stu_tea_both_choiceMapper.updateStuTeaBothChoice(stuTeaBothChoice);
    }
    @Test
    public void  deleteStuTeaBothChoiceTest() {
        stuTeaBothChoice.setTno("1");
        stuTeaBothChoice.setSno("4");
        stuTeaBothChoice.setIs_receive("0");

        stu_tea_both_choiceMapper.deleteStuTeaBothChoice(stuTeaBothChoice);
    }
    @Test
    public void  addStuTeaBothChoiceTest() {
        stuTeaBothChoice.setTno("1");
        stuTeaBothChoice.setSno("3");
        stuTeaBothChoice.setIs_receive("1");

        stu_tea_both_choiceMapper.addStuTeaBothChoice(stuTeaBothChoice);
    }
    @Test
    public void  selectStuTeaBothChoiceBySnoTest() {
        stu_tea_both_choiceMapper.selectStuTeaBothChoiceBySno("3");
    }
    @Test
    public void  selectStuTeaBothChoiceByTnoTest() {
        stu_tea_both_choiceMapper.selectStuTeaBothChoiceByTno("1");
    }
}
