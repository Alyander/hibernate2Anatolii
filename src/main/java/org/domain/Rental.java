package org.domain;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "rental")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id", length = 11)
    private int rental_id;
    @Column(name = "rental_date", nullable = false)
    private java.sql.Date rentalDate;
    @OneToOne
    @JoinColumn(name = "inventory_id", nullable = false)
    private Inventory inventory_id;
    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @Column(name = "return_date")
    private java.sql.Date returnDate;
    @OneToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff staff;
    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private java.sql.Timestamp lastUpdate;
}
