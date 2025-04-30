package week1.day2;

public class Library {
	String addBook(String bookTitle) {
		System.out.println("Book added Successfully");
		return bookTitle;
	}
	void issueBook() {
		System.out.println("Book issued Successfully");
	}
	public static void main(String[] args) {
		Library L=new Library();
		L.addBook("Ramayana");
		L.issueBook();

	}

}
