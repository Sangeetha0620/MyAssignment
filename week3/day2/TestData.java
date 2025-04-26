package week3.day2;

public class TestData {

 public void  enterCredentials() {
	 System.out.println("Creadentials entered");

	}
 public void navigateToHomePage() {
	 System.out.println("Navigated t home page");
 }
public static void main(String[] args) {
	LoginTestData LTD = new LoginTestData();
	LTD.enterCredentials();
	LTD.enterUsername();
	LTD.enterPassword();
	LTD.navigateToHomePage();
}
}
//sub class

 class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("Entered Username");
	}
	
	public void enterPassword() {
		System.out.println("Entered Password");
	}
}
 
 
