package Set;

import java.util.HashSet;

public class Q1 {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(1000);
		set.add(80);
		if(set.contains(300)) {// it will take O(1) time
			System.out.println(true);
		}
		else {
			System.out.println("false");
		}
		
	}

}
