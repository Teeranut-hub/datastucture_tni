import java.util.LinkedList;
import java.util.Queue;

public class QueueFirstFive {
    public static void main(String[] args) {
        Queue<Integer> n_queue = new LinkedList<>();
        

        for (int i = 101; i <= 110; i++) {
            n_queue.add(i);
        }
        System.out.println("Queue => " + n_queue);
        
        int size = n_queue.size();
        for (int i = 0; i < size; i++) {
            int currentQueue = n_queue.poll();
            if (i < 5) {
                System.out.println(currentQueue);
            }
            n_queue.add(currentQueue);
        }
        

        System.out.println("Queue => " + n_queue);
    }
}