import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import com.willsung.model.Student;
import com.willsung.model.Teacher;

public class TeacherTest {

	/**
	 * @param args
	 */
	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		t.setId(1);
		t.setName("22");
		t.setTitle("AA");
		
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
	
}
