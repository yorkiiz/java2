package com.gupaoedu.vip.pattern.proxy.staticproxy.mystaticproxy;

public class Driver {
    private Car car;
    public Driver(Car car){
        this.car = car;
    }

    public void drive(){
        before();
        car.drive();
        after();
    }

    public void stop(){
        before();
        car.stop();
        after();
    }


    public void before(){
        System.out.println("**************");
    }

    public void after(){
        System.out.println("--------------");
    }
}
