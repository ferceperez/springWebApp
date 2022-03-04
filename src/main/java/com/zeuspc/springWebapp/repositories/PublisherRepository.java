package com.zeuspc.springWebapp.repositories;

import com.zeuspc.springWebapp.dao.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
