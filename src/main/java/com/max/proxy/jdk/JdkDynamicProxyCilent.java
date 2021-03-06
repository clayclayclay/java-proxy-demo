package com.max.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.max.proxy.bean.BMW;
import com.max.proxy.bean.Car;

public class JdkDynamicProxyCilent
{

    public static void main(String[] args)
    {
        Car bmw = new BMW();
        InvocationHandler handler = new JdkInvocationHandler(bmw);
        Car proxyBWM = (Car) Proxy.newProxyInstance(handler.getClass().getClassLoader(), bmw.getClass().getInterfaces(), handler);
        proxyBWM.run();
    }

}
