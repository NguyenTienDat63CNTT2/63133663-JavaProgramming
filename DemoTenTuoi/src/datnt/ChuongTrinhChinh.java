package datnt;

import java.util.Calendar;
import java.util.Scanner;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen;
		int namSinh;
		
		//Chuẩn bị nhập
		Scanner banPhim = new Scanner(System.in);
		// Lấy đối tượng Calendar hiện tại
		Calendar calendar = Calendar.getInstance();
		// Lấy năm hiện tại
		int year = calendar.get(Calendar.YEAR);
		
		System.out.print("Họ và tên: ");
		hoTen = banPhim.nextLine();
		
		System.out.print("Năm sinh: ");
		namSinh = banPhim.nextInt();
		
		int tuoi = year - namSinh + 1;
		System.out.printf("%s năm nay %d tuổi",hoTen,tuoi);
		
		banPhim.close();

	}

}
