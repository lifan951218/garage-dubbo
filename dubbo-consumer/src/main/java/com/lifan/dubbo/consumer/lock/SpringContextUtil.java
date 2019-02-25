package com.lifan.dubbo.consumer.lock;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class SpringContextUtil implements ApplicationContextAware {
    
	private static ApplicationContext context;
   
    @SuppressWarnings("static-access")
    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        this.context=context;
    }
    public static Object getBean(String beanName){
        return context.getBean(beanName);
    }
    
    public static <T> T getBean(Class<T> requiredType){
        return  context.getBean(requiredType);
    }
    
    public <T> T getBean(String name, Class<T> requiredType) {
    	return context.getBean(name, requiredType);
    }
     
    public static String getMessage(String key){
        return context.getMessage(key, null, Locale.getDefault());
    }
 
    public static ApplicationContext getApplicationContext(){
    	return context;
    }
}
