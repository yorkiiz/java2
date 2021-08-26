package com.gupaoedu.vip.pattern.proxy.dynamicproxy.cglibproxy.mycglib;

public class Test {
    public static void main(String[] args) {
        Car car = (Car) new  Mycglibproxy().getInstance(Car.class);
        car.buy();
    }
}
