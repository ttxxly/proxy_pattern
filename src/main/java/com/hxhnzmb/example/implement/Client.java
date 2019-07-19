package com.hxhnzmb.example.implement;

import com.hxhnzmb.example.implement.impl.OrderServiceImpl;
import com.hxhnzmb.example.implement.proxy.OrderServiceProxyImpl;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/19 17:13
 */
public class Client {

    public static void main(String[] args) {
        OrderServiceProxyImpl orderServiceProxy = new OrderServiceProxyImpl(new OrderServiceImpl());
        orderServiceProxy.order();
    }
}
