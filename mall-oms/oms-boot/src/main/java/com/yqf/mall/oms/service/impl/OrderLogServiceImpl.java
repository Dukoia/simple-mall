package com.yqf.mall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yqf.common.web.util.JwtUtils;
import com.yqf.mall.oms.mapper.OrderLogMapper;
import com.yqf.mall.oms.pojo.entity.OmsOrderLog;
import com.yqf.mall.oms.service.IOrderLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderLogServiceImpl extends ServiceImpl<OrderLogMapper, OmsOrderLog> implements IOrderLogService {
    @Override
    public void addOrderLogs(Long orderId, Integer orderStatus, String user, String detail) {
        log.info("添加订单操作日志，orderId={}，detail={}", orderId, detail);
        OmsOrderLog orderLog = new OmsOrderLog();
        orderLog.setDetail(detail);
        orderLog.setOrderId(orderId);
        orderLog.setOrderStatus(orderStatus);
        orderLog.setUser(user);
        this.save(orderLog);
    }

    @Override
    public void addOrderLogs(Long orderId, Integer orderStatus, String detail) {
        Long userId = JwtUtils.getUserId();
        addOrderLogs(orderId, orderStatus, userId.toString(), detail);
    }

}
