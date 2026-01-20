package com.rohit.learning.repository;

import org.springframework.stereotype.Repository;

@Repository
public class FakeUserRepository {

    public String save(String name) {
        // simulate DB save
        return "Saved user: " + name;
    }
}
