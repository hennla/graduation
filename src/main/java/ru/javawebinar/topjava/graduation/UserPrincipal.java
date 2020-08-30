package ru.javawebinar.topjava.graduation;

import lombok.Getter;
import lombok.NonNull;
import ru.javawebinar.topjava.graduation.model.User;

//https://www.codeflow.site/ru/article/spring-security-authentication-with-a-database
@Getter
public class UserPrincipal extends org.springframework.security.core.userdetails.User {
    @NonNull
    private User user;

    public UserPrincipal(User user) {
        super(user.getEmail(), user.getPassword(), user.getRoles());
        this.user = user;
    }

}
