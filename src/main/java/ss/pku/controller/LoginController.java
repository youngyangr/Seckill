package ss.pku.controller;

import org.slf4j.Logger;
import ss.pku.pojo.LoginParam;
import ss.pku.result.Result;
import ss.pku.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ss.pku.utils.LogUtils;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @program: SeckillProject
 * @description: 登录表现层
 * @author: Mr.Li
 * @create: 2020-05-30 15:00
 **/
@Controller
@RequestMapping("/user")
public class LoginController {
    private Logger logger = LogUtils.getInstance(LoginController.class);
    @Autowired
    UserService userService;

    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/do_login")
    @ResponseBody
    public Result<String> doLogin(@Valid LoginParam loginParam, HttpServletResponse response) {
        System.out.println(loginParam);
        //登录
        String token = userService.login(response,loginParam);
        logger.info("用户登录操作");
        return Result.success(token);
    }
}
