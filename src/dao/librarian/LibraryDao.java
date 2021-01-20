package dao.librarian;
import pojo.Book;
public interface LibraryDao 
{
	public boolean addBook(Book b);
	public void getAllBook();
	public Book searchByBookName(String bookName);
	public Book searchByAuthorName(String authorName);
	
	
	
}
