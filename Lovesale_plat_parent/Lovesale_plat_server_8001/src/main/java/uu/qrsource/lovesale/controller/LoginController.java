package uu.qrsource.lovesale.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uu.qrsource.lovesale.domain.User;
import uu.qrsource.lovesale.util.AjaxResult;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if ("admin".equals(user.getName())&&"0".equals(user.getPassword())){
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码不正确!");
    }
}
