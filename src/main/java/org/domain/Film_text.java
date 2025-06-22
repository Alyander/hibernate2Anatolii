package org.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "film_text")
public class Film_text {

    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film_id;
    @Column
    private Timestamp last_update;

    @Column(name = "title",length = 255,nullable = false)
    private String title;

    @Column(name = "description",length = 65535)
    private String description;
}
