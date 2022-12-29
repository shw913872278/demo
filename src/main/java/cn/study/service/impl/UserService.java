package cn.study.service.impl;

import cn.study.entity.User;
import cn.study.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public User login(User loginUser) {
        return new User();
    }
}
