////25th Jan
////Project on SpringBoot
////Interface extends JPARepository
////Ankan Goswami

package com.example.records.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.records.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
