package test01;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        
        
        for (int num : initial_numbers) {
            numbers.add(num);
        }
        
        
        System.out.print("Enter your Student ID (e.g., 651234567): ");
        String studentId = scanner.next();
        
        
        int lastDigit = Character.getNumericValue(studentId.charAt(studentId.length() - 1));
        int secondLastDigit = Character.getNumericValue(studentId.charAt(studentId.length() - 2));
        int thirdLastDigit = Character.getNumericValue(studentId.charAt(studentId.length() - 3));
        
        
        System.out.print("Enter a number to add at the end: ");
        int numberToAddEnd = scanner.nextInt();
        numbers.add(numberToAddEnd);
        
        
        System.out.print("Enter a number to insert at index " + lastDigit + ": ");
        int numberToInsert = scanner.nextInt();
        
        if (lastDigit <= numbers.size()) {
            numbers.add(lastDigit, numberToInsert);
        }
        
        
        if (secondLastDigit < numbers.size()) {
            numbers.remove(secondLastDigit);
            System.out.println("Deleted element at index " + secondLastDigit);
        }
        
        
        System.out.print("Enter today's date (e.g., 20): ");
        int todayDate = scanner.nextInt();
        if (thirdLastDigit < numbers.size()) {
            numbers.set(thirdLastDigit, todayDate);
            System.out.println("Updated element at index " + thirdLastDigit + " to " + todayDate);
        }
        
        
        System.out.println("Final ArrayList: " + numbers);
        
        scanner.close();
    }
}
