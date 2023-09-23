package net.javaguides.ems.repository;

import net.javaguides.ems.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// This interface defines a repository for User entities
public interface UserRepository extends JpaRepository<User, Long> {
}