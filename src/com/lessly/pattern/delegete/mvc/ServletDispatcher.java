package com.lessly.pattern.delegete.mvc;

import com.lessly.pattern.delegete.mvc.controller.UserController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 委派分发
 */
public class ServletDispatcher {

    private List<Handler> handerMapings = new ArrayList<>();

    public ServletDispatcher(){
        Class<?> clazz = UserController.class;
        try {
            Handler handler = new Handler();
            handler.setController(clazz.newInstance());
            handler.setMethod(clazz.getMethod("signIn", new Class[]{String.class}));
            handler.setUrl("user/signIn");
            handerMapings.add(handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doService(HttpServletRequest request, HttpServletResponse response){
        System.out.println("根据请求url进行分发");
        doDispatcher(request, response);
        System.out.println("根据请求url进行分发完毕");
    }



    private void doDispatcher(HttpServletRequest request, HttpServletResponse response){
        String uri = request.getRequestURI();
        for(Handler handler : handerMapings){
            if(handler.getUrl().equals(uri)){
                try {
                    Object token = handler.getMethod().invoke(handler.getController(),request.getParameter("userName"));
                    response.addCookie(new Cookie("tokenId",token+""));
                    return;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }
    }


}
