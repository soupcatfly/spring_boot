package com.soupcat.spring.boot.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Project : highlig_spring4_idea
 * @Package Name : com.soupcat.spring.boot.ch1.di
 * @Author : soupcat
 * @Creation Date : 2018年01月18日 下午3:27
 */
public class Main {
    public static void main(String[] args) {
        //使用context作为spring的容器 接受一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        //获得UseFunctionService的Bean
        UseFunctionService userFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(userFunctionService.SayHello("di"));
        context.close();
    }
}
