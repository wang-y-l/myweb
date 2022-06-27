package com.hkd.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author WangYuLong
 * @Date 2022/6/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionConditions {
    String courseName;//课程名
    Integer startChapter;//开始章节
    Integer endChapter;//结束章节
    Integer difficultDegree;//难度系数
    String total;//试题总数量
}
