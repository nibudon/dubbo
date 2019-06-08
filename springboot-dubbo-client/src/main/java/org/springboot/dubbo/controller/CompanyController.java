package org.springboot.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springboot.dubbo.bean.Company;
import org.springboot.dubbo.service.CompanySevice;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CompanyController {
	@Reference(version = "1.0.0")
	CompanySevice companySevice;

	public List<Company> getAllCompanys() {
		return companySevice.getAllCompanys();
	}

}
