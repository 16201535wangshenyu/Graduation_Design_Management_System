package cn.edu.nchu.grimsys.service.impl;

import cn.edu.nchu.grimsys.dao.datasource.Stu_subject_selectMapper;
import cn.edu.nchu.grimsys.dao.datasource.SubjectMapper;
import cn.edu.nchu.grimsys.domain.AbstrSubject;
import cn.edu.nchu.grimsys.domain.impl.vision1.StuSubjectSelectImpl;
import cn.edu.nchu.grimsys.domain.impl.vision1.SubjectImpl;
import cn.edu.nchu.grimsys.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectMapper mapper;
    @Autowired
    Stu_subject_selectMapper stu_subject_selectMapper;
    @Autowired
    StuSubjectSelectImpl stuSubjectSelect;
    /**
     * 记载课题通过学号
     * @param studentId
     * @return
     */
    @Override
    public AbstrSubject loadSubjectBySno(String studentId) {
        return mapper.selectSubjectBySno(studentId);
    }

    /**
     * 学生退选课题
     * @param subjectId
     * @return
     */
    @Override
    public boolean WithdrawalSubject(String subjectId) {
        return mapper.deleteSubject(subjectId);
    }

    /**
     * 学生选择课题
     *
     * @param studentId
     * @param subjectId
     * @return
     */
    @Override
    public boolean chooseSubject(String subjectId, String studentId) {
        stuSubjectSelect.setCno(subjectId);
        stuSubjectSelect.setSno(studentId);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currenttime=df.format(new Date());
        stuSubjectSelect.setSelect_time(currenttime);

        return stu_subject_selectMapper.addStuSubjectSelect(stuSubjectSelect);
    }

    /**
     * 教师查看自己创建的课题
     * @param teacherId
     * @return
     */
    @Override
    public List<SubjectImpl> loadSubjectByTno(String teacherId) {

        return mapper.loadSubjectByTno(teacherId);
    }

    /**
     * 教师查看自己已发布的课题
     * @param teacherId
     * @return
     */
    @Override
    public List<SubjectImpl> loadSubmittedSubjectByTno(String teacherId){
        return mapper.loadSubmittedSubjectByTno(teacherId);
    }

    /**
     * 教师创建课题
     * @param subject
     * @return
     */
    @Override
    public boolean createSubject(SubjectImpl subject) {
        return mapper.addSubject(subject);
    }
}
