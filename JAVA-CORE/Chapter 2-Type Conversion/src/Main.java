
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Implicit Casting (Ép kiểu rộng/ Ép kiểu không tường minh):
		// Chuyển từ kiểu có vùng lưu trữ nhỏ lên kiểu có vùng lưu trữ lớn hoặc về kiểu có cùng kiểu dữ liệu. Loại này không làm mất mát dữ liệu
		byte byteVar = 42;
		short shortVar = byteVar;
		int intVar = shortVar;
		long longVar = intVar;
		float floatVar = longVar;
		double doubleVar = floatVar;
		
		// Explicit Casting (Ép kiểu hẹp/ Ép kiểu tường minh).
		// Chuyển từ kiểu có vùng lưu trữ lớn về kiểu có vùng lưu trữ nhỏ. Loại này có thể làm mất mát dữ liệu.
		double doubleVar1 = 42.0d;
		float floatVar1 = (float) doubleVar1;
		long longVar1 = (long) floatVar1;
		int intVar1 = (int) longVar1;
		short shortVar1 = (short) intVar1;
		byte byteVar1 = (byte) shortVar1;

	}

}
