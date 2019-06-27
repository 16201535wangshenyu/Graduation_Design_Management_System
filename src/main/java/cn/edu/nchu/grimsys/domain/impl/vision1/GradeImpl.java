package cn.edu.nchu.grimsys.domain.impl.vision1;

import cn.edu.nchu.grimsys.domain.AbstrGrade;
import org.springframework.stereotype.Component;

@Component
public class GradeImpl extends AbstrGrade {
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getSno() {
        return this.sno;
    }

    @Override
    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public String getFinal_grade() {
        return this.final_grade;
    }

    @Override
    public void setFinal_grade(String final_grade) {
        this.final_grade = final_grade;
    }

    @Override
    public String getGrade_level() {
        return this.grade_level;
    }

    @Override
    public void setGrade_level(String grade_level) {
        this.grade_level = grade_level;
    }
}
