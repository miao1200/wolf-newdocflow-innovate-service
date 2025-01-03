package com.ndocflow.wolf.innocation.business.exception;

import com.ndocflow.wolf.innocation.common.base.exception.ServiceException;

public class UserNotFoundException extends ServiceException {
    public UserNotFoundException() {
        super(10404, "用户不存在");
    }
}