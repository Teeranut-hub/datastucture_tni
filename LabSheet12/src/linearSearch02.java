import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class linearSearch02 {   
 
    public static void main(String[] args) {
        LinkedList<Integer> nums = random_initial();

        System.out.print("Elements : ");
        for (int value : nums) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = linearSearch(nums, target);
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

    public static int linearSearch(LinkedList<Integer> nums, int target) {
        int index = 0;
        for (int value : nums) { 
            if (value == target) {
                return index;
            }
            index++;
        }
        return -1;
    }
}