package com.yjt.study.projectdao.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yjt.study.projectentry.entry.Site;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yjt
 * @since 2019-07-26
 */
public interface SiteMapper extends BaseMapper<Site> {
    IPage<Site> getByPage(Page<Site> page);
}
