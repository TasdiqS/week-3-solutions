package week3exerciseSolutions;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to check if it is Prime number or not.");
     Scanner s=new Scanner(System.in);
     int i = s.nextInt();
     s.close();
     if(i%2==0) {
    	 System.out.println(i+" is a Prime number.");
     }
     else {
    	 System.out.println(i+" is NOT a Prime number."); 
     }
	}

}
