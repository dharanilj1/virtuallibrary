package com.library.virtual.Resource;

import java.util.List;

import com.library.virtual.Service.BookService;
import com.library.virtual.Service.LibraryService;
import com.library.virtual.model.Book;
import com.library.virtual.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryResource {

    @Autowired
    LibraryService libraryService;

    @GetMapping("/getAllLibrary")
    public List<Library> findAllBooks(){
        return  libraryService.getAllLibrary();
    }

    @PostMapping("/addLibrary")
    public void addBook(@RequestBody Library library){
        libraryService.addLibrary(library);
    }
}
