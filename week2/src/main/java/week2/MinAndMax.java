package week2;

public class MinAndMax {
	
	public static void main(String args[]) {
		int arr[]= {9,12,12,98,100,129,6};
		int min1=arr[0],max1=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min1) {
				min1=arr[i];
			}
			else if(arr[i]>max1) {
				max1=arr[i];
			}
		}
		System.out.println("Minimum element is: "+min1+"\nMaximum element is: "+max1);
		
	}

}
