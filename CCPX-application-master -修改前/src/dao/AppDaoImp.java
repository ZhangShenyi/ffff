package dao;

import java.math.BigInteger;
import java.util.List;

import javax.annotation.Resource;

import model.advertisement;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Repository;

@Repository("AppDaoImp")
public class AppDaoImp implements AppDao{
	@Resource(name = "sessionFactory")
	private   SessionFactory sessionfactory;
	private  Session session;
//    private static ServiceRegistry serviceRegistry; 
//    public  SessionFactory createSessionFactory(SessionFactory sessionFactory)throws HibernateException{  
//      Configuration configuration = new Configuration();  
//      configuration.configure("config/hibernate2.cfg.xml");  
//      serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();          
//      sessionFactory = configuration.buildSessionFactory(serviceRegistry);  
//      return sessionFactory;  
//  }  
  private Session getSession()
	{
	  session = sessionfactory.openSession();
//		if (session == null) {
//			
//			session =sessionfactory.openSession();
//		} else {
//			session=sessionfactory.getCurrentSession();
//		}
		return session;
	}
	public List<advertisement> checkAdbynum(int i)
	{
		String hql="from advertisement";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(getTotalrecordnum()-i);
		query.setMaxResults(i);
		List<advertisement> list = query.list();
		return list;
		
	}
	public int getTotalrecordnum()
	{
		int i;
	 String sql = "select count(*) from advertisement";  
	  Query query = getSession().createSQLQuery(sql);
	  List list = query.list();
	  i=  Integer.parseInt(list.get(0).toString());
	  System.out.println("总记录数："+i);
	  return i;
	  
	  
	}

	
	

}
