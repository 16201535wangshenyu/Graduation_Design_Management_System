package cn.edu.nchu.grimsys.service;

import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import org.springframework.stereotype.Service;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
public interface AdminService {

    public boolean validUser(String username, String password);
    public AbstrAdmin loadAdminInfo(String username);

    public boolean updateAdmin(Admin user);
}
