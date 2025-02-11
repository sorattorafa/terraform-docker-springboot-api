package com.sorattorafa.contactbook.service.interfaces;

import com.sorattorafa.contactbook.entity.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactbookService {
    Contact save(Contact contact);
    List<Contact> getAll();
    Optional<Contact> getByName(String name);
}
