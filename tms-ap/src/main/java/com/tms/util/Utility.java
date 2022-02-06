/**
 * 
 */
package com.tms.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ritu
 *@see utility functions for input
 *         jan, 2022
 */
public class Utility  {

	public static String stringUtil() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String strInput = input.readLine();
		return strInput;
	}
	
	public static double doubleUtil() throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		double dbInput = Double.parseDouble(input.readLine());
		return dbInput;
	}

}
