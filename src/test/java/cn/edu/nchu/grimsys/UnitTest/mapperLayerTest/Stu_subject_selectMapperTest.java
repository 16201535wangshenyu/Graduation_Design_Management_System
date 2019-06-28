package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.Stu_subject_selectMapper;
import cn.edu.nchu.grimsys.domain.AbstrStuSubjectSelect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Stu_subject_selectMapperTest
{

    @Autowired
    private Stu_subject_selectMapper stu_subject_selectMapper;

    @Autowired
    private AbstrStuSubjectSelect stuSubjectSelect;

    @Test
    public void  addStuSubjectSelectTest() {
        stuSubjectSelect.setSno("3");
        stuSubjectSelect.setCno("100");
        stuSubjectSelect.setSelect_time("2019-06-10 00:00:00");

        stu_subject_selectMapper.addStuSubjectSelect(stuSubjectSelect);
    }
    @Test
    public void  deleteStuSubjectSelectTest() {
        stu_subject_selectMapper.deleteStuSubjectSelect("3","100");
    }
    @Test
    public void  selectStuSubjectSelectTest() {
        stu_subject_selectMapper.selectStuSubjectSelect("3","100");
    }

}
