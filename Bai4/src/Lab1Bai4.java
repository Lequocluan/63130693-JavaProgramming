/**
 * 
 */

import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("phương trình bậc 2");
		System.out.print("nhập hệ số a: ");
		int a =  scanner.nextInt();
		System.out.print("nhập hệ số b: ");
		int b =  scanner.nextInt();
		System.out.print("nhập hệ số c: ");
		int c =  scanner.nextInt();
		
		//khai báo delta
		double delta = Math.pow(b, 2)-4*a*c;
		if(delta<0) {
			System.out.println("delta < 0( ptvn)");
		}else {
			System.out.println("căn bậc 2 delta bằng " + Math.sqrt(delta));
		}
	}

}
