import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class binarySearch02 {

    public static void main(String[] args) {
        LinkedList<Integer> nums = random_initial();
      
        nums.sort((a, b) -> {
            return a.compareTo(b);
        });

        System.out.print("Elements after sorting: : ");
        for (int value : nums) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = binarySearch(nums, target);
        if (result != -1) {
            System.out.println("The target (" + target + ") at index " + result);
        } else {
            System.err.println("Cannot found " + target + " in this linked list");
        }
        sc.close();
    }
    public static LinkedList<Integer> random_initial() {
        Random rnd = new Random();
        LinkedList<Integer> nums = new LinkedList<Integer>();
        while (nums.size() < 10) {
            nums.add(rnd.nextInt(99)); 
        }
        return nums;
    }    
    
    public static int binarySearch(LinkedList<Integer> nums, int target) {
        int low = 0;
        int high = nums.size() - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int midValue = nums.get(middle);

            if (midValue == target) {
                return middle;
            } else if (midValue < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

  
}