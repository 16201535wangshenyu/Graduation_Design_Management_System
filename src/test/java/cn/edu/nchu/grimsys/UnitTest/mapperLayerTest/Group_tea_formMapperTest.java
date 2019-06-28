package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.Group_tea_formMapper;
import cn.edu.nchu.grimsys.domain.AbstrGroupTeaForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Group_tea_formMapperTest {

    @Autowired
    private Group_tea_formMapper group_tea_formMapper;

    @Autowired
    private AbstrGroupTeaForm groupTeaForm;

    @Test
    public void  addGroupTeaFormTest() {
        groupTeaForm.setGroup_id("1");
        groupTeaForm.setTno("1");

        group_tea_formMapper.addGroupTeaForm(groupTeaForm);
    }
    @Test
    public void  deleteOneTeaInGroupTest() {
        group_tea_formMapper.deleteOneTeaInGroup("1");
    }
    @Test
    public void  updateGroupTeaFormTest() {
        groupTeaForm.setGroup_id("2");
        groupTeaForm.setTno("1");

        group_tea_formMapper.updateGroupTeaForm(groupTeaForm);
    }
    @Test
    public void  selectGroupTeaFormByGIdTest() {
        group_tea_formMapper.selectGroupTeaFormByGId("10");
    }
    @Test
    public void  selectGroupTeaFormByTnoTest() {
        group_tea_formMapper.selectGroupTeaFormByTno("1");
    }

}
