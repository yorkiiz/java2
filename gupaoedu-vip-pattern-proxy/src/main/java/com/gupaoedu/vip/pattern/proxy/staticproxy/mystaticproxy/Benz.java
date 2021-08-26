package com.gupaoedu.vip.pattern.proxy.staticproxy.mystaticproxy;

public class Benz implements Car {
    @Override
    public void drive() {
        System.out.println("Benz car drive");
    }

    @Override
    public void stop() {
        System.out.println("Benz car stop");

    }
}
