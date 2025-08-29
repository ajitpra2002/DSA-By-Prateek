package V1;
import java.util.Collections;
// to using fill constructor
import java.util.Vector;

public class VectorImp02 {

    public static void main(String[] args) {
        // Fill Constructor equivalent: 10 elements, all 7
        Vector<Integer> arr = new Vector<>(Collections.nCopies(10, 7));

        // Another "visited" array of 100 elements, all 0
        Vector<Integer> visited = new Vector<>(Collections.nCopies(100, 0));

        // Pop_back equivalent → remove last element
        arr.remove(arr.size() - 1);

        // Push_back equivalent → add at end
        arr.add(16);

        // Print all elements
        for (int x : arr) {
            System.out.print(x + ",");
        
    }
}
}
