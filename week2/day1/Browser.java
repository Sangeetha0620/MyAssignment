package week2.day1;

public class Browser {
	public String launchBowser(String Amazon) {
		System.out.println("Browser launched successfully"+" "+ Amazon);
		return Amazon; 
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
		
	}

	public static void main(String[] args) {
		Browser googleChrome = new Browser();
		googleChrome.launchBowser("Amazon");
		googleChrome.loadUrl();
		

	}

}
