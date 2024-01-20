/**
 * 
 */

import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
