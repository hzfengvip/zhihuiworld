package com.lessly.pattern.decorator.upgrade;

/**
 * 包装器
 */
public class SignInForThirdService implements ISignInForThirdService{

    private ISigninService service;
    public SignInForThirdService(ISigninService service){
        this.service = service;
    }



    @Override
    public void signInForQQ(String openId) {
        System.out.println("通过三方平台QQ注册、登录");
        regist(openId, null);
        login(openId, null);
    }

    @Override
    public void signInForWeChat(String unionId) {
        System.out.println("通过三方平台微信注册、登录");
        regist(unionId, null);
        login(unionId, null);
    }

    @Override
    public void signInForTelPhone(String telPhone) {
        System.out.println("通过手机号注册、登录");
        regist(telPhone, null);
        login(telPhone, null);
    }

    @Override
    public void regist(String userName, String password) {
        service.regist(userName,password);
    }

    @Override
    public void login(String userName, String password) {
        service.login(userName,password);
    }
}
