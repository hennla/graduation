package ru.javawebinar.topjava.graduation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.javawebinar.topjava.graduation.model.Dish;

@RepositoryRestResource(collectionResourceRel = "dishes", path = "dishes")
public interface DishRepository extends JpaRepository<Dish, Integer> {

}
