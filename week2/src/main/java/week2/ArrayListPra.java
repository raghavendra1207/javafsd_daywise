package week2;

import java.util.ArrayList;
public class ArrayListPra {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(5);
		al.add(3);
		
		al.add(100);
		
		System.out.println(al.toString());
		al.remove(0);
		System.out.println(al.toString());
	}

}
