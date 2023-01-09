package com.codewithrrcc.fullsatackbackend.repository;

import com.codewithrrcc.fullsatackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
