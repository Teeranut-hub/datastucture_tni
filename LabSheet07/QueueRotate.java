import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {
    static Queue<Integer> queue = new LinkedList<>();

    public static void originalQueue() {
        for (int i = 101; i <= 107; i++) {
            queue.add(i);
        }
        System.out.println("Queue => " + queue);
    }

    public static void rotateQueue() {
        if (!queue.isEmpty()) {
            int front = queue.poll();
            System.out.println("Calling queue: " + front);
            queue.add(front);
        }
        System.out.println("Queue => " + queue);
    }

    public static void main(String[] args) {
        originalQueue();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("\nPress 1 to rotate queue: ");
            String input = sc.nextLine();
            
            if (input.equals("1")) {
                rotateQueue();
            } else {
                System.out.println("Exit");
                break;
            }
        }
        sc.close();
    }
}