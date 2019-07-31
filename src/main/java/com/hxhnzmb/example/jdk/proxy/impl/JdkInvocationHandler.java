package com.hxhnzmb.example.jdk.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/24 11:27
 */
public class JdkInvocationHandler implements InvocationHandler{

    /**
     * 目标代理对象
     */
    private Object object;

    public JdkInvocationHandler(Object object){
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>打印订单日志开始");
        Object invoke = method.invoke(object, args);
        System.out.println(">>>打印订单日志结束");
        return invoke;
    }

    /**
     * 获取代理对象接口
     * @param <T> df
     * @return  ef
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
}
