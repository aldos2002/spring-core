package com.epam.repositories.factory;

import com.epam.repositories.UserRepository;
import com.epam.repositories.impl.UserRepositoryImpl;

public final class UserRepositoryFactory {

    public UserRepository createUserRepository() {
        return new UserRepositoryImpl();
    }


}
