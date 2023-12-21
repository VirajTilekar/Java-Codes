import java.util.*;
public class BinarySearch {

    static int binarySearch(int[] arr, int val) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == val) {
                return mid;
            }
            else if (arr[mid] < val) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int val = input.nextInt();
        int result = binarySearch(arr, val);
        if (result == -1) {
            System.out.println("not found");
        } 
        else {
            System.out.println(result);
        }
    }
    
}