package com.tms.trainer;

import java.io.IOException;
import static com.tms.util.HibernateUtil.getSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.tms.dao.TrainerDAO;
import com.tms.util.Utility;

/**
 *
 * @author Ashish
 *
 */
public class TrainerLogin {

	TrainerDAO dao = new TrainerDAO();
	Session session = getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();

	public void trainerLogin() throws IOException {

		System.out.println("Enter your userName");
		String userName = Utility.stringUtil();

		System.out.println("Enter your Password");
		String password = Utility.stringUtil();

		dao.getTrainer(session, userName, password);
		session.close();

	}

}
