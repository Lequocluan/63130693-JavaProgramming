/**
 * 
 */


import java.util.Scanner;
/**
 * 
 * 
 */
public class Lab1Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap chieu dai: ");
		int chieuDai=scanner.nextInt();
		System.out.print("nhap chieu rong: ");
		int chieuRong=scanner.nextInt();
		//tinh chu vi va dien tich rieng
		int chuVi = (chieuDai + chieuRong) * 2;
        int dienTich = chieuDai * chieuRong;
        
		System.out.println("chu vi hinh chu nhat la " + chuVi);
		System.out.println("dien tich hinh chu nhat la " + dienTich);
	}

}
