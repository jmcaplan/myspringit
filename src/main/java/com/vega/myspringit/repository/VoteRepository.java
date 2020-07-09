package com.vega.myspringit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vega.myspringit.domain.Vote;

public interface VoteRepository extends JpaRepository<Vote,Long> {
	
}
