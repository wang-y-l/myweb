package com.hkd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author WangYuLong
 * @Date 2022/5/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String account;
    private String password;
}
