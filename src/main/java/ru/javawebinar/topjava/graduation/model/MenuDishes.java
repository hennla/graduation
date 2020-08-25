package ru.javawebinar.topjava.graduation.model;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@Table(name = "menu_dishes")
public class MenuDishes extends AbstractBaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "menu_id", nullable = false)
    @NotNull
    private Menu menu;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dish_id", nullable = false)
    @NotNull
    private Dish dish;

    @NotNull
    @Column(name = "price", nullable = false)
    private Integer price;

    @Override
    public String toString() {
        return "MenuDishes{" +
                "id=" + id +
                ", dish=" + dish +
                ", menu=" + menu +
                ", price=" + price +
                '}';
    }
}
