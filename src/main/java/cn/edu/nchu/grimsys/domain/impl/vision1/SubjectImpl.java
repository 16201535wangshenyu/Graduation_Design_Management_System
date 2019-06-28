package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrSubject;
import org.springframework.stereotype.Component;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Component
public class SubjectImpl extends AbstrSubject {
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getProfession() {
        return this.profession;
    }

    @Override
    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String getDegree() {
        return this.degree;
    }

    @Override
    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getFile_name() {
        return this.file_name;
    }

    @Override
    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getAdvice() {
        return this.advice;
    }

    @Override
    public void setAdvice(String advice) {
        this.advice = advice;
    }
}
