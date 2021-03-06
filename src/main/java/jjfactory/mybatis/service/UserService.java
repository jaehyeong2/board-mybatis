package jjfactory.mybatis.service;

import jjfactory.mybatis.model.User;
import jjfactory.mybatis.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void signUp(User user){
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public User signIn(User user){
        return null;
    }
}
