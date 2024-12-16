package inNeoronClass;
import java.util.Scanner;

public class Class_02 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
				}
			System.out.println();
			}
		

		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==n-1 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			
			}
			System.out.println();
		}

	}

}
