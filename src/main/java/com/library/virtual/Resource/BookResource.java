package com.library.virtual.Resource;

import java.util.List;

import com.library.virtual.Service.BookService;
import com.library.virtual.model.Book;
import com.library.virtual.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResource {

    @Autowired
    BookService bookService;

    @GetMapping("/getAllBooks")
    public List<Book> findAllBooks(){
        return  bookService.getAllBooks();
    }

    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book){
          bookService.addBook(book);
    }
}
