package com.yqf.mall.oms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import com.yqf.mall.oms.pojo.entity.OmsOrder;
import com.yqf.mall.oms.pojo.dto.OrderConfirmDTO;
import com.yqf.mall.oms.pojo.vo.OrderConfirmVO;
import com.yqf.mall.oms.pojo.vo.OrderSubmitVO;
import com.yqf.mall.oms.pojo.dto.OrderSubmitDTO;

/**
 * 订单详情表
 *
 * @author huawei
 * @email huawei_code@163.com
 * @date 2020-12-30 22:31:10
 */
public interface IOrderService extends IService<OmsOrder> {

    /**
     * 订单确认
     */
    OrderConfirmVO confirm(OrderConfirmDTO orderConfirmDTO);

    /**
     * 订单提交
     */
    OrderSubmitVO submit(OrderSubmitDTO orderSubmitDTO) ;

    /**
     * 订单支付
     */
    boolean pay(Long orderId);


    /**
     * 系统关闭订单
     */
    boolean closeOrder(String orderToken);

    /**
     * 取消订单接口
     */
    boolean cancelOrder(Long id);

    /**
     * 删除订单
     */
    boolean deleteOrder(Long id);


    IPage<OmsOrder> list(Page<OmsOrder> omsOrderPage, OmsOrder order);
}

