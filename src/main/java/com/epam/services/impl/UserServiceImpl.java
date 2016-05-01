package com.epam.services.impl;

import com.epam.repositories.UserRepository;
import com.epam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Almas_Doskozhin
 * on 4/27/2016.
 */

@Service
public class UserServiceImpl implements UserService {
    private UserRepository repository;

    @Autowired
    public void populate(UserRepository repository) {
        this.repository = repository;
    }
}
