package com.vega.myspringit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vega.myspringit.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
