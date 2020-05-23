package com.library.virtual.Service;

import java.util.List;

import com.library.virtual.model.Book;
import com.library.virtual.model.Library;
import com.library.virtual.repository.BookRepository;
import com.library.virtual.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements  LibraryService{

    @Autowired
    LibraryRepository libraryRepository;


    @Override public List<Library> getAllLibrary(){
        return libraryRepository.findAll();
    }

    @Override public void addLibrary(Library library) {
        libraryRepository.save(library);
    }
}
