package com.eric.shirodemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author JinChen
 * @Title: UrlInit
 * @Package com.eric.shirodemo.config
 * @Description: TODO(启动程序自动加载Url)
 * @date 2019/8/5 11:21
 * Copyright (c) 1994-2019 Scjydz.com All Rights Reserved.
 */
@Component
public class UrlInit implements CommandLineRunner {
    //url配置
    @Resource
    private UrlConfig urlConfig;
    private static final Logger logger = LoggerFactory.getLogger(UrlInit.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info("启动url校验");
        logger.info("url校验中...");
        //处理自身url
        urlConfig.getUrls();
        logger.info("url校验结束");
    }
}
