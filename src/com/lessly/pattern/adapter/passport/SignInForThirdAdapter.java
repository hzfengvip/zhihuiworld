package com.lessly.pattern.adapter.passport;


/**
 * 新添加三方适配器，用于转换、兼容
 */
public class SignInForThirdAdapter {


    protected SigninService signinService;

    public SignInForThirdAdapter(SigninService signinService){
        this.signinService = signinService;
    }

    public void signInForQQ(String openId){
        System.out.println("通过三方平台QQ操作");
        signinService.regist(openId, null);
        signinService.login(openId, null);
    }


    public void signInForWeChat(String unionId){
        System.out.println("通过三方平台微信操作");
        signinService.regist(unionId, null);
        signinService.login(unionId, null);
    }


    public void signInForTelPhone(String telPhone){
        System.out.println("通过手机号操作");
        signinService.regist(telPhone, null);
        signinService.login(telPhone, null);
    }


}
