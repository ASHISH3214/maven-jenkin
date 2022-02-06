package com.tms.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.tms.beans.Trainer;
import com.tms.trainer.TrainerDashboard;
import org.hibernate.query.Query;

/**
 *
 * @author Ashish
 *
 */
public class TrainerDAO implements ITrainerDao {

	@Override
	public void saveTrainer(Session session, Trainer trainer) {
		session.save(trainer);
		session.getTransaction().commit();
		System.out.println("registration successfull..");

	}

	@Override
	public void getTrainer(Session session, String userName, String password) {
		TrainerDashboard dashboard = new TrainerDashboard();
		try {
			String hql = "from Trainer tr where tr.username=:username and tr.password=:password";
			Query<Trainer> query = session.createQuery(hql, Trainer.class);
			query.setParameter("username", userName);
			query.setParameter("password", password);

			Trainer tr = (Trainer) query.uniqueResult();

			if (tr != null)
				// System.out.println(tr);
				dashboard.dashBoard(tr);

			else
				System.out.println("invalid username password");
		} catch (Exception e) {
			System.out.println("failed in login");
			e.printStackTrace();
		}

	}

	@Override
	public void updateTrainer(Trainer trainer, Session session) {
		session.merge(trainer);
		session.getTransaction().commit();
		System.out.println("Updation successfull..");

	}

	public void changePassword(Session session, String username, String password) {
		String query = "UPDATE Trainer SET password = '" + password + "' WHERE username = '" + username + "'";
		try {
			session.createSQLQuery(query).executeUpdate();
			session.getTransaction().commit();
			System.out.println("password Changed....");
		} catch (HibernateException e) {
			session.getTransaction().rollback();
		}

	}

}
