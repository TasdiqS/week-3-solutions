package week3exerciseSolutions;

public class DisplayNumberMatrix10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int a[][] = new int[4][4];
       for(int i=0;i<a.length;i++) {
    	   for(int j=0;j<a[i].length;j++) {
    	   a[i][j] = num;
    	   num += 1;
    	  }
    }
  	 System.out.println("Array a");
	 for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<a[i].length;j++) {
    	  System.out.print(a[i][j]+"  ");
      }
    	  System.out.println();
	 }
   }
}
