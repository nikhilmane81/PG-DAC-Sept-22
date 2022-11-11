/*
Implement a class for a “Book”. Book contains a title (a String), a list of authors (array of authors), number of
pages (an integer), price (floating point number), publisher (a String) etc. Write suitable constructor and
accessor/modifier methods. Implement a class for “Library”. A library contains a list of books (array of Book).
Write add (to add a book) and remove (to delete a book) methods for library. Write a main() function to create a
“Library” and add five “Book” to library. Print the total price of all books. 
 */
import java.util.*;
class Book
{
	String title;
	int numberOfAuthor;
	String authorName;
	int pages;
	double price;
	String publisher;
	Book()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter title of book");
		this.title = pp.next();
		System.out.println("Enter number of pages");
		this.pages = pp.nextInt();
		System.out.println("Enter price for book");
		this.price = pp.nextDouble();
		System.out.println("Enter name publisher");
		this.publisher = pp.next();
		pp.nextLine();
		System.out.println("Enter name of of Author");
		this.authorName = pp.next();
	}
	public String toString()
	{
		return "Title of the book:- "+title+ ",Pages:- "+pages+ " ,Price:- "+price+ " ,Publisher:- "+publisher+ " ,Author name :- "+
		authorName;
	}
}
public class Library
{
	static int size;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of books you need to store");
		size = sc.nextInt();
		List <Book> list1 = new ArrayList<Book>();
		//Book b1 = new Book();
		//list1.add(b1);
		for(int i=0;i<size;i++)
		{
			list1.add(new Book());
		}
		Iterator <Book> it = list1.iterator();
		while(it.hasNext())
		{
			Book s = it.next();
			System.out.println(s);
		}
	}
		
}