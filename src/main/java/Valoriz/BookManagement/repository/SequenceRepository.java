package Valoriz.BookManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Valoriz.BookManagement.model.DatabaseSequence;

public interface SequenceRepository extends MongoRepository<DatabaseSequence, String> {

}
