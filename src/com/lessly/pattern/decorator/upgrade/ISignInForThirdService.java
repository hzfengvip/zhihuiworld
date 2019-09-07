package com.lessly.pattern.decorator.upgrade;


/**
 * 包装器接口
 */
public interface ISignInForThirdService extends ISigninService {

    public void signInForQQ(String openId);


    public void signInForWeChat(String unionId);


    public void signInForTelPhone(String telPhone);


}