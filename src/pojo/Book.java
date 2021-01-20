package pojo;

public class Book 
{
	String bookName,bookSubject,authorName;
	int pageNo,price,bookId;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookSubject() {
		return bookSubject;
	}
	public void setBookSubject(String bookSubject) {
		this.bookSubject = bookSubject;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "Book [bookName=" + bookName + ", bookSubject=" + bookSubject + ", authorName=" + authorName
				+ ", pageNo=" + pageNo + ", price=" + price + ", bookId=" + bookId + "]";
	}
	
}
	

