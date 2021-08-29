package javaexamples;
class Grandparent{
	String name ="venkatReddy";
	String surname ="Annapureddy";
	
	void grandperentinfo(){
		System.out.println("name of the grandparent"+name);
		System.out.println("surename of the grandparent"+surname);
	}
}
class Parent extends Grandparent{
	String name ="Srinivasulu";
	
	void parentinfo() {
		System.out.println("name of the parent"+name);
		System.out.println("surename of the parent"+surname);
	}
}
class Child extends Parent{
	String name ="Jyothi";
	
	void childinfo() {
	System.out.println("name of the child"+name);
	System.out.println("surename of the child"+surname);
}}
public class D {

	public static void main(String[] args) {
	  Child j = new Child();
	  j.grandperentinfo();
	  j.parentinfo();
	  j.childinfo();

	}

}
