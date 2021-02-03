package dev.alexengrig.repository;

import dev.alexengrig.entity.NameEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface NameRepository extends JpaRepository<NameEntity, Long> {

    boolean existsByName(String name);
}
