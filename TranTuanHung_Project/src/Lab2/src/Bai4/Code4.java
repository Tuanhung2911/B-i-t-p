package Bai4;

import java.util.Scanner;

public class Code4 {
	public static void main(String[] args) {
        int n;
        String Monthofyear = "";  
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số nguyên (từ 1 đến 12): ");
        n = scanner.nextInt();
        if (1<= n && n <= 12) {
            System.out.println("Tháng " + n);
        } else {
        	System.out.println("Không có tháng");
        }

        }
    }
