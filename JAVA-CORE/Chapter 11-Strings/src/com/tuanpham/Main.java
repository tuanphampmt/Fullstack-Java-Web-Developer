package com.tuanpham;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = { 't', 'u', 'a', 'n', 'p', 'h', 'a', 'm' };
		String string = new String(c);
		System.out.println(string); // tuanpham
		String s1 = "welcome"; 
		String s2 =new String("Welcome"); 
		String[] strArr = {"Tuan", "Vu", "Bin", "Nguyen", "Huyen", "Cong"};
		
		// CharAtExample
		if(PhuongThucJavaString.CharAtExample(string)) {
			System.out.println("Chao Ban, Minh La Tuan day");
		}else {
			System.out.println("Minh Khong phai la tuan");
		}
		
		//CompareToExample
		System.out.println("-----------");
		System.out.println("Sap xep giam dan:");
		PhuongThucJavaString.CompareToExample(strArr);
		
		// ConcatExample
		System.out.println("-----------");
		System.out.println("Noi 2 chuoi voi nhau:");
		System.out.println(PhuongThucJavaString.ConcatExample(s2, string));
	}
	

}
