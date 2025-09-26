package com.capgemini.bookmgmt;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.bookmgmt.entity.Book;
import com.capgemini.bookmgmt.service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx=  new AnnotationConfigApplicationContext(App.class);
    	ctx.scan("com.capgemini.bookmgmt");
    	BookService bookService= ctx.getBean(BookService.class);
    	int option=0;
    	Scanner sc= new Scanner(System.in);
    	do {
		        System.out.println( "----Menu----" );
		        System.out.println( "----1. Save----" );
		        System.out.println( "----2. Find By Id----" );
		        System.out.println( "----3. Find All Books----" );
		        System.out.println( "----4. Delete By Id----" );
		        System.out.println( "----5. Update----" );
		        System.out.println( "----6. Exit----" );
		         option = sc.nextInt();
		        if(option==1) {
		        	save(bookService);
		        }
		        if(option==2) {
		        	Book book = findById(bookService);
		        	System.out.println(book);
		        }
		        if(option==3) {
		        	List<Book> listOfBooks = findAll(bookService);
		        	System.out.println(listOfBooks);
		        }
		        if(option==4) {
		        	deleteById(bookService);
		        	 
		        }
		        if(option==5) {
		        	update(bookService);
		        	 
		        }
        }while(option!=6);
    	
        
    }
    
    public static void save(BookService bookService)
    {
    	Scanner sc= new Scanner(System.in);
        System.out.print( "Please enter Book Name :"  );
        String bookName=sc.nextLine();
        System.out.print( "Please enter Author Name :"  );
        String bookAuthor=sc.nextLine();
        
        Book book = new Book(bookName,bookAuthor);
        bookService.save(book);
    }
    
    
    public static void update(BookService bookService)
    {
    	Scanner sc= new Scanner(System.in);
        System.out.print( "Please enter Book id :"  );
        int id=sc.nextInt();
        Book book=bookService.findById(id);
        System.out.print( "Please enter Book Name :"  );
        String bookName=sc.nextLine();
        
        System.out.print( "Please enter Author Name :"  );
        sc.nextLine();
        String bookAuthor=sc.nextLine();
        book.setBookName(bookName);
        book.setAuthor(bookAuthor);
         
        bookService.save(book);
    }
    public static Book findById(BookService bookService)
    {
    	Scanner sc= new Scanner(System.in);
        System.out.print( "Please enter Book id :"  );
        int id=sc.nextInt();
    	
    	return bookService.findById(id);
    	
    }
    
    public static List<Book> findAll(BookService bookService)
    {
    	return bookService.findAll();
    	
    }
    public static void deleteById(BookService bookService)
    {
    	Scanner sc= new Scanner(System.in);
        System.out.print( "Please enter Book id :"  );
        int id=sc.nextInt();
    	
    	  bookService.deleteById(id);
    	
    }
}
