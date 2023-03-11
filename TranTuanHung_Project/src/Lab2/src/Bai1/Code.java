package Bai1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        System.out.println("Nhập vào số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = scanner.nextInt();
        
        
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
         
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
         
        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
         
        float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " + 
                decimalFormat.format(thuong));
        
        int phanDu = a % b;
        System.out.println(a + " % " + b + " = " + phanDu);
       
        System.out.println("Kết quả so sánh bằng 2 số " + a + " và " + 
                b + " là " + (a == b));
        System.out.println("Kết quả so sánh không bằng 2 số " + a + " và " + 
                b + " là " + (a != b));
        System.out.println("Kết quả so sánh lớn hơn 2 số " + a + " và " + 
                b + " là " + (a > b));
        System.out.println("Kết quả so sánh lớn hơn hoặc bằng 2 số " + a + " và " + 
                b + " là " + (a >= b));
        System.out.println("Kết quả so sánh nhỏ hơn 2 số " + a + " và " + 
                b + " là " + (a < b));
        System.out.println("Kết quả so sánh nhỏ hơn hoặc bằng 2 số " + a + " và " + 
                b + " là " + (a <= b));
    }
       
}
