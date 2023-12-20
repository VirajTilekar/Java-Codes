import java.util.*;
public class LinearSearch {

    static int linearSearch(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int val = input.nextInt();

        int result = linearSearch(arr, val);

        if (result == -1) {
            System.out.println("not found");
        }
        else {
            System.out.println(result);
        }
    }
}