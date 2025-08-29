package V1;

import java.util.Arrays;
// to using fill constructor
import java.util.Vector;

public class Vector2DArray03 {

	public static void main(String[] args) {
		Vector<Vector<Integer>> arr = new Vector<Vector<Integer>>();
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(4);
		v2.add(5);
		v2.add(6);
		Vector<Integer> v3 = new Vector<Integer>();
		v3.add(7);
		v3.add(8);
		v3.add(9);
		v3.add(10);
		Vector<Integer> v4 = new Vector<Integer>();
		v4.add(11);
		v4.add(12);
		arr.add(v1);
		arr.add(v2);
		arr.add(v3);
		arr.add(v4);
		System.out.println(arr);
		for (Vector<Integer> v : arr) {
//			System.out.println(v);
		}
test();
	}
//2nd way to use 2D vector
	
	public static void test() {
		Vector<Vector<Integer>> arr = new Vector<Vector<Integer>>();
		arr.add(new Vector<Integer>(Arrays.asList(1,2,3)));
		arr.add(new Vector<Integer>(Arrays.asList(4,5,6)));
		arr.add(new Vector<Integer>(Arrays.asList(7,8,9,10)));
		arr.add(new Vector<Integer>(Arrays.asList(11,12)));
		System.out.println("from test method");
		for (Vector<Integer> v : arr) {
			System.out.println(v);
		}

	}

}
