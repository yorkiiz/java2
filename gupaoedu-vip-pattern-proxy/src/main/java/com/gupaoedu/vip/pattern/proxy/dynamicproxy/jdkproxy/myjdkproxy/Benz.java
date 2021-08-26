package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy.myjdkproxy;

public class Benz implements Car {
    @Override
    public void drive() {
        System.out.println("Benz car drive");
    }

    @Override
    public void stop() {
        System.out.println("Benz car stop");

    }

    @Override
    public void speed() {
        System.out.println("speed");
    }
}
