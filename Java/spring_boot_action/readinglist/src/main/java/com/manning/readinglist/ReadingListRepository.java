package com.manning.readinglist;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

// The domain type of the repository is Book and its type is the Id property
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);
}