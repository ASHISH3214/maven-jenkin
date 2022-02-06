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
public class TrainerProfile {

	public void viewProfile(Trainer tr) {

		System.out.println("--------------Trainer Profile------------");
		System.out.println("Trainer Name :" + tr.getTrName());
		System.out.println("Trainer Email :" + tr.getTrEmail());
		System.out.println("Trainer UserName :" + tr.getUsername());
		System.out.println("Trainer contact :" + tr.getTrMb());
		System.out.println("Trainer DOB :" + tr.getTrDob());

		System.out.println("Press 1 for go back");
		System.out.println("Press 2 for exit");

		try {
			int choose = Integer.parseInt(Utility.stringUtil());

			switch (choose) {

			case 1:
				TrainerDashboard dashboard = new TrainerDashboard();
				dashboard.dashBoard(tr);
				break;
			case 2:
				System.out.println("Exit");
				break;
			default:
				System.out.println("invalid choice");
				break;

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void editProfile(Trainer tr) {
		TrainerDAO dao = new TrainerDAO();
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		System.out.println("*--------Edit Profile-----------*");

		try {
			System.out.println("Trainer Name :" + tr.getTrName());
			System.out.println("Enter new Name");
			String name = Utility.stringUtil();
			tr.setTrName(name);

			System.out.println("Trainer UserName :" + tr.getUsername());
			System.out.println("Enter new userName");
			String userName = Utility.stringUtil();
			tr.setUsername(userName);

			System.out.println("Trainer Password: " + tr.getPassword());
			System.out.println("Enter New Password");
			String password = Utility.stringUtil();
			tr.setPassword(password);

			System.out.println("Trainer contact :" + tr.getTrMb());

			System.out.println("Enter Traner Contact number");
			String contact = Utility.stringUtil();
			tr.setTrMb(contact);

			dao.updateTrainer(tr, session);
			session.close();

		}

		catch (IOException e) {
			System.out.println("Trainer Updation failed" + e);
		}

	}

}
