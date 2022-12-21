package com.pack.soft;

public class Demo1 {

	public static void main(String[] args) {
		int a[]= {5,7,9,3,8};
		int sum=0;
		for (int i = 0; i <= a.length-1; i++) {
			sum=sum+a[i];
			
		}
		System.out.println("The sum of all item of an array is "+sum);
	}

}
