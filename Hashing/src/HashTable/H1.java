package HashTable;

import java.util.Hashtable;
import java.util.Scanner;

public class H1 {
	public static void main(String[] args) {
			Hashtable<String, Integer> h=new Hashtable<String, Integer>();
			h.put("maggi", 100);
			h.put("coldring", 150);
			h.put("coffies", 60);
			h.put("pizza", 250);
			h.put("Dosa", 200);
			h.put("apple", 500);
			
			
			System.out.println("hi");
			Scanner sc=new Scanner(System.in);
			String item=sc.nextLine();
			//for read the item it will take O(1) time complexity
			//Read operation
			if(h.containsKey(item)) {
				System.out.println("the price of "+ item +" is "+ h.get("maggi"));
			}
			else {
				System.out.println(item+" is not available");
			}
			//delete operaation item it will take O(1) time complexity
			
			//for update 
			h.put("coldring", h.get("coldring")+1);

			System.out.println(h);
			
	}
}
