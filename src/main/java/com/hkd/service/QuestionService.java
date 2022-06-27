package com.hkd.service;

import com.hkd.entity.ChoiceQuestion;
import com.hkd.message.QuestionConditions;

import java.util.List;

/**
 * @Author WangYuLong
 * @Date 2022/6/21
 */
public interface QuestionService {
    //查询给定条件的选择题
    List<ChoiceQuestion> serachChoiceQuestion(QuestionConditions conditions);
}
