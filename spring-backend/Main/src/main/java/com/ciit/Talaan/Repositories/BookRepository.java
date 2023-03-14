package com.ciit.Talaan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciit.Talaan.Models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long /* ID data type */> {
}
