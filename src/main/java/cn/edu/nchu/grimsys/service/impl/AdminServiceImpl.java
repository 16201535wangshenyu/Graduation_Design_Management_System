package cn.edu.nchu.grimsys.service.impl;

import cn.edu.nchu.grimsys.dao.datasource.AdminMapper;
import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.service.AdminService;
import cn.edu.nchu.grimsys.util.StringHelper;
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
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    /**
     * 校验用户登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean validUser(String username, String password) {
        AbstrAdmin admin=adminMapper.selectAdminByid("username");
        if(admin==null)
            return false;
        else
            if(StringHelper.encrypt(password).equals(admin.getPassword()))
                return true;
            else
                return false;

    }

    /**
     * 根据管理员工号加载管理员
     * @param username
     * @return
     */
    public AbstrAdmin loadAdminInfo(String username){
        AbstrAdmin admin=adminMapper.selectAdminByid("username");
        return  admin;
    }

    /**
     * 更新管理员的个人信息
     * @param user
     * @return
     */

    public boolean updateAdmin(Admin user){
        return  adminMapper.updateAdmin(user);
    }

}
