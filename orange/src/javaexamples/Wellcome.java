package javaexamples;

public class Wellcome {
	public void m1() {
		System.out.println("m1 executed");
	}
	public void m2() {
		System.out.println("m2 executed");
	}
	public void m3() {
		System.out.println("m3 executed");
	}
	public static void main(String args[]) {
		System.out.println("Wellcome to java");
		Wellcome m = new Wellcome();
		m.m1();//Accessing method by using object
		m.m2();
		m.m3();
	}

}
