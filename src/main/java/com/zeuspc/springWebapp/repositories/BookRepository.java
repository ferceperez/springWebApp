package com.zeuspc.springWebapp.repositories;

import com.zeuspc.springWebapp.dao.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
