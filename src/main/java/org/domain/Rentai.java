package org.domain;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rentai")
public class Rentai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentai_id;
    @OneToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name = "return_date")
    private Date returnDate;
    @OneToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;
    @Column(name = "last_update")
    private Timestamp lastUpdate;
}
