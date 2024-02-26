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
		scan.close();
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
		scan.close();
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
		sc.close();
	}
	public static void Menu() {
		int chon;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("+-------------------------------+");
			System.out.println("1. GIAI PHUONG TRINH BAC NHAT");
			System.out.println("2. GIAI PHUONG TRINH BAC HAI");
			System.out.println("3. TINH TIEN DIEN");
			System.out.println("4. THOAT");
			System.out.println("+-------------------------------+");
	        System.out.print("Ban chon: ");
	        chon = sc.nextInt();
	        switch (chon) {
            case 1:
                giaiPTB1();
                break;
            case 2:
                giaiPTB2();
                break;
            case 3:
                tinhTienDien();
                break;
            case 4:
                System.out.println("Ket thuc");
                break;
            default:
                System.out.println("Loi! Vui long chon lai");
        }
    } while (chon < 1 || chon > 4);
			sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}

}
