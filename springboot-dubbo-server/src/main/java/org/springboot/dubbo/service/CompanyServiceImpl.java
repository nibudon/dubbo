package org.springboot.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springboot.dubbo.bean.Company;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(version = "1.0.0") // dubbo的service注解，不具备spring的@service注解的功能
@Component
public class CompanyServiceImpl implements CompanySevice {

    @Override
    public List<Company> getAllCompanys() {
        List<Company> list = new ArrayList<Company>();
        Company c1 = new Company();
        c1.setId(1);
        c1.setName("用友");
        c1.setCreateDate(new Date());
        Company c2 = new Company();
        c2.setId(2);
        c2.setName("用友2");
        c2.setCreateDate(new Date());
        list.add(c1);
        list.add(c2);
        return list;
    }

}
