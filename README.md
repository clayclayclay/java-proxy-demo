# java-proxy-demo
this is a project about java proxy, including:
* jdk dynamic proxy
* cglib

## Jdk Dynamic Proxy

Involved Main Classes and Methods:

* Proxy

  * ```java
    Object Proxy.newProxyInstance((ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
    ```

* InvocationHandler

  * ```java
    Object InvocationHandler invoke(Object proxy, Method method, Object[] args) throws Throwable
    ```


Jdk Dynamic Proxy is a framework for `Interface-oriented` proxy type.

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

Cglib can proxy any Object whether the target class implements `Interface`.



**In Spring AOP Framework,  the default is Jdk Dynamic Proxy, if the bean implements Interface, then Spring will automatically choose Cglib to init bean.