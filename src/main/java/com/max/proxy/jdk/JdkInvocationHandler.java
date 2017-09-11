package com.max.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkInvocationHandler implements InvocationHandler
{
    
    private Object targetObject;

    public JdkInvocationHandler(Object targetObject)
    {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("The car  is checking if the key is right");
        System.out.println("The key is right, the car is running");
        method.invoke(targetObject, args);
        System.out.println("The car shut down ");
        return null;
    }

}
