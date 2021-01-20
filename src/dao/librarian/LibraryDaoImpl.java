package dao.librarian;
import java.util.ArrayList;
import java.util.Iterator;

import pojo.Book;
public class LibraryDaoImpl implements LibraryDao
{
	ArrayList<Book> al=new ArrayList<>();
	
	boolean status=false;
	
	public boolean addBook(Book b) 
	{
		if(b.getBookId()!=0)
		{
			al.add(b);
			status=true;	
		}
		else
		{
			status=false;
		}
		
		return status;
	}

	@Override
	public void getAllBook() 
	{
		System.out.println("Bookid\t BookName\t AuthorName \t BookSubject \t PageNo \t Price");
		for(Book b:al)
		{
			System.out.println(b.toString());
		}
	}

	@Override
	public Book searchByBookName(String bookName)
	{
		Book b=null;
		for(Book b1: al)
		{
			if(b1.getBookName().contains(bookName))
			{
				return b1;
			}
		}
		return null;
	}

	public Book searchByAuthorName(String authorName) 
	{

		Book b=null;
		for(Book b1: al)
		{
			if(b1.getAuthorName().contains(authorName))
			{
				return b1;
			}
		}
		return null;
	}
	
}
