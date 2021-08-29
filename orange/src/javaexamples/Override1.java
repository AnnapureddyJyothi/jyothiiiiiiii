package javaexamples;

public class Override1 extends Override{
	public void  add(int a,int b) {
		System.out.println("a-b");
	}
	public static void main(String args) {
		Override1 obj1 = new Override1();
		obj1.add(10,20);
		obj1.add(10, 20);
		
	}

}
