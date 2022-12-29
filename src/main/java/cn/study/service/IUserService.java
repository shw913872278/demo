package cn.study.service;

import cn.study.entity.User;

public interface IUserService {
    /**
     * 传入登录的账号密码，用于登录
     * @param loginUser 封装了username和password的user作为登录使用
     * @return 登录的账号信息
     */
    User login(User loginUser);
}
