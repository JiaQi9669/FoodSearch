package com.zqrc.foodsearch.pro.service;

import com.zqrc.foodsearch.base.BaseDaoImpl;
import com.zqrc.foodsearch.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by JiaQi on 2018/4/10.
 */
@Service
@Transactional
public class UserServiceImpl extends BaseDaoImpl<User> implements UserService {

    /**
     * 通过账号密码查询用户
     * @param userName
     * @param password
     * @return User null
     */
    public User findByUNPW(String userName, String password) {
        String hql ="from User where userName = ? and password = ?";
        return (User) getSession().createQuery(hql).setString(0,userName).setString(1,password).uniqueResult();
    }
}
