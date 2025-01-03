package com.ndocflow.wolf.innocation.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ndocflow.wolf.innocation.business.data.SignInData;
import com.ndocflow.wolf.innocation.business.data.SignUpData;
import com.ndocflow.wolf.innocation.business.entity.User;
import com.ndocflow.wolf.innocation.business.view.SignInView;

public interface UserService extends IService<User> {
    SignInView signIn(SignInData data);
    void signUp(SignUpData data);
}
