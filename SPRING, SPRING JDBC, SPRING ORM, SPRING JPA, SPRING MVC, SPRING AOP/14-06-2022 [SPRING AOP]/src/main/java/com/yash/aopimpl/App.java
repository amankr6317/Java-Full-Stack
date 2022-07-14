package com.yash.aopimpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.aopimpl.services.PaymentService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/aopimpl/config.xml");
		PaymentService pobject = context.getBean("payment", PaymentService.class);
		pobject.makePayment();
		
//		PaymentService pobject1 = context.getBean("paymentlist", PaymentService.class);
//		pobject1.makePayment();
	}
}
