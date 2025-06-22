package org.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "film_actor")
public class Film_Actor {
    @OneToOne
    @JoinColumn(name = "actor_id")
    private Actor actor;
    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;
    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}
