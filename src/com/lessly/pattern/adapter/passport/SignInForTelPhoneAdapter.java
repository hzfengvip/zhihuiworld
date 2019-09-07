package com.lessly.pattern.adapter.passport;


/**
 * 手机号登录注册
 */
public class SignInForTelPhoneAdapter extends SignInForThirdAdapter{

    public SignInForTelPhoneAdapter(SigninService signinService) {
        super(signinService);
    }

    @Override
    public void signInForTelPhone(String telPhone) {
        super.signInForTelPhone(telPhone);
    }
}
