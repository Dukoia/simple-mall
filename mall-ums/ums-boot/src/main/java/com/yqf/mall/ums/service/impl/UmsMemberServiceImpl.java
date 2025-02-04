package com.yqf.mall.ums.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yqf.mall.ums.pojo.entity.UmsMember;
import com.yqf.mall.ums.mapper.UmsUserMapper;
import com.yqf.mall.ums.service.IUmsMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsUserMapper, UmsMember> implements IUmsMemberService {


    @Override
    public IPage<UmsMember> list(Page<UmsMember> page, UmsMember spu) {
        List<UmsMember> list = this.baseMapper.list(page, spu);
        page.setRecords(list);
        return page;
    }
}
