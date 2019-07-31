package com.hxhnzmb.example.cglib.proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/24 15:21
 */
public class Main {

    public static void main(String[] args) {
        CglibMethodInterceptor cglibMethodInterceptor = new CglibMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        // 设置代理类的父类
        enhancer.setSuperclass(OrderServiceImpl.class);
        // 设置回调对象
        enhancer.setCallback(cglibMethodInterceptor);
        // 创建代理对象
        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) enhancer.create();
        orderServiceImpl.order();
    }
}
