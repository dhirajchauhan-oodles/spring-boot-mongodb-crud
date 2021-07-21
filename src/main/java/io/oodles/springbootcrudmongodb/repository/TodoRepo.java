package io.oodles.springbootcrudmongodb.repository;

import io.oodles.springbootcrudmongodb.model.TodoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends MongoRepository<TodoDTO, String> {
}
