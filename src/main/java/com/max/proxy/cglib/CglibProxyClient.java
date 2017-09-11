
package com.max.proxy.cglib;

import com.max.proxy.jdk.bean.Student;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class CglibProxyClient
{

    public static void main(String[] args)
    {
        Student student = new Student();
        MethodInterceptor handler = new CglibProxyHandler(student);
        Student proxyStudent = (Student) Enhancer.create(Student.class,handler);
        proxyStudent.writeHomeWork();
    }

}
