package test;

import dao.bookIssue.BookIssueDaoImp;
import dao.librarian.*;

import pojo.Book;
import pojo.BookIssueDetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LibraryTest 
{
	public static int bookId=0;
	String issuedt;

	public static void main(String[] args) throws IOException 
	{
		int choice=0;
		boolean status;
		
		LibraryDaoImpl ldl=new LibraryDaoImpl();
		
		String bookName,bookSubject,authorName,usertype;
		int pageNo,price;
		String username,password;
		
		Scanner sc=new Scanner(System.in);
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		BookIssueDaoImp bid=new BookIssueDaoImp();
		
		
		System.out.println("ENter your usertype:\n 1. Librarian(enter lib) \n 2. Student(enter stud)");
		usertype=br.readLine();
		
		if(usertype.equals("lib"))
		{
			System.out.println("Enter username");
			username=br.readLine();
			
			System.out.println("Enter password");
			password=br.readLine();
			
			if(username=="admin" && password=="admin")
			{
				do
				{
					System.out.println("1. Add Book");
					System.out.println("2. Get All Books Information");
					System.out.println("3.	Search By BookName ");
					System.out.println("4. Search By AuthorName");
					System.out.println("5. Issued books by Students");
					System.out.println("0. Exit");
					System.out.println("Enter your choice");
					choice=sc.nextInt();
					
					switch (choice)
					{
						case 0:
						{
							System.exit(0);
							break;
						}
						case 1:
						{	
							System.out.println("Adding Book Details------------");
							System.out.println("Enter Book name");
							bookName=br.readLine();
							
							System.out.println("Enter Book Subject");
							bookSubject=br.readLine();
							
							System.out.println("Enter author Name");
							authorName=br.readLine();
							
							System.out.println("Enter page number");
							pageNo=sc.nextInt();
							
							System.out.println("Enter Price ");
							price=sc.nextInt();
							
							bookId++;
							
							Book b=new Book();
							b.setBookId(bookId);
							b.setBookName(bookName);
							b.setAuthorName(authorName);
							b.setBookSubject(bookSubject);
							b.setPageNo(pageNo);
							b.setPrice(price);
							
							status=ldl.addBook(b);
							
							if(status== true)
							{
								System.out.println("Book Added Succesfully!!!!!!!!");
							
							}
							else
							{
								System.out.println("Book Not Inserted...........");
							}
							break;
						}//case 1 addBook()
						
						case 2:
						{
							System.out.println("Displaying All Books----------");
							ldl.getAllBook();
							break;
						}//case 2 getAllBook()
						
						case 3:
						{
							System.out.println("Enter BookName");
							bookName=br.readLine();
							Book book=ldl.searchByBookName(bookName);
							if(book!=null)
							{
								System.out.println(book);
							}
							else
							{
								System.out.println("Book Not found----");
							}
							
							break;
						}//case 3 searchByBookName
						
						case 4:
						{
							System.out.println("Enter AuthorName");
							authorName=br.readLine();
							Book book=ldl.searchByAuthorName(authorName);
							if(book!=null)
							{
								System.out.println(book);
							}
							else
							{
								System.out.println("Book Not found----");
							}
							
							break;
						}//case 4: searchbyauthorname
						default:
							System.out.println("Wrong choice");
					}//switch
				}while(choice!=0);//do...while
			}//if
			else
			{
				System.out.println("wrong username and password");
			}
		}//if outer
		else if(usertype.equals("stud"))
		{
			System.out.println("Enter username");
			username=br.readLine();
			
			System.out.println("ENter password");
			password=br.readLine();
			
			if(username=="student" && password=="student")
			{
				do
				{
					System.out.println("0. Exit");
					System.out.println("1. Issue Book");
					System.out.println("2. Return Book");
					System.out.println("Enter your choice");
					choice=sc.nextInt();
					
					switch (choice)
					{
						case 0:
						{
							System.exit(0);
							break;
						}
						case 1:
						{

							System.out.println("Issuing Book To student");
							System.out.println("Enter bookid");
							int id=sc.nextInt();
							
							System.out.println("Enter Book name");
							bookName=br.readLine();
							
							System.out.println("Enter Book Subject");
							bookSubject=br.readLine();
							
							System.out.println("Enter book issue date");
							String issuedate =br.readLine();
							
							System.out.println("Enter student id");
							int studId=sc.nextInt();
							
							BookIssueDetails bd=new BookIssueDetails();
							
							bd.setBookId(id);
							bd.setBookName(bookName);
							bd.setBookSubject(bookSubject);
							bd.setIssueDate(issuedate);
							bd.setStudId(studId);
							
							status=bid.addBookIssued(bd);
							
							if(status== true)
							{
								System.out.println("Book Issued Succesfully!!!!!!!!");
							
							}
							else
							{
								System.out.println("Book Not ISSued...........");
							}
							break;
							
						}
						
						case 7:
						{
							System.out.println("Enter Book id");
							bookId=sc.nextInt();
							BookIssueDetails bd=bid.returnBook(bookId);
							if(bd!=null)
							{
								System.out.println("Book Returned");
							}
							else
							{
								System.out.println("Book NOT returned");
								
							}
							
						}
						
						default:
							System.out.println("Wrong choice");
					}//SWITCH
				}while(choice!=0);
			}//if
			else
			{
				System.out.println("Wrong password");
			}
		}//elseif
		else
		{
			System.out.println("Wrong usertype");
		}
		
	}//psvm

}//class
