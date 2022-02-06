package com.tms.trainer;

import static com.tms.util.HibernateUtil.getSessionFactory;
import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.tms.dao.TrainerDAO;
import com.tms.util.Utility;

/**
 *
 * @author Ashish
 *
 */
public class ForgotPasswordTrainer {

	public void forgotPass() throws IOException {

		TrainerDAO dao = new TrainerDAO();
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		System.out.println("---------Forgot Password---------");
		System.err.println("Enter your UserName..");
		String username = Utility.stringUtil();
		System.out.println("Create new Password");
		String password = Utility.stringUtil();

		dao.changePassword(session, username, password);

	}

}
