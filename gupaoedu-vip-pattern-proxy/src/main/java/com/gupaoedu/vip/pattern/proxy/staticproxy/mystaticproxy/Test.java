package com.gupaoedu.vip.pattern.proxy.staticproxy.mystaticproxy;

public class Test {
    public static void main(String[] args) {
        Driver driver = new Driver(new Baoma());
        driver.drive();
        driver.stop();
    }
}
