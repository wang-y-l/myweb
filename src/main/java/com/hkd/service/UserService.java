package com.hkd.service;

import com.hkd.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface UserService {
    String login(String account, String password, String VerifyCode,HttpSession session);

}
