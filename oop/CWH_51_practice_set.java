package com.oop;
/*
   1.you have to implement a library using a javaclass Library
   2.methods : addbook , issuebook,returnbook,showavailablebook
   3.Properties : Array to store the available Books
   4.Array to store the issue books
* */
class Library{
    String[] books;
    int no_of_books;

    Library()
    {
        this.books = new String[100];  //this.books = new String[100];
        this.no_of_books =0;
    }

    void addbook(String Book)
    {
        this.books[no_of_books] = Book;
        no_of_books++;
        System.out.println(Book+" Has been Added");
    }

    void showAvailablebook()
    {
        System.out.println("Available Books are : ");
        for (String book :  this.books) {
            if(book == null)
            {
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book)
    {
        for(int i=0 ; i<this.books.length ;i++)
        {
            if(this.books[i] != null && this.books[i].equals(book))
            {
                System.out.println("The Book has been issued " +book);
                this.books[i] = null;
                return;
            }

            //System.out.println("* " + book);
        }
        System.out.println("This Book does not exist");

    }

    void returnbook(String book)
    {
        addbook(book);
    }




}

public class CWH_51_practice_set {
    public static void main(String[] args) {


        Library L = new Library();
        L.addbook("LetsDOit");
        L.addbook("DSA");
        L.addbook("C++");

        L.issueBook("C++");
        L.showAvailablebook();
        L.returnbook("C++");
        L.showAvailablebook();
        L.issueBook("ddd");

    }
}
