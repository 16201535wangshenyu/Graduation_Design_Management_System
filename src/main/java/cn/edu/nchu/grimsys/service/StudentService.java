package cn.edu.nchu.grimsys.service;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
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
public interface StudentService {
    public boolean validUser(String id, String password);

    public AbstrStudent loadAdminInfo(String username);
    public boolean updateStudent(AbstrStudent user);

    public boolean addStudent(Student student);

    public List<Student> loadAllStudent();

    public boolean deleteStudentById(String teacherId);
}
