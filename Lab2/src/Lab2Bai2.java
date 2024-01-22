/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Lab2Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			}
		}
	}

}
