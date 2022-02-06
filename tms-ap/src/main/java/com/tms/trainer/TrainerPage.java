package com.tms.trainer;

import java.io.IOException;
import com.tms.app.App;
import com.tms.util.Utility;

/**
 *
 * @author Ashish
 *
 */
public class TrainerPage {

	TrainerLogin login = new TrainerLogin();
	TrainerRegistration registration = new TrainerRegistration();
	ForgotPasswordTrainer pass = new ForgotPasswordTrainer();

	public void trainer() {

		System.out.println("Press 1 for Registration.");
		System.out.println("Press 2 for Login");
		System.out.println("Press 3 for go Back");
		System.out.println("Press 4 for ForgotPassword");
		System.out.println("Press 5 for Exit");
		try {
			int choose = Integer.parseInt(Utility.stringUtil());

			switch (choose) {
			case 1:
				registration.trainerRegistration();
				break;
			case 2:
				login.trainerLogin();
				break;
			case 3:
				App.main(null);
				break;
			case 4:
				pass.forgotPass();
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				System.out.println("invalid selection");
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
