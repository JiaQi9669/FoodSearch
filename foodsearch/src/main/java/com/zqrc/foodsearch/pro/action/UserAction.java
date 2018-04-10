package com.zqrc.foodsearch.pro.action;

import com.zqrc.foodsearch.base.BaseAction;
import com.zqrc.foodsearch.entity.User;
import com.zqrc.foodsearch.pro.service.UserService;

/**
 * Created by JiaQi on 2018/4/10.
 */
public class UserAction extends BaseAction<User> {

    /**
     * 登陆界面
     */
    public String toLogin(){
        User user = new User();
        user.setPassword("mima");
        userService.save(user);
        return "toLogin";
    }
}
