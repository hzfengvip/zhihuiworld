package com.lessly.pattern.decorator.upgrade;


/**
 * 老登录、注册代码（被包装器）
 */
public class SigninService implements ISigninService{


    /**
     * 注册操作
     * @param userName
     * @param password
     */
    public void regist(String userName, String password){
        System.out.println("注册成功");
    }


    /**
     * 登录操作
     * @param userName
     * @param password
     */
    public void login(String userName, String password){
        System.out.println("登录成功");
    }



}
