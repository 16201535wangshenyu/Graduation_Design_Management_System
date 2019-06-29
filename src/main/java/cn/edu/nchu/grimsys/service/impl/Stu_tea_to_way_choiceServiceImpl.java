package cn.edu.nchu.grimsys.service.impl;

import cn.edu.nchu.grimsys.dao.datasource.Stu_tea_both_choiceMapper;
import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.impl.vision1.StuTeaBothChoice;
import cn.edu.nchu.grimsys.service.Stu_tea_to_way_choiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Service
public class Stu_tea_to_way_choiceServiceImpl implements Stu_tea_to_way_choiceService {
    @Autowired
    Stu_tea_both_choiceMapper stu_tea_both_choiceMapper;
    @Autowired
    StuTeaBothChoice  stuTeaBothChoice;

    /**
     * 学生选择教师
     * @param student
     * @param teacherId
     * @return
     */

    @Override
    public boolean selectTeacher(AbstrStudent student, String teacherId) {
        stuTeaBothChoice.setSno(student.getId()+"");
        stuTeaBothChoice.setTno(teacherId);

        return  stu_tea_both_choiceMapper.addStuTeaBothChoice(stuTeaBothChoice);
    }

    /**
     * 教师选择学生
     * @param studentId
     * @param id
     * @return
     */
    @Override
    public boolean selecStudent(String studentId, String id) {

        return stu_tea_both_choiceMapper.updateIsRecieve(studentId,id);
    }
}
