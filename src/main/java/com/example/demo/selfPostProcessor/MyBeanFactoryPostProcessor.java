package com.example.demo.selfPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Service;

/**
 * @ClassName MyPostProcessor
 * @Description spring扩展-可以对beanFactory做修改处理
 * @Author qzh
 * @Date 2023/2/10 21:45
 * @Version 1.0
 **/
@Service
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("-----------------postProcessor________________");
    }
}
