package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * @author yycli
 */
public interface IUserService {
    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    ServerResponse<User> login(String username, String password);


    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    ServerResponse<String> register(User user);

    /**
     * 验证用户
     * @param str
     * @param type
     * @return
     */
    default ServerResponse<String> checkValid(String str, String type) {
        return null;
    }
}
