package cn.edu.nchu.grimsys.service;

import cn.edu.nchu.grimsys.domain.AbstrSubject;
import cn.edu.nchu.grimsys.domain.impl.vision1.SubjectImpl;

import java.util.List;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
public interface SubjectService {
    public AbstrSubject loadSubjectBySno(String studentId);

    public boolean WithdrawalSubject(String subjectId);

    public boolean chooseSubject(String subjectId, String studentId);

    public List<SubjectImpl> loadSubjectByTno(String teacherId);

    public List<SubjectImpl> loadSubmittedSubjectByTno(String teacherId);


    public boolean createSubject(SubjectImpl subject);
}
