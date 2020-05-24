package com.library.virtual.repository;

import java.util.List;

import com.library.virtual.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    @Query("SELECT book FROM Book book WHERE book.library_id = :id")
    List<Book> getByLibrary_id(@Param("id") int id);

}
