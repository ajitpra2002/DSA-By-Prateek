package V1;

import java.util.Vector;

public class VectorImp01 {
	public static void main(String[] args) {
		Vector<Integer> arr = new Vector<Integer>();
		arr.add(10);
		arr.add(2);
		arr.add(5);
		arr.add(50);
		System.out.println(arr.size());
		arr.addLast(50);
		arr.add(100);
		arr.add(10);
		arr.add(10);
		arr.add(2);
		arr.add(5);
		arr.add(50);
		System.out.println("size increses after 10 values");
		System.out.println(arr.capacity());
		arr.add(10);
		arr.add(2);
		arr.add(5);
		arr.add(50);
		System.out.println(arr.size());
		arr.addLast(50);
		arr.add(100);
		arr.add(10);
		arr.add(10);
		arr.add(2);
		arr.add(5);
		arr.add(50);
		System.out.println("size increses after 20 values");
		System.out.println(arr.size());
		System.out.println(arr.capacity());

		
		//to print all element
		for(Integer i:arr)
		{
			System.out.println(i);
		}
	}

}
