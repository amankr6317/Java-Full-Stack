package com.yash;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcess implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object object, String string) throws BeansException {
		System.out.println("In DisplayNameBeanPostProcess of postProcessAfterInitialization method() " + string);
		return object;
	}
	
	public Object postProcessBeforeInitialization(Object object, String string) throws BeansException {
		System.out.println("In DisplayNameBeanPostProcess of postProcessBeforeInitialization method() " + string);
		return object;
	}

}
