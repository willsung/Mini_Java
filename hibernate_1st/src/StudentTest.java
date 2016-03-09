import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import com.willsung.model.Student;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setId(1);
		s.setName("s1");
		s.setAge(1);
		
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
	
}
