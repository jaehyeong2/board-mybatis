package jjfactory.mybatis.repository;

import jjfactory.mybatis.model.User;

public interface UserRepository {
    void save(User user);
    User login(User user);
}
