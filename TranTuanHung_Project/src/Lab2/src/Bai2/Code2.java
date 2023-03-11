package Bai2;

import java.util.Scanner;

public class Code2 {
	
    
    public static void main(String[] args) {
    	int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a:");
        a = scanner.nextInt();
        
        if (a % 2 == 0) {
            System.out.println(a + " là số chẵn!");
        } else {
            System.out.println(a + " là số lẻ");
        }
        scanner.close();
     }

}