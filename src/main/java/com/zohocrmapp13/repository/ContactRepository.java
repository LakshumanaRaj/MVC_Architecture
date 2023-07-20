package com.zohocrmapp13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp13.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
