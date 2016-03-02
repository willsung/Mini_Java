import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.ruanko.entity.Userinfo;
import com.ruanko.sessionFactory.HibernateSessionFactory;


public class TestUser {
	
	@Test
	public void testSave(){
		Configuration cfg=  new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Userinfo userinfo = new Userinfo();
		userinfo.setUserName("zhangsan1");
		userinfo.setUserPassword("123");
		userinfo.setAge(18);
		session.beginTransaction();
		session.save(userinfo);
		session.getTransaction().commit();
	}
	
	@Test
	public void testGetUser(){
		Session session =HibernateSessionFactory.getSession();
		System.out.println("------开始执行get查询---------");
		Userinfo userinfo =(Userinfo) session.get(Userinfo.class, 2);	
		System.out.println("------get查询结束---------");
		System.out.println(userinfo.getUserName()+" "+userinfo.getUserPassword());
		
		System.out.println("------开始执行load查询---------");
		Userinfo userinfo2 =(Userinfo) session.load(Userinfo.class, 3);	
		System.out.println("------load查询结束---------");
//		System.out.println(userinfo2.getUserName()+" "+userinfo2.getUserPassword());
		
	}

	@Test
	public void testDeleteUser(){
		Session session =HibernateSessionFactory.getSession();
		
		session.beginTransaction();
		session.delete(session.get(Userinfo.class, 2));
		session.getTransaction().commit();

	}
	
	@Test
	public void testUpdateUser(){
		Session session =HibernateSessionFactory.getSession();
		session.beginTransaction();
		Userinfo userinfo =(Userinfo) session.get(Userinfo.class, 3);	
		userinfo.setUserPassword("123456");	
		session.update(userinfo);
		session.getTransaction().commit();

	}
	
}
