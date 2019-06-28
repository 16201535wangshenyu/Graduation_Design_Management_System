package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.Group_stu_defenseMapper;
import cn.edu.nchu.grimsys.domain.AbstrGroupStuDefense;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Group_stu_defenseMapperTest
{
    @Autowired
    private Group_stu_defenseMapper group_stu_defenseMapper;

    @Autowired
    private AbstrGroupStuDefense groupStuDefense;

    @Test
    public void  addGroupStuDefenseTest() {
        groupStuDefense.setSno("3");
        groupStuDefense.setGroup_id("1");
        groupStuDefense.setRes_grade("93");

        group_stu_defenseMapper.addGroupStuDefense(groupStuDefense);
    }
    @Test
    public void  deleteGroupStuDefenseTest() {
        group_stu_defenseMapper.deleteGroupStuDefense("3");
    }
    @Test
    public void  updateGroupStuDefenseTest() {
        groupStuDefense.setSno("3");
        groupStuDefense.setGroup_id("1");
        groupStuDefense.setRes_grade("95");

        group_stu_defenseMapper.updateGroupStuDefense(groupStuDefense);
    }
    @Test
    public void  selectGroupStuDefenseByGIdTest() {
        group_stu_defenseMapper.selectGroupStuDefenseByGId("10");
    }
    @Test
    public void  selectGroupStuDefenseByTnoTest() {
        group_stu_defenseMapper.selectGroupStuDefenseByTno("3");
    }
}
