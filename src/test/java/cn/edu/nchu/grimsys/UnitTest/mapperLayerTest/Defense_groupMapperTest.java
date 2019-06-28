package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.Defense_groupMapper;
import cn.edu.nchu.grimsys.domain.AbstrDefenseGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Defense_groupMapperTest {
    @Autowired
    private Defense_groupMapper defense_groupMapper;

    @Autowired
    private AbstrDefenseGroup abstrDefenseGroup;
    @Test
    public void  addDefenseGroupTest() {
        abstrDefenseGroup.setId("1");
        abstrDefenseGroup.setLeader_id("3");
        abstrDefenseGroup.setGroup_name("11");
        abstrDefenseGroup.setPeople_num("4");
        abstrDefenseGroup.setBuild_time("2019-06-05 00:00:00");

        defense_groupMapper.addDefenseGroup(abstrDefenseGroup);
    }
    @Test
    public void  updateDefenseGroupTest() {
        abstrDefenseGroup.setId("1");
        abstrDefenseGroup.setLeader_id("4");
        abstrDefenseGroup.setGroup_name("11");
        abstrDefenseGroup.setPeople_num("4");
        abstrDefenseGroup.setBuild_time("2019-06-05 00:00:00");

        defense_groupMapper.updateDefenseGroup(abstrDefenseGroup);
    }
    @Test
    public void  deleteDefenseGroupTest() {
        defense_groupMapper.deleteDefenseGroup("1");
    }
    @Test
    public void  loadDefenseGroupByGroupIdTest() {
        defense_groupMapper.loadDefenseGroupByGroupId("1");
    }
}
