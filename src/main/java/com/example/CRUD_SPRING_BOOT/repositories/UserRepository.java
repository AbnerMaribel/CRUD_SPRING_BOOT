package com.example.CRUD_SPRING_BOOT.repositories;

import com.example.CRUD_SPRING_BOOT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
