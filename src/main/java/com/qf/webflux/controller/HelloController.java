/*
 * Copyright (C), 2016-2021, 上海巧房信息技术有限公司
 * ClassName: HelloController
 * Author:    yuanting.mao
 * Date:     2021/5/7 10:48
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名     修改时间      版本号        描述
 */
package com.qf.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yuanting.mao
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> hello(){
        return Mono.just("Welcome to reactive world ~");
    }
    
    @GetMapping("/now")
    public Mono<LocalDateTime> now(){
        return Mono.just(LocalDateTime.now());
    }
}