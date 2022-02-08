package fr.formation.inti.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import fr.formation.inti.entity.Employee;

@Repository("employeeDao")
public class EmployeeDao extends GenericDaoHibernate<Employee, Integer> implements IEmployeeDao {
	private static final Log log = LogFactory.getLog(EmployeeDao.class);
	
//	private static EmployeeDao dao = null;
	
	public EmployeeDao() {
		log.info("------------------------ new EmployeeDao()");
	}
	
	//factory-method dans la config xml
//	public static EmployeeDao createInstance() {
//		log.info("----------------------- new EmployeeDao() by factory-method");
//		if (dao==null)
//			dao = new EmployeeDao();
//		return dao;
//	}
	
	
	
	
}
