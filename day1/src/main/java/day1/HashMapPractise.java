package day1;
import java.util.HashMap;
public class HashMapPractise {
	public static void main(String args[]) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(1, 1);
		hm.put(2, 4);
		hm.put(3,9);
		for(int i:hm.keySet()) {
			System.out.println(hm.get(i));
		}
	}

}
