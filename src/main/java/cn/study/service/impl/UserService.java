package cn.study.service.impl;

import cn.study.entity.User;
import cn.study.service.IUserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    private final Gson gson;
    public UserService(@Qualifier("gson") Gson gson) {
        this.gson = gson;
    }

    @Override
    public User login(User loginUser) {
        return new User();
    }

    @Override
    public String userInfo(String username) {
        return gson.toJson(new User());
    }
}
