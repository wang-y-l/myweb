package com.hkd.service;

import com.hkd.dao.MyDao;
import com.hkd.dao.QuestionDao;
import com.hkd.entity.ChoiceQuestion;
import com.hkd.message.QuestionConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WangYuLong
 * @Date 2022/6/21
 */
@Service
public class QusetionServiceImpl implements QuestionService {
    private QuestionDao questionDao;
    @Autowired
    public QusetionServiceImpl(QuestionDao questionDao) {
        this.questionDao=questionDao;
    }
    @Override
    public List<ChoiceQuestion> serachChoiceQuestion(QuestionConditions conditions) {
        return questionDao.serachChoiceQuestion(conditions);
    }
}
