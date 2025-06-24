package org.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Setter
@Getter
@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id", length = 8)
    private short inventory_id;
    @OneToOne
    @JoinColumn(name="film_id", nullable = false)
    private Film film;
    @OneToOne
    @JoinColumn(name="store_id", nullable = false)
    private Store store;
    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private java.sql.Timestamp lastUpdate;

    public Inventory() {
    }

    public Inventory(Film film, Store store, Timestamp lastUpdate) {
        this.film = film;
        this.store = store;
        this.lastUpdate = lastUpdate;
    }
}