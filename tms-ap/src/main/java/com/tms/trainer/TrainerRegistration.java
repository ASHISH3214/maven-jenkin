package com.tms.trainer;

import static com.tms.util.HibernateUtil.getSessionFactory;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tms.beans.Trainer;
import com.tms.dao.TrainerDAO;
import com.tms.util.Utility;

/**
 *
 * @author Ashish
 *
 */
public class TrainerRegistration {

	public void trainerRegistration() {

		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		TrainerDAO dao = new TrainerDAO();
		Trainer trainer = new Trainer();
		try {
			System.out.println("Enter Trainer Name");
			String name = Utility.stringUtil();
			trainer.setTrName(name);
			System.out.println("Enter your Email");
			String email = Utility.stringUtil();
			trainer.setTrEmail(email);
			System.out.println("Enter your userName");
			String userName = Utility.stringUtil();
			trainer.setUsername(userName);
			System.out.println("Enter your Password");
			String password = Utility.stringUtil();
			trainer.setPassword(password);
			System.out.println("Enter Traner Contact number");
			String contact = Utility.stringUtil();
			trainer.setTrMb(contact);
			System.out.println("Enter Trainer DOB");
			String dob = Utility.stringUtil();
			trainer.setTrDob(dob);

			dao.saveTrainer(session, trainer);
			session.close();

		}

		catch (IOException e) {
			System.out.println("Trainer Registration failed" + e);
		}
	}

}
