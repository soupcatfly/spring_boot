package com.soupcat.spring.boot.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Project : highlig_spring4_idea
 * @Package Name : com.soupcat.spring.boot.ch1.di
 * @Author : soupcat
 * @Creation Date : 2018年01月18日 下午3:22
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}
