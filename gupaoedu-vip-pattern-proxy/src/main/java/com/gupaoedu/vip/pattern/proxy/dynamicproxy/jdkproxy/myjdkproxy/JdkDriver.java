package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy.myjdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDriver implements InvocationHandler {
    private Car car;


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.car,args);
        after();
        return result;
    }


    public  Car getInstance(Car car){
        this.car = car;
        Class<?> clazz = car.getClass();
        return (Car)Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public void before(){
        System.out.println("****************");
    }

    public void after(){
        System.out.println("-----------------");
    }


}
