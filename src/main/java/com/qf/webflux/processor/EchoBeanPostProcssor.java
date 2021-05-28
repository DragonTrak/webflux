package com.qf.webflux.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EchoBeanPostProcssor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        log.info("自定义postProcessBeforeInitialization------beanName:{}-----------",beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean,beanName);
    }
    
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // TODO Auto-generated method stub
//        log.info("自定义postProcessBeforeInitialization------postProcessAfterInitialization:{}-----------",bean.getClass());
        return BeanPostProcessor.super.postProcessAfterInitialization(bean,beanName);
    }
}
