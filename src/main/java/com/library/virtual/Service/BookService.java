package com.library.virtual.Service;

import java.util.List;

import com.library.virtual.model.Book;
import org.springframework.stereotype.Service;


public interface BookService {

     List<Book> getAllBooks();
     List<Book> getBooksByLibraryId(int id);
     void addBook(Book book);
}
