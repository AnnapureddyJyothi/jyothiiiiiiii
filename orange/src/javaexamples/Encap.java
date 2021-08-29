package javaexamples;

public class Encap {
	//variable-data
	private String name ="jyothi";
	private int age = 23;
	//method
	public void talk() {
		System.out.println("Hello,i am"+name);
		System.out.println("My age is"+age);
	}public static void main(String args[]) {
		Encap p = new Encap();
	    p.talk();
	}

}
