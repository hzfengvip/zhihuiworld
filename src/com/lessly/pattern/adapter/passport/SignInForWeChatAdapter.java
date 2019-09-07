package com.lessly.pattern.adapter.passport;


/**
 * 微信登录注册
 */
public class SignInForWeChatAdapter extends SignInForThirdAdapter{

    public SignInForWeChatAdapter(SigninService signinService) {
        super(signinService);
    }

    @Override
    public void signInForWeChat(String unionId) {
        super.signInForWeChat(unionId);
    }
}
