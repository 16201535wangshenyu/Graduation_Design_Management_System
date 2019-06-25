package cn.edu.nchu.grimsys.dao.datasource;

import cn.edu.nchu.grimsys.domain.AbstrStuTaskSubmit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Stu_task_submitMapper {



    /**
     * 添加一条学生-任务提交关系
     * @param stuTaskSubmit
     * @return
     */
    boolean addStuTaskSubmit(@Param("stuTaskSubmit") AbstrStuTaskSubmit stuTaskSubmit);


    /**
     * 删除一条学生-任务提交关系
     * @param sno
     * @param task_no
     * @return
     */
    boolean deleteStuTaskSubmit(@Param("sno") String sno,@Param("task_no") String task_no);


    /**
     * 修改一条学生-任务提交关系
     * @param stuTaskSubmit
     * @return
     */
    boolean updateStuTaskSubmit(@Param("stuTaskSubmit")AbstrStuTaskSubmit stuTaskSubmit);

    /**
     * 查询一条学生-任务提交关系
     * @param sno
     * @param task_no
     * @return
     */
    AbstrStuTaskSubmit selectStuTaskSubmit(@Param("sno") String sno,@Param("task_no") String task_no);
}
