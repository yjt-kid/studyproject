package com.yjt.study.projectservice.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yjt.study.projectentry.entry.Site;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yjt
 * @since 2019-07-26
 */
public interface ISiteService extends IService<Site> {

    IPage<Site> getByPage();
}
