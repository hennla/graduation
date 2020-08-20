package ru.javawebinar.topjava.graduation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javawebinar.topjava.graduation.model.Dish;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dish", path = "dish")
public interface DishRepository extends JpaRepository<Dish, Integer> {
}
