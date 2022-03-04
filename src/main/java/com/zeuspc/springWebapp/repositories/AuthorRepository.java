package com.zeuspc.springWebapp.repositories;

import com.zeuspc.springWebapp.dao.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>
{

}
