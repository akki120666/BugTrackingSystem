package com.bts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bts.entity.Bug;

public interface BugRepository extends JpaRepository<Bug, Integer> {

}
