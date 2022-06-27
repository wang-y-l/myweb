package com.hkd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author WangYuLong
 * @Date 2022/5/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    int id;
    String student_number;
    String name;
    int sex;
    int departments;
}
