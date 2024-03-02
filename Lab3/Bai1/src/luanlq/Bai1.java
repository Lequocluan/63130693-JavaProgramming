package luanlq;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap 1 so de kiem tra nguyen to: ");
		int n = sc.nextInt();
		sc.nextLine();
		boolean laSNT = true;
		
		if(n<=1) {
			laSNT = false;
		}else {
			for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				laSNT = false;
				break;
			}
		}
	}
		if(!laSNT) {
			System.out.print("so "+ n+"khong phai la so nguyen to");
		}else {
			System.out.print("so "+ n+ "la so nguyen to");
		}
	}

}
