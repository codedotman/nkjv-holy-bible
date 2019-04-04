package com.bible.amplified.test.bible.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 03/03/2019.
 */

public class Bible {

    String name;
    List<Book> books;

    public Bible(String name){
        this.name = name;
        this.books = new ArrayList<Book>();

    }

    public Book addBook(Book book){
        //Book book = new Book();
        books.add(book);
        return book;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Integer getSize(){
        return books.size();
    }

    public Book getBook(int position){
        return books.get(position);
    }

    @Override
    public String toString() {
        //return super.toString();
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
