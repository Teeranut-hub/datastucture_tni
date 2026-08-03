import java.sql.Struct;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some message: ");
        String message = input.next();
        //ข้อ2 ผลลัพธฺทั้งสองอันต้องเหมือนกัน
        System.out.println();
        System.out.println("Check Palindrome by Deque = "
                + (checkByDeque(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Check Palindrome by Stack = "
                + (checkByStack(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));

    }

    public static boolean checkByDeque(String message) {
        Deque<Character> letters = new ArrayDeque<Character>();

        // write your code below here
        String cleanedMessage = message.toLowerCase();
        for (char c : cleanedMessage.toCharArray()) {
            letters.addLast(c);
        }

        while (letters.size() > 1) {
            char first = letters.removeFirst();
            char last = letters.removeLast();
            if (first != last) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkByStack(String message) {
        Queue<Character> queue = new ArrayDeque<Character>();
        Deque<Character> stack = new ArrayDeque<Character>();

        // write your code below here
        String cleanedMessage = message.toLowerCase();
        for (char c : cleanedMessage.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        while (!queue.isEmpty()) {
            char first = queue.poll();
            char last = stack.pop();
            if (first != last) {
                return false;
            }
        }

        return true;
    }
}