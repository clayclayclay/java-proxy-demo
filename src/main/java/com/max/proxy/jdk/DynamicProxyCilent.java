package com.max.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.max.proxy.jdk.bean.BMW;
import com.max.proxy.jdk.bean.Car;

public class DynamicProxyCilent
{

      public static void main(String[] args) {
          Car bmw = new BMW();
          InvocationHandler handler = new CustomInvocationHandler(bmw);
          Car proxyBWM = (Car) Proxy.newProxyInstance(handler.getClass().getClassLoader(), bmw.getClass().getInterfaces(), handler);
          proxyBWM.run();
      }
      
}
  