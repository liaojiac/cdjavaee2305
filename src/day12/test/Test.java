package day12.test;

public class Test {
	public static void main(String[] args) {
		IUsb u = new Usbc("张三");
		u.xxx();
		IUsb x = new UsbDisk();
		x.xxx();
	}
}
