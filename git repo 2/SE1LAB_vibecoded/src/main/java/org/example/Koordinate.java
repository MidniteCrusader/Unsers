package org.example;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter(lombok.AccessLevel.PUBLIC)
public class Koordinate {
    private Double xKoordinate;
    private Double yKoordinate;
}
