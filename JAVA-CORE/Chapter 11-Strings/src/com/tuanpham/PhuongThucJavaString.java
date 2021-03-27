package com.tuanpham;

public class PhuongThucJavaString {

	public static void Xuat(String[] strArr) {

		for (String item : strArr) {
			System.out.println(item);
		}
	}

	public static boolean CharAtExample(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 't') {
				return true;
			}
		}
		return false;
	}

	public static void CompareToExample(String[] strArr) {

		// return > 0 khi chuỗi truyền vào để so sánh lớn hơn chuỗi ban đầu: Giam dan
		// return == 0 khi hai chuỗi được coi là bằng nhau: Bang nhau
		// return < 0 khi chuỗi truyền vào để so sánh nhỏ hơn chuỗi ban đầu: Tang Dan

		// Sap xep giam dan
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				if (strArr[i].compareTo(strArr[j]) > 0) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}

		Xuat(strArr);
	}

	public static String ConcatExample(String str1, String str2) {
		// Noi 2 chuoi voi nhau
		return str1.concat(" " + str2);
	}
}
