package com.hkd.service;


import com.hkd.dao.UserDao;
import com.hkd.entity.User;
import com.hkd.service.UserService;
import com.hkd.utils.VerifyCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * @Author WangYuLong
 * @Date 2022/5/16
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    /**
     * 处理dao层的查询结果
     * 只查账号，如果返回值为空，则该用户不存在，
     * 如果存在则再验证一下密码，如果正确则返回登陆成功,
     * 否则密码错误，再验证一下验证码是否登陆成功，错误返回3
     */
    @Override
    public String login(String account, String password,String VerifyCode,HttpSession session) {
        User user = userDao.login(account,password);
        String code = session.getAttribute("code").toString();
        if (user == null){
            return "1";
        } else if (!user.getPassword().equals(password)){
            return "2";
        } else if (!VerifyCode.equalsIgnoreCase(code)){
            return "3";
        }
        return "4";
    }
}
