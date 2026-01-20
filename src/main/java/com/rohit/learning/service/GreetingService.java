package com.rohit.learning.service;

import com.rohit.learning.repository.FakeUserRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final FakeUserRepository fakeUserRepository;

    public GreetingService(FakeUserRepository fakeUserRepository) {
        this.fakeUserRepository = fakeUserRepository;
    }

    public String greet(String name) {
        return "Hello " + name + " 👋 (from Service)";
    }

    public String createUser(String name) {
        return fakeUserRepository.save(name);
    }
}
