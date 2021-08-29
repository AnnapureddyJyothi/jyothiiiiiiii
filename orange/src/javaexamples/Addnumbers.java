package javaexamples;
import java.util.Scanner;
public class Addnumbers {
	public static void main(String args[]) {
		int X,Y,Z;
		System.out.println("enter two integes to calculate their sum");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		X = in.nextInt();
		Y = in.nextInt();
		Z = X+Y;
		System.out.println("Sum of entered integers = "+Z);
		
		
	}

}
