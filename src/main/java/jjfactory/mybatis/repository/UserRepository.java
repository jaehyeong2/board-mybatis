package jjfactory.mybatis.repository;

import jjfactory.mybatis.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    void save(User user);
    User login(User user);
}
