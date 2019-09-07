package com.lessly.pattern.decorator.upgrade;

/**
 * 登录、注册接口
 */
public interface ISigninService {

    public void regist(String userName, String password);

    public void login(String userName, String password);
}
