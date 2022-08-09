import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		int i=1;
		int n=5;
		int j=1;
		int k=1;
		for(i=1;i<=5;i++) {

			for(j=1;j<=i;j++) {
				System.out.print(k++);
				System.out.print(" ");
			}
			System.out.println(" ");
		}


	}


}
/* out put :
1  
2 3  
4 5 6  
7 8 9 10  
11 12 13 14 15 */
