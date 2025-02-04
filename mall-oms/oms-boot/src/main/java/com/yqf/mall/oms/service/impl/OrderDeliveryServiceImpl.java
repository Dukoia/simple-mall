package com.yqf.mall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import com.yqf.mall.oms.mapper.OrderDeliveryMapper;
import com.yqf.mall.oms.pojo.entity.OmsOrderDelivery;
import com.yqf.mall.oms.service.IOrderDeliveryService;
import org.springframework.stereotype.Service;

@Service("orderDeliveryService")
public class OrderDeliveryServiceImpl extends ServiceImpl<OrderDeliveryMapper, OmsOrderDelivery> implements IOrderDeliveryService {

}
