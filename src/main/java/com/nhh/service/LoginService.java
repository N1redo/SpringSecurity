package com.nhh.service;

import com.nhh.domain.ResponseResult;
import com.nhh.domain.User;

/**
 * @Description 登录接口
 * @Author nhh
 * @Date 2025/9/18 17:54
 */
public interface LoginService {

    // 登录接口
    ResponseResult login(User user);
}
