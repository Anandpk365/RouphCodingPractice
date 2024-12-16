package inNeoronClass;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++) {
			int n = sc.nextInt();
			a[i]=n;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		Arrays.sort(a);
//		Arrays.sort(a,2,5);
		
//		Arrays.fill(a, 3, 5, 7);
		int ind = Arrays.binarySearch(a, 4);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.print(ind);

	}

}
