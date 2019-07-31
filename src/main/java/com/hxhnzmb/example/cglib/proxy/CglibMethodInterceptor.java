package com.hxhnzmb.example.cglib.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/24 15:18
 */
public class CglibMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("<<<<<日志收集开始...>>>>>>>");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("<<<<<日志收集结束...>>>>>>>");

        return result;
    }
}
