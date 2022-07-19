import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(-5, 4, 13, -23, -65, 5, -2));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(7, 3, -3, -6, 5, 10, 8));

        ArrayList<Integer> res = mergeTwoArrayLists(l1, l2); // [4, 13, 5, 7, 3, 5, 10, 8]
        System.out.println(res);
    }

    public static ArrayList<Integer> mergeTwoArrayLists(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        // merge two lists and print positive values 
        // e.g 4,13,5 - list 1; 7,3,5,10,8 - list 2 
        // e.g 3,4,5,5,7,8,10,13 - new list 
        ArrayList<Integer> favNums = new ArrayList<>();
        favNums.addAll(l1);
        favNums.addAll(l2);
        favNums.removeIf(val -> val < 0);

        return favNums;
    }
}
