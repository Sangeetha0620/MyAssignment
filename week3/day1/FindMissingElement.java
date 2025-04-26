package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 4,3,2,8, 6, 7};
		Arrays.sort(a);
		for (int i=0; i<a.length; i++) {
			int num = a[0] + i;
			if (a[i]!=num) {
				System.out.println("Missing number is :" + num);
				break;
			}
		}
		

	}

}
