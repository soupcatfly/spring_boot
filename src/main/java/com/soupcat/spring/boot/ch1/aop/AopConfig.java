package com.soupcat.spring.boot.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Project : highlig_spring4_idea
 * @Package Name : com.soupcat.spring.boot.ch1.aop
 * @Author : soupcat
 * @Creation Date : 2018年01月18日 下午4:24
 */
@Configuration
@ComponentScan("com.soupcat.spring.boot.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
