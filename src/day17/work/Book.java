package day17.work;

public class Book {
	private String bookName;
	private String bookKind;
	private int  bookprice;
	
	public Book(String bookName, String bookKind, int bookprice) {
		this.bookName = bookName;
		this.bookKind = bookKind;
		this.bookprice = bookprice;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookKind() {
		return bookKind;
	}
	public void setBookKind(String bookKind) {
		this.bookKind = bookKind;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookKind=" + bookKind + ", bookprice=" + bookprice + "]";
	}
	
}
