package org.domain;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Setter
@Getter

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
    private Customer customer_id;
    @Column(name = "return_date")
    private java.sql.Date returnDate;
    @OneToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff staff_id;
    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private java.sql.Timestamp lastUpdate;

    public Rental() {
    }

    public Rental(Date rentalDate, Inventory inventory_id, Customer customer_id, Date returnDate, Staff staff_id, Timestamp lastUpdate) {
        this.rentalDate = rentalDate;
        this.inventory_id = inventory_id;
        this.customer_id = customer_id;
        this.returnDate = returnDate;
        this.staff_id = staff_id;
        this.lastUpdate = lastUpdate;
    }
}
