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
    private IUserService userService;

    public IndexController(@Qualifier("userService") IUserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/", "/index"})
    public String index() {
        final User login = userService.login(new User());
        return "";
    }

    @PostMapping("/getUserInfo/{username}")
    public String getUserInfo(@PathVariable String username) {
        return userService.userInfo(username);
    }
}
