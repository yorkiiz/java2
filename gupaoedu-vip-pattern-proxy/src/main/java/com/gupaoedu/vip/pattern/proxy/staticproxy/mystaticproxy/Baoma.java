package com.gupaoedu.vip.pattern.proxy.staticproxy.mystaticproxy;

public class Baoma implements Car {
    @Override
    public void drive() {
        System.out.println("Baoma Car drive");
    }

    @Override
    public void stop() {
        System.out.println("Baoma car stop");

    }
}
