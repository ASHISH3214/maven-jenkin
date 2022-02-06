package com.tms.trainer;

import java.io.IOException;

import com.tms.beans.Trainer;
import com.tms.util.Utility;

/**
 *
 * @author Ashish
 *
 */
public class TrainerDashboard {

	public void dashBoard(Trainer tr) {

		TrainerProfile profile = new TrainerProfile();
		System.out.println("Enter 1 for profile..");
		System.out.println("Enter 2 for Edit profile..");
		System.out.println("Press 3 for Exit");

		try {
			int choose = Integer.parseInt(Utility.stringUtil());

			switch (choose) {

			case 1:
				profile.viewProfile(tr);
				break;
			case 2:
				profile.editProfile(tr);
				break;
			case 3:
				System.out.println("Exit");
				break;
			default:
				System.out.println("invalid choice");
				break;

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
