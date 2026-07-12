package test01;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // สร้าง ArrayList และ Array ตามโจทย์
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        
        // 1. นำตัวเลขทั้งหมดใน initial_numbers เก็บไว้ใน numbers
        for (int num : initial_numbers) {
            numbers.add(num);
        }
        
        // รับค่ารหัสนักศึกษาเพื่อใช้หาตำแหน่ง
        System.out.print("Enter your Student ID (e.g., 651234567): ");
        String studentId = scanner.next();
        
        // หาตัวเลขจากรหัสนักศึกษา
        int lastDigit = Character.getNumericValue(studentId.charAt(studentId.length() - 1));
        int secondLastDigit = Character.getNumericValue(studentId.charAt(studentId.length() - 2));
        int thirdLastDigit = Character.getNumericValue(studentId.charAt(studentId.length() - 3));
        
        // 2. รับค่าตัวเลขเพิ่มต่อท้าย
        System.out.print("Enter a number to add at the end: ");
        int numberToAddEnd = scanner.nextInt();
        numbers.add(numberToAddEnd);
        
        // 3. รับค่าตัวเลขเพื่อแทรกตามเลขสุดท้ายของรหัสนักศึกษา
        System.out.print("Enter a number to insert at index " + lastDigit + ": ");
        int numberToInsert = scanner.nextInt();
        // ป้องกัน Error กรณี index เกินขนาด
        if (lastDigit <= numbers.size()) {
            numbers.add(lastDigit, numberToInsert);
        }
        
        // 4. ลบข้อมูลตามเลขรองสุดท้ายของรหัสนักศึกษา
        if (secondLastDigit < numbers.size()) {
            numbers.remove(secondLastDigit);
            System.out.println("Deleted element at index " + secondLastDigit);
        }
        
        // 5. อัปเดตตัวเลขตามตำแหน่งเลขก่อนรองสุดท้าย เป็นวันที่เรียน
        System.out.print("Enter today's date (e.g., 20): ");
        int todayDate = scanner.nextInt();
        if (thirdLastDigit < numbers.size()) {
            numbers.set(thirdLastDigit, todayDate);
            System.out.println("Updated element at index " + thirdLastDigit + " to " + todayDate);
        }
        
        // 6. แสดงผลสุดท้าย
        System.out.println("Final ArrayList: " + numbers);
        
        scanner.close();
    }
}
