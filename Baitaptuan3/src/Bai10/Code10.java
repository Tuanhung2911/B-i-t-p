package Bai10;

import java.util.Scanner;

public class Code10 {
	public static void main(String[] args) {
	    String chuoi;
	    char kyTu = 'h';
	    int count = 0;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào chuỗi bất kỳ: ");
	    chuoi = scanner.nextLine();
	         
	    for (int i = 0; i < chuoi.length(); i++) {
	        if (chuoi.charAt(i) == kyTu) {
	            count++;
	        }
	    }
	         
	    System.out.println("Số lần xuất hiện của ký tự " + kyTu +
	        " trong chuỗi " + chuoi + " = " + count);
	}

}
