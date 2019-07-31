package com.hxhnzmb.example.jdk.proxy;

import com.hxhnzmb.example.jdk.proxy.impl.JdkInvocationHandler;
import com.hxhnzmb.example.jdk.proxy.impl.OrderServiceImpl;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/24 14:12
 */
public class Client {

    public static void main(String[] args) {
        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(new OrderServiceImpl());
        OrderService proxy = jdkInvocationHandler.getProxy();
        proxy.order();
    }
}
