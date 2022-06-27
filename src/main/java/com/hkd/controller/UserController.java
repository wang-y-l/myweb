package com.hkd.controller;

import com.hkd.message.LoginForm;
import com.hkd.service.UserService;
import com.hkd.utils.VerifyCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author WangYuLong
 * @Date 2022/5/16
 */
@RequestMapping("user")
@RestController
@CrossOrigin
public class UserController {
    HttpSession session;
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("generateVerificationCode")
    public void generateVerifyCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //生成验证码的工具类
        String verifyCode = VerifyCodeUtil.generateVerifyCode(4);
        //将字符形式的验证码存入session中
        HttpSession session = request.getSession();
        session.setAttribute("code",verifyCode);
        //设置浏览器接收为图片形式
        response.setContentType("image/png");
        ServletOutputStream os = response.getOutputStream();
        //设置输出的图片的大小，传输流，被打乱的字符串。
        VerifyCodeUtil.outputImage(100,50,os,verifyCode);
    }
    //登录验证功能
    @PostMapping("login")
    public String login(@RequestBody LoginForm loginForm,HttpServletRequest request){
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();
        String verificationCode = loginForm.getCode();
        HttpSession session = request.getSession();
        String status = userService.login(username, password, verificationCode,session);
        //返回登录状态码
        return status;
    }
}
