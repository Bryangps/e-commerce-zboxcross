package com.zboxcross.ecommerce.repositories;

import com.zboxcross.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
