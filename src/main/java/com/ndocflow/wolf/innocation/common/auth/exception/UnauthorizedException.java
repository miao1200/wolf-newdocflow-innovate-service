package com.ndocflow.wolf.innocation.common.auth.exception;

import com.ndocflow.wolf.innocation.common.base.exception.ServiceException;

/**
 * 未认证异常
 *
 * @author Li Jinhui
 * @since 2018/12/7
 */
public class UnauthorizedException extends ServiceException {
    public UnauthorizedException() {
        super("Unauthorized", 401);
    }
}
