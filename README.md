# java-proxy-demo
this is a project about java proxy, including:
* jdk dynamic proxy
* cglib

## JDK Dynamic Proxy

Involved Main Classes and Methods:

* Proxy

  * ```java
    Object Proxy.newProxyInstance((ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
    ```

* InvocationHandler

  * ```java
    Object InvocationHandler invoke(Object proxy, Method method, Object[] args) throws Throwable
    ```



## Cglib Dynamic Proxy

Involved Main Classes and Methods:

* Enhancer

  * ```java
    Object Enhancer.create(Class type, Callback callback);
    ```

* MethodInterceptor

  * ```java
    Object MethodInterceptor intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable
    ```