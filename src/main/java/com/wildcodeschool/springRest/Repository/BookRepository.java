package com.wildcodeschool.springRest.Repository;

import com.wildcodeschool.springRest.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository <Book, Long> {
    List<Book> findByTitleContainingOrDescriptionContaining(String searchBook, String searchBooks);
}
