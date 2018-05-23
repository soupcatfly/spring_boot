package com.soupcat.spring.boot.ch1.di;

import org.springframework.stereotype.Service;

/**
 * @Project : highlig_spring4_idea
 * @Package Name : com.soupcat.spring.boot.ch1.di
 * @Author : soupcat
 * @Creation Date : 2018年01月18日 下午3:20
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
