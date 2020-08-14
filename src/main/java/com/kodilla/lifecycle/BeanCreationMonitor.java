package com.kodilla.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.logging.Logger;

public class BeanCreationMonitor implements BeanPostProcessor {
    private Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info(String.format("Bean %s, instance of class %s has been created in the container.", beanName, bean.getClass().getName()));
        return bean;
    }

}
