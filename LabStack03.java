import java.util.Scanner;
import java.util.Stack;

public class LabStack03 {
    public static Stack<String> history = new Stack<String>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Press 1: Visit a new website");
        System.out.println("Press 2: See the previous website");
        System.out.println("Press 3: Visit the previous website");
        System.out.println("Press 4: Clear History");

        while (true) {
            System.out.print("\nEnter an option: ");
            int option = input.nextInt();
            
            if (option == 1) visitNewWeb();
            else if (option == 2) seePreviousWeb();
            else if (option == 3) visitPreviousWeb();
            else if (option == 4) clearHistory();
            else {
                System.out.println("Exit");
                break;
            }
        }
    }

    public static void visitNewWeb() {
        System.out.print("Enter a website name: ");
        String website = input.next(); 
        history.push(website); 
        System.out.println("Current History => " + history); 
    }

    public static void seePreviousWeb() {
        if (!history.isEmpty()) {

            System.out.println("Previous website: " + history.peek());
        } else {
            System.out.println("No website in history.");
        }
        System.out.println("Current History => " + history);
    }

    public static void visitPreviousWeb() {
        if (!history.isEmpty()) {

            System.out.println("Visit: " + history.pop());
        } else {
             System.out.println("No website in history.");
        }
        System.out.println("Current History => " + history);
    }

    public static void clearHistory() {

        history.clear();
        System.out.println("Current History => " + history);
    }
}