/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method tub
		Scanner scanner=new Scanner(System.in);
		System.out.print("họ và tên: ");
		String hoTen= scanner.nextLine();
		System.out.print("điểm trung bình: ");
		double dtb= scanner.nextDouble();
		System.out.printf("%s %f điểm", hoTen, dtb);
	}

}
