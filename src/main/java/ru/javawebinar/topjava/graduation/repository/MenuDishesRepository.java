package ru.javawebinar.topjava.graduation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javawebinar.topjava.graduation.model.MenuDishes;

public interface MenuDishesRepository extends JpaRepository<MenuDishes, Integer> {
}
