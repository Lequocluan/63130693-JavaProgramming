/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập cạnh của khối lập phương: ");
		int canh = scanner.nextInt();
		System.out.println("diện tích của khối lập phương là: " + canh*canh*canh);
		int dienTich= (int)Math.pow(canh, 3);
		System.out.println("diện tích của khối lập phương( dùng hàm) là: " + dienTich);
	}

}
