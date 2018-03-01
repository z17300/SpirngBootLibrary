package com.zhu.web.mysecondboot;

import org.directwebremoting.spring.DwrSpringServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ComponentScan(basePackages = "com.zhu.web")//扫描当前主要的spring类
@ImportResource(locations = "classpath:spring.xml")
public class MysecondbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysecondbootApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		DwrSpringServlet servlet = new DwrSpringServlet();
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(servlet, "/dwr/*");
		registrationBean.addInitParameter("debug", "true");//测试工具
		return registrationBean;
	}
}
