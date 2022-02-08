package fr.formation.inti.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.inti.dao.IEmployeeDao;
import fr.formation.inti.entity.Employee;

@Service("serviceEmployee")
@Transactional
public class EmployeeService implements IEmployeeService{
	private static final Log log = LogFactory.getLog(EmployeeService.class);
//	private String message;
	
	@Autowired
	@Qualifier("employeeDao") //Dans le cas où il y a plusieurs classes qui impl l'interface
	private IEmployeeDao dao;
	
	
	public EmployeeService() {
		log.info("------------------------- new EmployeeService()");
	}
	
//	@Autowired
	public EmployeeService(IEmployeeDao dao) {
		log.info("------------------------- new EmployeeService(dao)");
		this.dao = dao;
	}
	
	
	/************** Setter pour la config xml ou @ ***************/
//	@Autowired
	public void setDao(IEmployeeDao dao) {
		log.info("------------------ set dao");
		this.dao = dao;
	}
	
//	public void setMessage(String message) {
//		log.info(message);
//		this.message = message;
//	}
	/*****************************/
	
	
	/************** Init et destroy avec @ ***************/
	@PostConstruct
	private void postConstruct() {
		log.info("--------------------- init service : @PostConstruct");
	}
	
	@PreDestroy
	private void preDestroy() {
		log.info("--------------------- destroy service : @PreDestroy");
	}
	/*****************************/
	
	
	/************** CRUD ***************/
	@Override
	public Integer save(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public void update(Employee employee) {
		dao.update(employee);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public Employee findById(Integer id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> list = dao.findAll();
		return list;
	}
	/*****************************/
	
}
