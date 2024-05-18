package com.dblibproject.dblibproject.repository;

import com.dblibproject.dblibproject.entity.Classx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Classx, Long> {
}
