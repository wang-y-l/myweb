package com.hkd.entity;

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
public class ChoiceQuestion {
    String body;
    String A;
    String B;
    String C;
    String D;
    String answer;
}
