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
		System.out.print("nhập chiều dài: ");
		int chieuDai=scanner.nextInt();
		System.out.print("nhập chiều rộng: ");
		int chieuRong=scanner.nextInt();
		//tinh chu vi va dien tich rieng
		int chuVi = (chieuDai + chieuRong) * 2;
        int dienTich = chieuDai * chieuRong;
        
		System.out.println("chu vi của hình chữ nhật là: " + chuVi);
		System.out.println("diện tích của hình chữ nhật là: " + dienTich);
		
		int canhNho = Math.min(chieuDai, chieuRong);
		System.out.println("cạnh nhỏ nhất là cạnh có độ dài bằng " + canhNho);
	}

}
