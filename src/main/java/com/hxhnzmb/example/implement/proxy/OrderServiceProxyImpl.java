package com.hxhnzmb.example.implement.proxy;

import com.hxhnzmb.example.implement.OrderService;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/19 17:08
 */
public class OrderServiceProxyImpl implements OrderService{

    /**
     * 被代理对象
     */
    private OrderService orderService;

    public OrderServiceProxyImpl(OrderService orderService){
        this.orderService = orderService;
    }

    public void order() {
        System.out.println(">>>打印订单日志开始");
        orderService.order();
        System.out.println(">>>打印订单日志结束");
    }
}
