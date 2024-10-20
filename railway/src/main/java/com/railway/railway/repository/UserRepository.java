package com.railway.railway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.railway.railway.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
