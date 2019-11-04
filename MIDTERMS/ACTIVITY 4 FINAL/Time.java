import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;	

public class Time{
	
	public static void main(String args[]) throws IOException{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Enter minutes: ");
		int minutes = Integer.parseInt(br.readLine());
 	
 		int hours = minutes/60;
 	
 		int remainingMinutes = minutes%60;
 		minutes = remainingMinutes;
 	
 		System.out.println("There are " + hours + " hours"+ " and " + minutes + " minutes.");
 	
	 }
	
}