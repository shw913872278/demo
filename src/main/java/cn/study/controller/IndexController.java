package cn.study.controller;

import cn.study.entity.User;
import cn.study.service.IUserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    private final IUserService userService;

    public IndexController(@Qualifier("userService") IUserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/", "/index"})
    public String index() {
        final User login = userService.login(new User());
        System.out.println("当前登录信息为：login = " + login);
        return "";
    }

    @PostMapping("/getUserInfo/{username}")
    public String getUserInfo(@PathVariable String username) {
        System.out.println("体验一下版本穿梭！！！");
        return userService.userInfo(username);
    }
}
