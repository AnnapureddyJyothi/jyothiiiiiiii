package javaexamples;
abstract class Bank{
	abstract void credit();
	abstract void debit();
}
class HDFC extends Bank {
	void credit() {
		System.out.println("ammount credit from HDFC");
	}
	void debit() {
		System.out.println("ammount debit from HdFC");
	}
}
class ICICI extends Bank {
	void credit() {
		System.out.println("ammount credit from ICICI");
	}
	void debit() {
		System.out.println("ammount debit from ICICi");
	}
}
public class Test_Bank {
	public static void main(String args[]) {
	HDFC j = new HDFC();
	j.credit();
	j.debit();
	ICICI h =new ICICI();
	h.credit();
	h.debit();

}}
