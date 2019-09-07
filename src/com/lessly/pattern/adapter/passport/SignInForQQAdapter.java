package com.lessly.pattern.adapter.passport;


/**
 * QQ平台登录
 */
public class SignInForQQAdapter extends SignInForThirdAdapter{

    public SignInForQQAdapter(SigninService signinService) {
        super(signinService);
    }

    @Override
    public void signInForQQ(String openId) {
        super.signInForQQ(openId);
    }
}
