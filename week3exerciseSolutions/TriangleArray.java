package week3exerciseSolutions;

public class TriangleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int a[][] = new int[4][4];
       for(int i=0;i<a.length;i++) {            // i= 0.1.2.3
    	   for(int j=0;j<i;j++) {               // j= 0.0,1.0,1,2.
    	   a[i][j] = num;                      // n= 1.2,3.4,5,6
    	   num += 1;
    	  }
    }
  	 System.out.println("Array a");
	 for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<i;j++) {
    	  System.out.print(a[i][j]+"  ");
      }
    	  System.out.println();
	 }
   }
}