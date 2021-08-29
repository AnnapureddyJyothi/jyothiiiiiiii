package javaexamples;
interface WebDriver {
  public void openapplication();
  public void closeapplication();
}
 public class FirefoxDriver implements WebDriver {
	public void openapplication() {
		System.out.println("Firefox open");
	}
	public void closeapplication() {
		System.out.println("Firefox close");
	}
	
}
class ChromeDriver implements WebDriver{
	public void openapplication() {
		System.out.println("Chrome open");
	}
	public void closeapplication() {
		System.out.println("Chrome close");
	}
	public static void main(String args[]) {
		WebDriver j = new ChromeDriver ();
		j.openapplication();
		j.closeapplication();
		WebDriver h = new FirefoxDriver();
		h.openapplication();
		h.closeapplication();
	}}
