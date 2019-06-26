package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrDefenseGroup;
import org.springframework.stereotype.Component;

@Component
public class DefenseGroupImpl extends AbstrDefenseGroup {


    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getLeader_id() {
        return this.leader_id;
    }

    @Override
    public void setLeader_id(String leader_id) {
        this.leader_id = leader_id;
    }

    @Override
    public String getGroup_name() {
        return this.group_name;
    }

    @Override
    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    @Override
    public String getPeople_num() {
        return this.people_num;
    }

    @Override
    public void setPeople_num(String people_num) {
        this.people_num = people_num;
    }

    @Override
    public String getBuild_time() {
        return this.build_time;
    }

    @Override
    public void setBuild_time(String build_time) {
        this.build_time = build_time;
    }
}
