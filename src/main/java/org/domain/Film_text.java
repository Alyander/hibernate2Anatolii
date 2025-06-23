package org.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "film_text")
public class Film_text {
    @Id
    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film_id;
    @Column
    @UpdateTimestamp
    private java.sql.Timestamp last_update;
    @Column(name = "title",length = 255,nullable = false)
    private String title;
    @Column(name = "description")
    private String description;
}
