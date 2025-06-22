package org.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "film")
public class Film {
    @Column(name = "title", length = 128, nullable = false)
    private String title;
    @Column(name = "description", length = 65535)
    private String description;
    @Column(name = "release_year", nullable = false)
    private short release_year;
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;
    @OneToOne
    @JoinColumn(name = "original_language_id")
    private Language original_language;
    @Column(name = "rental_duration", nullable = false)
    private byte rental_duration;
    @Column(name = "rental_rate", nullable = false)
    private double rental_rate;
    @Column(name = "length", nullable = false)
    private short length;
    @Column(name = "replacement_cost", nullable = false)
    private double replacement_cost;
    @Column(name = "rating", length = 5)
    private String rating;
    @Column(name = "special_features", length = 200)
    private String special_features;
    @Column(name = "last_update"/*, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"*/)
    private Timestamp last_update;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", nullable = false)
    private short film_id;
}
