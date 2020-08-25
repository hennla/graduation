package ru.javawebinar.topjava.graduation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import ru.javawebinar.topjava.graduation.model.Restaurant;

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "restaurant", path = "restaurant")
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
