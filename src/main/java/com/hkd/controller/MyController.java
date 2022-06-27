package com.hkd.controller;

import com.hkd.entity.MyCourse;
import com.hkd.entity.MyExam;
import com.hkd.entity.MyHomework;
import com.hkd.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.logging.Logger;

/**
 * @Author WangYuLong
 * @Date 2022/6/15
 * 处理我的板块里面的一些业务
 */
@RequestMapping("my")
@RestController
@CrossOrigin
public class MyController {

    private MyService myService;
    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @RequestMapping("searchAllCourse")
    public List<MyCourse>  searchAllCourse(@RequestParam String username){
        return myService.searchAllMyCourse(username);
    }

    @RequestMapping("searchAllExam")
    public List<MyExam>  searchAllExam(@RequestParam String username){
        return myService.searchAllMyExam(username);
    }

    @RequestMapping("searchAllHomework")
    public List<MyHomework>  searchAllHomework(@RequestParam String username){
        return myService.searchAllMyHomework(username);
    }
}
