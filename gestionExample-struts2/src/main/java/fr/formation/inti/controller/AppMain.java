package fr.formation.inti.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.formation.inti.config.AppConfiguration;
import fr.formation.inti.entity.Employee;
import fr.formation.inti.service.EmployeeService;
import fr.formation.inti.service.IEmployeeService;

public class AppMain {
	private static final Log log = LogFactory.getLog(AppMain.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IEmployeeService service = context.getBean("serviceEmployee", EmployeeService.class);
		log.info("----------------- Bean service : " + service);
		
		List<Employee> employees = service.findAll();
		for (Employee e : employees)
			log.info("----------------- " + e);
		
		context.close();
	}
	
}






