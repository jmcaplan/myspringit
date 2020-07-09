package com.vega.myspringit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vega.myspringit.domain.Link;

public interface LinkRepository extends JpaRepository<Link,Long> {

}
