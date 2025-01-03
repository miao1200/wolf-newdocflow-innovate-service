package com.ndocflow.wolf.innocation.common.auth.exception;

import com.ndocflow.wolf.innocation.common.base.exception.ServiceException;

/**
 * 认证异常
 *
 * @author Li Jinhui
 * @since 2018/12/7
 */
public class AuthException extends ServiceException {
    public AuthException() {
        super("Authentication failed", 403);
    }
}
