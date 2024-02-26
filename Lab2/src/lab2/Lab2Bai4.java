/**
 * 
 */
package lab2;

import java.util.Scanner;

/**
 * 
 */
public class Lab2Bai4 {

	/**
	 * @param args
	 */
	public static void giaiPTB1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("phương trình bậc nhất");
		System.out.print("nhập hệ số a: ");
		int a =  scan.nextInt();
		System.out.print("nhập hệ số b: ");
		int b =  scan.nextInt();
		
		if(a==0) {
			if(b==0) {
				System.out.print("phuong trinh vo so nghiem!");
			}else {
				System.out.print("phuong trinh vo nghiem!");
			}
		}else {
			System.out.println("phuong trinh co nghiem: " + (float)-b/a);
		}
	}
	public static void giaiPTB2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("phương trình bậc hai");
		System.out.print("nhập hệ số a: ");
		int a =  scan.nextInt();
		System.out.print("nhập hệ số b: ");
		int b =  scan.nextInt();
		System.out.print("nhập hệ số c: ");
		int c =  scan.nextInt();
		
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.print("phuong trinh vo so nghiem!");
				}else {
					System.out.print("phuong trinh vo nghiem!");
				}
			}else {
				System.out.println("phuong trinh co nghiem: " + (float)-c/b);
			}
		}
		else {
			double delta = Math.pow(b, 2)-4*a*c;
			if(delta<0) {
				System.out.println("phuong trinh vo nghiem");
			}else {
				if(delta==0) {
					System.out.println("phuong trinh co nghiem kep x =" + -b/(2*a));
				}else {
					System.out.println("phuong trinh co nghiem X1 = " + (-b+Math.sqrt(delta))/(2*a)+ " X2 = " + (-b-Math.sqrt(delta))/(2*a));
				}
			}
		}
	}
	public static void tinhTienDien() {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
