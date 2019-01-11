package com.testptoject.budgetsocialmedia.repos;

import com.testptoject.budgetsocialmedia.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
