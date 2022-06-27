package com.hkd.dao;
import com.hkd.entity.User;
public interface UserDao {
      User login(String account,String password);
}
