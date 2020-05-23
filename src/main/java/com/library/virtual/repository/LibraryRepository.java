package com.library.virtual.repository;

import com.library.virtual.model.Book;
import com.library.virtual.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Long> {

}
