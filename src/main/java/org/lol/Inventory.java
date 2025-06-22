package org.lol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.domain.Film;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short inventory_id;
    @OneToOne
    @JoinColumn(name="film_id")
    private Film film;
    @OneToOne
    @JoinColumn(name="store_id")
    private Store store;
    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}
