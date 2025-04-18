package week2.day1;

public class Library {
	public String addBook(String Shakespeare) {
		System.out.println( "Book added successfully"+" "+Shakespeare);
		return Shakespeare;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library bookStore = new Library();
bookStore.addBook("Shakespeare");
bookStore.issueBook();
	}

}
