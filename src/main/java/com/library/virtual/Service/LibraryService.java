package com.library.virtual.Service;

import java.util.List;

import com.library.virtual.model.Book;
import com.library.virtual.model.Library;

public interface LibraryService {

     List<Library> getAllLibrary();
     void addLibrary(Library library);
}
