package com.ndocflow.wolf.innocation.business.exception;

import com.ndocflow.wolf.innocation.common.base.exception.ServiceException;

public class PasswordErrorException extends ServiceException {
    public PasswordErrorException() {
        super(10400, "密码错误");
    }
}