package com.yjt.study.projectservice.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yjt.study.projectentry.entry.Site;
import com.yjt.study.projectdao.mapper.SiteMapper;
import com.yjt.study.projectservice.service.ISiteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yjt
 * @since 2019-07-26
 */
@Service("siteService")
public class ISiteServiceImpl extends ServiceImpl<SiteMapper, Site> implements ISiteService {
    @Autowired
    private SiteMapper siteMapper;


    @Override
    public IPage<Site> getByPage() {
        Page<Site> page = new Page<>();
        IPage<Site> newPage = siteMapper.getByPage(page);
        newPage.getRecords();
        return newPage;
    }
}
