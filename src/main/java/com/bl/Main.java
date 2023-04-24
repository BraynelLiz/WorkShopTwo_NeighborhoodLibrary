package com.bl;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        int totalNumOfBooks = 0;

        books[0] = new Book(200, "123_1_456_78_9", "Green eggs and Ham", true, "Scarlet Cruz");
        books[1] = new Book(205, "987_2_654_32_1", "Diary of a whimpy kid", true, "Nayely Cruz");
        books[2] = new Book(210, "468_6_899_15_4", "Twilight", false, "");
        books[3] = new Book(300, "548_9_894_12_3", "Harry Potter", true, "Valerie Dederle");
        books[4] = new Book(510, "710_6_567_74_4", "The Magic School Bus", false, "");
        books[5] = new Book(450, "798_2_474_03_0", "Cat in the Hat", true, "Patricia Liz");



          }
      }

class Book{
    public int id;
    public String isbn;
    public String title;
    public boolean isCheckedOut;
    public String isCheckedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String isCheckedOutTo){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.isCheckedOutTo = isCheckedOutTo;
    }

    public int id(){
        return this.id;
    }
    public String isbn(){
        return this.isbn;
    }
    public String isbn(String isbn){
        return this.isbn;
    }
    public String title (){
        return this.title;
    }
    public String title(String title){
        return this.title;
    }
    public boolean getisCheckedOut(){
        return this.isCheckedOut;
    }
    public boolean isCheckedOut(boolean isCheckedOut){
        return this.isCheckedOut = isCheckedOut;
    }
    public String isCheckedOutTo(){
        return this.isCheckedOutTo;
    }
    public String isCheckedOutTo(String isCheckedOutTo){
        return this.isCheckedOutTo;
    }

}