package cn.edu.nchu.grimsys.service;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.AbstrTeacher;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Service
public interface TeacherService {
    public boolean validUser(String id, String password);

    public AbstrTeacher loadTeacherInfo(String id);
    public boolean updateTeacher(AbstrTeacher user);

    public List<Teacher> loadAllTeacher();


    public boolean addTeacher(Teacher teacher);

    public boolean deleteTeacherById(String teacherId);
}
