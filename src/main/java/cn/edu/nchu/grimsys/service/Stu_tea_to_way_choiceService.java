package cn.edu.nchu.grimsys.service;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import org.springframework.stereotype.Service;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
public interface Stu_tea_to_way_choiceService {
    public boolean selectTeacher(AbstrStudent student, String teacherId);

    public boolean selecStudent(String studentId, String id);
}
