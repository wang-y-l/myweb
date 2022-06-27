package com.hkd.service;

import com.hkd.dao.MyDao;
import com.hkd.entity.MyCourse;
import com.hkd.entity.MyExam;
import com.hkd.entity.MyHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WangYuLong
 * @Date 2022/6/15
 */
@Service
public class MyServiceImpl implements MyService{

    private MyDao myDao;
    @Autowired
    public MyServiceImpl(MyDao myDao) {
        this.myDao=myDao;
    }

    @Override
    public List<MyCourse> searchAllMyCourse(String username) {
        return myDao.searchAllMyCourse(username);
    }

    @Override
    public List<MyExam> searchAllMyExam(String username) {
        return myDao.searchAllMyExam(username);
    }

    @Override
    public List<MyHomework> searchAllMyHomework(String username) {
        return myDao.searchAllMyHomework(username);
    }
}
