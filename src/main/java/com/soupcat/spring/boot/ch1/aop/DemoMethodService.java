package com.soupcat.spring.boot.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @Project : highlig_spring4_idea
 * @Package Name : com.soupcat.spring.boot.ch1.aop
 * @Author : soupcat
 * @Creation Date : 2018年01月18日 下午4:12
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("--add--");
    }
}
