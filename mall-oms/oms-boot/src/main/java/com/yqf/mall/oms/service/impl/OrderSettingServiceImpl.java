package com.yqf.mall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yqf.mall.oms.mapper.OrderSettingMapper;
import com.yqf.mall.oms.pojo.entity.OmsOrderSetting;
import com.yqf.mall.oms.service.IOrderSettingService;
import org.springframework.stereotype.Service;


@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OmsOrderSetting> implements IOrderSettingService {

}
