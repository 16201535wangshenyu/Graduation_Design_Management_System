package cn.edu.nchu.grimsys.service;

import org.springframework.stereotype.Service;

public interface AdminService {

    public boolean validUser(String username, String password);
}
