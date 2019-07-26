package com.yjt.study.projectweb.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yjt.study.projectentry.entry.Site;
import com.yjt.study.projectservice.service.ISiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yjt
 * @since 2019-07-26
 */
@RestController
@RequestMapping("/site")
public class SiteController {
    @Autowired()
    private ISiteService siteService;
    @RequestMapping("/getByPage")
    public Map<String,Object> getByPage() {
        IPage<Site> page = siteService.getByPage();
        Map<String,Object> res = new HashMap<>();
        res.put("list",page.getRecords());
        res.put("current",page.getCurrent());
        res.put("pages",page.getPages());
        res.put("size",page.getSize());
        res.put("total",page.getTotal());
        return res;
    }
}

