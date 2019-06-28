package cn.edu.nchu.grimsys.service.impl;

import cn.edu.nchu.grimsys.dao.datasource.AdminMapper;
import cn.edu.nchu.grimsys.dao.datasource.TeacherMapper;
import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.AbstrTeacher;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import cn.edu.nchu.grimsys.service.TeacherService;
import cn.edu.nchu.grimsys.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * 校验用户登录
     * @param id
     * @param password
     * @return
     */
    @Override
    public boolean validUser(String id, String password) {
        AbstrTeacher teacher=teacherMapper.selectTeacherById(id);
        if(teacher==null)
            return false;
        else
        if(StringHelper.encrypt(password).equals(teacher.getPassword()))
            return true;
        else
            return false;

    }

    /**
     * 根据教师工号加载教师
     * @param id
     * @return
     */
    @Override
    public AbstrTeacher loadTeacherInfo(String id) {
        return teacherMapper.selectTeacherById(id);
    }

    /**
     * 更新教师的信息
     * @param user
     * @return
     */
    @Override
    public boolean updateTeacher(AbstrTeacher user) {
        return teacherMapper.updateTeacher(user);
    }

    /**
     * 加载所有的教师信息
     * @return
     */
    public List<Teacher> loadAllTeacher(){
        return teacherMapper.selectAllTeacher();
    }

    @Override
    public boolean addTeacher(Teacher teacher) {
        return teacherMapper.insertTeacher(teacher);
    }

    @Override
    public boolean deleteTeacherById(String teacherId) {
        return teacherMapper.deleteTeacher(teacherId);
    }
}
