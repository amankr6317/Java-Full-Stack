package com.yash.postconstructlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	@PostConstruct
	public void init() throws Exception {
		System.out.println("Bean HelloWorld has been " + "instantiated and I'm the " + "init() method");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Container has been closed " + "and I'm the destroy() method");
	}
}
