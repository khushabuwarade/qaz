package dao.bookIssue;

import java.util.ArrayList;

import pojo.BookIssueDetails;

public class BookIssueDaoImp implements BookIssueDao
{
	ArrayList<BookIssueDetails> al=new ArrayList<>();
	boolean status=false;
	@Override
	public boolean addBookIssued(BookIssueDetails b)
	{
		if(b.getStudId()!=0)
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
	public void dispIssuedBook()
	{
		if(al.equals(null))
		{
			for(BookIssueDetails b:al)
			{
				System.out.println(b.toString());
			}
		}
		else
		{
			System.out.println("Empty table::::::::::::::::");
		}
	}
	
	public BookIssueDetails returnBook(int bookid) 
	{
		for(BookIssueDetails b:al)
		{
			if(b.getBookId()==bookid)
			{
				return b ;
			}
		}
	
		return null;
	}

}
