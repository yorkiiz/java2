package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;


import sun.misc.ProxyGenerator;

import java.io.*;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();
        //zhangsan.buyInsure();


        //IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
       // zhaoliu.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$proxy0",new Class[]{IPerson.class});
        FileOutputStream os = new FileOutputStream("D://$proxy0.class");
        os.write(bytes);
        os.close();

    }
}
