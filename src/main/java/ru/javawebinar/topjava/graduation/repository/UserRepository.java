package ru.javawebinar.topjava.graduation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;
import ru.javawebinar.topjava.graduation.model.User;

import java.util.Optional;

@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Integer> {
    @RestResource(rel="byEmail", path = "byEmail")
    @Query("SELECT u FROM User AS u WHERE u.email = LOWER(:email) ")
    Optional<User> findByEmail(String email);

}
