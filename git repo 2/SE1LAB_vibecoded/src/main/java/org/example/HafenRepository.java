package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface HafenRepository extends JpaRepository<Hafen, Long> {
    boolean existsByBezeichnung(String bezeichnung);
}

