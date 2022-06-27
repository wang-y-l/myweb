package com.hkd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author WangYuLong
 * @Date 2022/6/15
 * 封装我的课程所有的字段
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyCourse {
    //课程名
    String course_name;
    //教师姓名
    String teacher_name;
    //班级总人数
    int course_headcount;
}
