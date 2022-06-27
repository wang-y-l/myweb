package com.hkd.dao;

import com.hkd.entity.MyCourse;
import com.hkd.entity.MyExam;
import com.hkd.entity.MyHomework;

import java.util.List;

/**
 * @Author WangYuLong
 * @Date 2022/6/15
 */
public interface MyDao {
    /**
     * 查询用户的所有的课程信息，并返回
     * @param username
     * @return
     */
    List<MyCourse> searchAllMyCourse(String username);

    /**
     * 查询该用户的所有考试
     * @param username
     * @return
     */
    List<MyExam> searchAllMyExam(String username);

    /**
     * 查询该用户的所有作业
     * @param username
     * @return
     */
    List<MyHomework> searchAllMyHomework(String username);
}
