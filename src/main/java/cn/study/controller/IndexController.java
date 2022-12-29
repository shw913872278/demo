package cn.study.controller;

import cn.study.service.IUserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private IUserService userService;

    public IndexController(@Qualifier("userService") IUserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/", "/index"})
    public String index() {
        return "";
    }
}
