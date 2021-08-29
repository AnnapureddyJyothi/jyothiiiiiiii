package javaexamples;

public class Reverse_String {
	public static void main(String args[]) {
		String text = "jyothi";
		String reverse = "";
		for(int i = text.length()-1;i>=0;i--){
			reverse = reverse+text.charAt(i);
		System.out.println("Revesed string is;"+reverse);
		System.out.println("reverse completed");
		}
	}

}
