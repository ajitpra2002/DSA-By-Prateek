package V1;

import java.util.Vector;

/*
  Write a fizzbuzz function that returns a vector<string>
  with the numbers from 1 to n with the following restrictions:

for multiples of 3 store "Fizz" instead of the number

for multiples of 5 store "Buzz" instead of the number

for numbers which are multiples of both 3 and 5 store "FizzBuzz"
 */

public class Fizzbuzz {

	public static void main(String[] args) {
		System.out.println(fizzbuzz(15));

	}

	public static Vector<String> fizzbuzz(int size) {
		Vector<String> v1 = new Vector<String>();
		for (int i = 1; i <= size; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				v1.add("FizzBuzz");
				continue;
			}
			else if (i % 3 == 0) {
				v1.add("Fizz");
				continue;
			} else if (i % 5 == 0) {
				v1.add("Buzz");
				continue;
			}

			else {
				v1.add(Integer.toString(i));
			}
		}
		return v1;
	}
}
