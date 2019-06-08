package org.springboot.dubbo;

import java.util.List;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springboot.dubbo.bean.Company;
import org.springboot.dubbo.bean.User;
import org.springboot.dubbo.controller.CompanyController;
import org.springboot.dubbo.controller.UserController;
import org.springboot.dubbo.service.CompanySevice;
import org.springboot.dubbo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class ClientApplication {
	public static void main(String[] args) {
		// 入口运行类
		ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
//		UserController bean = run.getBean(UserController.class);
//		List<User> allUsers = bean.getAllUsers();
//		System.out.println(allUsers);
//
//		User user = bean.getUserByUserName("zhangsan");
//		System.out.println(user);
		System.out.println("-----------------------------------------");
		CompanyController bean1 = run.getBean(CompanyController.class);
		List<Company> list = null;
		list = bean1.getAllCompanys();
		for (Company company : list){
			System.out.println(company.getClass()+"===="+company.getName()+"===="+company.getCreateDate());
		}
	}
}
