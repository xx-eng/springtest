package com.syzc.repository;

import com.syzc.entity.User;

import java.util.List;

/**
 * @author xueli
 * @email 2632624281@qq.com
 * @date 2022-04-04 09:59
 * @description
 */
public interface UserRepository {
    public List<User> findAll();
    public User findById(long id);
    public void save(User user);
    public void update(User user);
    public void deleteById(long id);
}
