package javaexamples;

public class DT_VARABLE {
	int b = 20;
	static int empid = 101;
	public void m1() {
		int a = 10;
		System.out.println("m1 executed ");
		System.out.println("Local varible"+a);
	}public void m2() {
		System.out.println("m2 executed ");
		System.out.println("instance varible"+b);
		System.out.println("Static variable"+empid);
	}public void m3() {
		System.out.println("m3 executed ");
		System.out.println("instance varible"+b);
		System.out.println("Static variable"+empid);
	}
	public static void st() {
		System.out.println("Static method executeg");
	}
	public static void main(String args[]) {
		System.out.println("main metod executed");
		DT_VARABLE m = new DT_VARABLE();
		m.m1();
		m.m2();
		m.m3();
		
	}
	
	

}
