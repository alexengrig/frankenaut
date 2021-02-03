package dev.alexengrig.service;

import dev.alexengrig.entity.NameEntity;
import dev.alexengrig.repository.NameRepository;

import javax.inject.Singleton;

@Singleton
public class GreetingServiceImpl implements GreetingService {

    private final NameRepository nameRepository;

    public GreetingServiceImpl(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    @Override
    public String greet(String name) {
        if (nameRepository.existsByName(name)) {
            return "Glad to see you again, " + name;
        }
        nameRepository.save(new NameEntity(name));
        return "Welcome, " + name;
    }
}
