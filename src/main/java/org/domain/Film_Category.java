package org.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "film_category")
public class Film_Category {
    @Id
    @OneToOne
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;
    @OneToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private java.sql.Timestamp lastUpdate;
}
