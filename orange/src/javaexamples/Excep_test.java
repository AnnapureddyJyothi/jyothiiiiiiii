package javaexamples;

public class Excep_test {
	public static void main(String args[]) 
	{ 
		try {
			int b = 10/0;
			System.out.println(b);
		}catch(Exception e) {
			System.out.println("Exception throw:"+e);
		}
		System.out.println("Out of the block");
	}
		
	}


