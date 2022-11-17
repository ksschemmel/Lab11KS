package Lab_11;

public class Publisher {
String name;
String city;
String Publisher_ID;
Author author;
Book book;

Publisher(String name, String city, String Publisher_ID, Author author, Book book){
	this.name = name;
	this.city = city;
	this.Publisher_ID = Publisher_ID;
	this.author = author;
	this.book = book;
}
public static void main(String[] args) {
	Author author = new Author("Kailey Schemmel","2001 Newburg Rd Louisville,KY 40205", 19);
	Book book = new Book("9 Days and 9 Nights", 11);
	Publisher publisher1 = new Publisher("Sunset Inc.","Denver","456789",author, book);
	System.out.println("------Publisher Details------");
	System.out.println("Publisher name: "+ publisher1.name);
	System.out.println("Publisher city: "+publisher1.city);
	System.out.println("Publisher ID: "+ publisher1.Publisher_ID);
	System.out.println("------Author Details------");
	System.out.println("Author name: "+ publisher1.author.aname);
	System.out.println("Author address: "+ publisher1.author.aaddress);
	System.out.println("Author age: "+ publisher1.author.aage);
	System.out.println("------Book Details------");
	System.out.println("Book name: "+ publisher1.book.bname);
	System.out.println("Book price: "+ publisher1.book.bprice);
}
}
