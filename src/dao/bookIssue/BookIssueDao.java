package dao.bookIssue;

import pojo.BookIssueDetails;

public interface BookIssueDao 
{
	public boolean addBookIssued(BookIssueDetails b);
	public void dispIssuedBook();
	public BookIssueDetails returnBook(int bookid);
	
	
}
