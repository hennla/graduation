package ru.javawebinar.topjava.graduation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.javawebinar.topjava.graduation.model.Menu;

@RepositoryRestResource(collectionResourceRel = "menu", path = "menu")
public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
