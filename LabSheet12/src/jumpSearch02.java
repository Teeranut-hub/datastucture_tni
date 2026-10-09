import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class jumpSearch02 {

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

        int result = jumpSearch(nums, target);
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
 
    public static int jumpSearch(LinkedList<Integer> nums, int target) {
        int n = nums.size();
        if (n == 0) {
            return -1;
        }

        int jump = (int) Math.sqrt(n); 
        int step = jump;
        int prev = 0;

   
        while (nums.get(Math.min(step, n) - 1) < target) {
            prev = step;
            step += jump;
            if (prev >= n) {
                return -1;
            }
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            int value = nums.get(i);
            if (value == target) {
                return i;
            }
            if (value > target) {
                break;
            }
        }
        return -1;
    }

}