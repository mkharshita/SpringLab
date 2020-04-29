package com.cg.labbook1.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cg.labbook1.bean.Employee;
import com.cg.labbook1.bean.SBU;

@Configuration
@ComponentScan("com.cg.labbook1")
public class JavaConfig {

	@Bean
	public SBU sbu() {
		Employee emp1 = new Employee();
		emp1.setEmployeeId(12345);
		emp1.setEmployeeName("Harriet");
		emp1.setSalary(40000);
		Employee emp2 = new Employee();
		emp2.setEmployeeId(67890);
		emp2.setEmployeeName("Mayank");
		emp2.setSalary(60000);
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		SBU sbuobj = new SBU();
		sbuobj.setSubCode(99999);
		sbuobj.setSubName("Kiran Rao");
		sbuobj.setSubHead("Vikas");
		sbuobj.setEmpList(empList);
		return sbuobj;
	}
}
