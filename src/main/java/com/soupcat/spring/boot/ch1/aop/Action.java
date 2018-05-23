package com.soupcat.spring.boot.ch1.aop;

import java.lang.annotation.*;

/**
 * @Project : highlig_spring4_idea
 * @Package Name : com.soupcat.spring.boot.ch1.aop
 * @Author : soupcat
 * @Creation Date : 2018年01月18日 下午4:07
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
