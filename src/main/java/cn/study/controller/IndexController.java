package cn.study.controller;

import cn.study.entity.User;
import cn.study.service.IUserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;

@Controller
public class IndexController {
    private final IUserService userService;

    public IndexController(@Qualifier("userService") IUserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/", "/index"})
    public String index(HttpSession session) {
        final User login = userService.login(new User());
        if (Objects.nonNull(login)) {
            session.setAttribute("loginInfo", login);
        }
        System.out.println("当前登录信息为：login = " + login);
        System.out.println("冲突合并之hot-fix。");
        return "";
    }

    @PostMapping("/getUserInfo/{username}")
    public String getUserInfo(@PathVariable String username) {
        System.out.println("体验一下版本穿梭！！！");
        return userService.userInfo(username);
    }
}
