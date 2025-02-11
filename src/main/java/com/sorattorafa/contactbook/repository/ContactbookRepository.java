package com.sorattorafa.contactbook.repository;

import com.sorattorafa.contactbook.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactbookRepository extends JpaRepository<Contact, Long> {
    Optional<Contact> findByName(String name);
}
