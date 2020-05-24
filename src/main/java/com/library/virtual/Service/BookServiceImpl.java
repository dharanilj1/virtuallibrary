package com.library.virtual.Service;

import java.util.List;

import com.library.virtual.model.Book;
import com.library.virtual.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl  implements  BookService{

    @Autowired
    BookRepository BookRepository;


    @Override public List<Book> getAllBooks(){
        return BookRepository.findAll();
    }

    @Override public List<Book> getBooksByLibraryId(int id){
        return BookRepository.getByLibrary_id(id);
    }

    @Override public void addBook(Book book) {
        BookRepository.save(book);
    }
}
