package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy.myjdkproxy;

public class Test {
    public static void main(String[] args) {
        JdkDriver jdkDriver = new JdkDriver();
        Car car = jdkDriver.getInstance(new Baoma());
        car.drive();
        car.speed();
    }
}
