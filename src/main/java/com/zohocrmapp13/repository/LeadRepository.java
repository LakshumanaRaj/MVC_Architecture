package com.zohocrmapp13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp13.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
