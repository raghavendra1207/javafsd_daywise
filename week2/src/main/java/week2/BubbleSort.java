package week2;

import java.util.Arrays;

public class BubbleSort {
	

	public static void main(String[] args) {
		int[] arr1= {1,2,3,100,400,5,2};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					arr1[j]=arr1[j]^arr1[j+1];
					arr1[j+1]=arr1[j]^arr1[j+1];
					arr1[j]=arr1[j]^arr1[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
