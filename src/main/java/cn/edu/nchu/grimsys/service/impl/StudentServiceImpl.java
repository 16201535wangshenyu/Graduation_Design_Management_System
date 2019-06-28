package cn.edu.nchu.grimsys.service.impl;

import cn.edu.nchu.grimsys.dao.datasource.StudentMapper;
import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import cn.edu.nchu.grimsys.service.StudentService;
import cn.edu.nchu.grimsys.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
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
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    /**
     * 校验用户登录
     * @param id
     * @param password
     * @return
     */

    public boolean validUser(String id, String password){
        AbstrStudent student=studentMapper.selectStudentById(id);
        if(student==null)
            return false;
        else
        if(StringHelper.encrypt(password).equals(student.getPassword()))
            return true;
        else
            return false;

    }

    /**
     * 根据管理员工号加载管理员
     * @param username
     * @return
     */
    public AbstrStudent loadAdminInfo(String username){
        AbstrStudent student=studentMapper.selectStudentById(username);
        return  student;
    }

    /**
     * 实现学生信息的修改
     * @param user
     * @return
     */
    @Override
    public boolean updateStudent(AbstrStudent user) {
        return studentMapper.updateStudent(user);
    }

    /**
     * 增加学生信息
     * @param student
     * @return
     */
    @Override
    public boolean addStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    /**
     * 加载所有的学生
     * @return
     */
    @Override
    public List<Student> loadAllStudent() {
        return studentMapper.selectAllStudent();
    }

    /**
     * 删除学生根据学生ID
     * @param studentId
     * @return
     */
    @Override
    public boolean deleteStudentById(String studentId) {
        return studentMapper.deleteStudent(studentId);
    }
}
