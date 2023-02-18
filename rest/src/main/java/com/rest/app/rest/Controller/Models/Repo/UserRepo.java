package com.rest.app.rest.Controller.Models.Repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.app.rest.Controller.Models.User;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
