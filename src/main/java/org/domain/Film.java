package org.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", length = 5)
    private short film_id;
    @Column(name = "title", length = 128, nullable = false)
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "release_year", nullable = false, length = 6)
    private short release_year;
    @ManyToOne
    @JoinColumn(name = "language_id", referencedColumnName = "language_id", nullable = false)
    private Language language;
    @OneToOne
    @JoinColumn(name = "original_language_id", referencedColumnName = "language_id")
    private Language original_language;
//    @Column(name = "language_id")
//    private short language;
//    @Column(name = "original_language_id")
//    private short original_language;
    @Column(name = "rental_duration", nullable = false, length = 11)
    private int rental_duration;
    @Column(name = "rental_rate", nullable = false)
    private BigDecimal rental_rate;
    @Column(name = "length")
    private short length;
    @Column(name = "replacement_cost", nullable = false)
    private BigDecimal replacement_cost;
    @Column(name = "rating")
    private String rating;
    @Column(name = "special_features", length = 200)
    private String special_features;
    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private java.sql.Timestamp last_update;

    public Film() {
    }

    public Film(String title, String description, short release_year, Language language, Language original_language, int rental_duration, BigDecimal rental_rate, short length, BigDecimal replacement_cost, String rating, String special_features, Timestamp last_update) {
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language = language;
        this.original_language = original_language;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.rating = rating;
        this.special_features = special_features;
        this.last_update = last_update;
    }
}
