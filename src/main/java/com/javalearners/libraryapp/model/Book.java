package com.javalearners.libraryapp.model;

public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private int ISBN;
    private int bookID;
    private String bookOwner;

    private Book(BookBuilder bookBuilder){
        this.title = bookBuilder.title;
        this.author = bookBuilder.author;
        this.publicationYear = bookBuilder.publicationYear;
        this.ISBN = bookBuilder.ISBN;
        this.bookID = bookBuilder.bookID;
        this.bookOwner = bookBuilder.bookOwner;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getPublicationYear() { return publicationYear; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }

    public int getISBN() { return ISBN; }
    public void setISBN(int ISBN) { this.ISBN = ISBN; }

    public int getBookID() { return bookID; }
    public void setBookID(int bookID) { this.bookID = bookID; }

    public String getBookOwner() { return bookOwner; }
    public void setBookOwner(String bookOwner) { this.bookOwner = bookOwner; }

    @Override
    public String toString(){
        return "FINISH THIS LATER";
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private int publicationYear;
        private int ISBN;
        private int bookID;
        private String bookOwner;

        public BookBuilder() {
            this.bookOwner = "none";
        }

        public BookBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder publicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public BookBuilder ISBN(int ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public BookBuilder bookID(int bookID) {
            this.bookID = bookID;
            return this;
        }

        public BookBuilder bookOwner(String bookOwner) {
            this.bookOwner = bookOwner;
            return this;
        }

        public Book build() {
            Book book = new Book(this);
            //validateBook(book);
            return book;
        }

        // IMPLEMENT LATER
        //private void validateBook(Book book){};
    }
}