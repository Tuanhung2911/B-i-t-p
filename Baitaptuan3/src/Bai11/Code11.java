package Bai11;

import java.util.Scanner;

public class Code11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhap so phan tu cua mang: ");
			n = scanner.nextInt();

		}while(n < 0);
		int A[] = new int [n];
		System.out.println("Nhap cac phan tu cua mang: ");
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Nhap phan tu thu " + i + " : ");
			A[i] = scanner.nextInt();
		}
		System.out.println("Mang ban dau la: ");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(A[i]);
		}
		int tg;
		for(int i = 0 ; i < n -1 ; i++) {
			for(int j = i + 1 ; j < n ; j++) {
				if(A[i] > A[j]) {
					tg = A[i];
					A[i] = A[j];
					A[j] = tg;
				}
			}
		}
		System.out.println("Mang da sap xep theo thu tu tang dan la: ");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(A[i]);
		}
	}

}
