package com.tms.app;

import java.io.IOException;

import com.tms.trainer.TrainerPage;
import com.tms.util.Utility;

/**
 *
 * @author Ashish
 *
 */
public class App {
	public static void main(String[] args) {
		TrainerPage tr = new TrainerPage();
		// Employee emp = new Employee();

		System.out.println("----------Welcom---------");
		System.out.println("Select one Option.");
		System.out.println("Enter 1 for Trainer");
		System.out.println("Enter 2 for Employee");
		System.out.println("Enter 3 for exit");

		try {
			int choose = Integer.parseInt(Utility.stringUtil());

			switch (choose) {

			case 1:
				tr.trainer();
				break;
			case 2:
				// emp.employee();
				break;
			case 3:
				System.out.println("Exit");
				break;
			default:
				System.out.println("invalid choice");
				App.main(null);
				break;

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
