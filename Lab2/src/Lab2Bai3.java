/**
 * 
 */

import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soDien;
		do {
			System.out.print("nhap so dien su dung > 0: ");
			 soDien = sc.nextInt();
		}while(soDien<0);
		if(soDien<50) {
			System.out.println("so tien la: "+soDien*1000);
		}else {
			System.out.println("so tien la: "+(50*1000 + (soDien-50)*1200));
		}
	}

}
