package com.hkd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author WangYuLong
 * @Date 2022/6/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyHomework {
    String course_name;
    String dead_line;
    Integer totalNumber;
}
