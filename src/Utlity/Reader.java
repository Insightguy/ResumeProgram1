package Utlity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

	public static String readString(String message)
		throws IOException {
		
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
		
		System.out.print(message);
		String input = reader.readLine();
		return input;
		}
	
	public static int readInt(String message)
		throws IOException {
		
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
			
		System.out.print(message);
		
		int input = Integer.parseInt(reader.readLine());
		return input;
		}
	
	public static double readDouble(String message)
		throws IOException {
		
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
			
		System.out.print(message);
		
		double input = Double.parseDouble(reader.readLine());
		return input;
		}

}
