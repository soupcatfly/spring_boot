package com.soupcat.spring.boot.ch1.javaconfig;


/**
 * @Project : highlig_spring4_idea
 * @Package Name : com.soupcat.spring.boot.ch1.di
 * @Author : soupcat
 * @Creation Date : 2018年01月18日 下午3:22
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}
