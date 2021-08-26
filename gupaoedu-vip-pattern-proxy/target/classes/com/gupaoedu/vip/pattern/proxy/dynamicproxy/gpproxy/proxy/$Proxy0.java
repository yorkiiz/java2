package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.proxy;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.client.IPerson;
import java.lang.reflect.*;
public class $Proxy0 implements com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.client.IPerson{
GPInvocationHandler h;
public $Proxy0(GPInvocationHandler h) { 
this.h = h;}
public void buyInsure() {
try{
Method m = com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.client.IPerson.class.getMethod("buyInsure",new Class[]{});
this.h.invoke(this,m,new Object[]{});
}catch(Error _ex) { }catch(Throwable e){
throw new UndeclaredThrowableException(e);
}}public void findLove() {
try{
Method m = com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.client.IPerson.class.getMethod("findLove",new Class[]{});
this.h.invoke(this,m,new Object[]{});
}catch(Error _ex) { }catch(Throwable e){
throw new UndeclaredThrowableException(e);
}}}
