package Valoriz.BookManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Valoriz.BookManagement.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
