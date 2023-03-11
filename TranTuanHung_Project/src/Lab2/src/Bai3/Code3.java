package Bai3;

import java.util.Scanner;

public class Code3 {
	public static void main(String[] args) {
        int year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào năm sinh: ");
        year = scanner.nextInt();
         
        int a = 2023 - year;  
        if (a < 16) {
            ageGroup = "tuổi vị thành niên.";
        } else if (a >= 18) {
            ageGroup = "già";
        } else {
            ageGroup = "tuổi trưởng thành!";
        }
         
        System.out.println("Bạn " + name + " thuộc nhóm " + ageGroup);
	}
}
