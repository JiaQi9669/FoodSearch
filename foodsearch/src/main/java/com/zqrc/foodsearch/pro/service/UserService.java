package com.zqrc.foodsearch.pro.service;

import com.zqrc.foodsearch.base.BaseDao;
import com.zqrc.foodsearch.entity.User;

/**
 * Created by JiaQi on 2018/4/10.
 */
public interface UserService extends BaseDao<User> {
    /**
     * 通过账号密码查询用户
     * @param userName
     * @param password
     * @return User null
     */
    User findByUNPW(String userName,String password);
}
