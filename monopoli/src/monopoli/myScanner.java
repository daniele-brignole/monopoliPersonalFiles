package monopoli;

import java.util.Scanner;

public class myScanner {
	private static myScanner instance = new myScanner();
	Scanner scan;
	   myScanner(){
	       scan = new Scanner(System.in);
	   }

	   //Get the only object available
	   public static myScanner getInstance(){
	      return instance;
	   }
	   public void read(){
		     
		   }
}