
package com.max.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyHandler implements MethodInterceptor
{

    private Object targetObject;

    public CglibProxyHandler(Object targetObject)
    {
        super();
        this.targetObject = targetObject;
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable
    {
         System.out.println("the student took his books from schoolBag");
         method.invoke(targetObject, args);
         System.out.println("the student finished his home work");
         return null;
    }

}
