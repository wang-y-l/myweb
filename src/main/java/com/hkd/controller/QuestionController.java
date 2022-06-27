package com.hkd.controller;

import com.hkd.entity.ChoiceQuestion;
import com.hkd.message.LoginForm;
import com.hkd.message.QuestionConditions;
import com.hkd.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author WangYuLong
 * @Date 2022/6/21
 */
@RequestMapping("question")
@RestController
@CrossOrigin
public class QuestionController {

    private QuestionService questionService;
    public QuestionController(QuestionService questionService) {this.questionService = questionService;}
//    处理选择题请求
    @PostMapping("singleChoice")
    public List<ChoiceQuestion> searchChoiceQuestion(@RequestBody QuestionConditions conditions){
        System.out.println(conditions);
        return questionService.serachChoiceQuestion(conditions);
    }


}
