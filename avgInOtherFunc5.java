package week3exerciseSolutions;
import java.util.Scanner;
public class avgInOtherFunc5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new average().avg();
		new average().avg(100);
		int num=average.avg(100);
		System.out.println(num);
		System.out.println("enter two values to find out the average");
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		new average().avg(a,b);
		int value=average.avg(a,b);
		System.out.println(value);
	}
}

class average{
	   void avg() {
		  int x=(100+100)/2;
			System.out.println(x);
	   }
	   static int avg(int y) {
		   y=(y+200)/2;
		   return y;
	   }
	  static int avg(int a, int b) {
		   int res=(a+b)/2;
		   return res;
	   }
  }
