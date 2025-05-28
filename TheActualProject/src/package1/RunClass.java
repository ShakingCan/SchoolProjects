package package1;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class RunClass extends Object {
	 
	public static void main(String[] args) {
		 final String NON = "\u001B[0m";
		 
		 int input;
		Scanner scan = new Scanner(System.in);
		do {
			try {
				Premiumstatus();
				Standardstatus();
				Recurse();
				
				}
		
			catch(InputMismatchException e) {
				System.out.println("The instruction clearly says numbers");
				scan.nextLine();
			}
			System.out.println("");
		} while(true);
		
	}
	}
