package com.hkd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author WangYuLong
 * @Date 2022/6/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyExam {
    String exam_begin_time;
    String exam_end_time;
    String exam_course;
    Integer total;
}
