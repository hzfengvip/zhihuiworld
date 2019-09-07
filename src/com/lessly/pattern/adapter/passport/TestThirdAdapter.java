package com.lessly.pattern.adapter.passport;

public class TestThirdAdapter {

    public static void main(String[] args) {
        SignInForQQAdapter qqAdapter = new SignInForQQAdapter(new SigninService());
        qqAdapter.signInForQQ("ohdhfsjjdddsss_");

    }
}
