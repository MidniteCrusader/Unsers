package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter(lombok.AccessLevel.PUBLIC)
@Entity
public class Hafen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bezeichnung;
    @Embedded
    private Koordinate koordinate;
}
