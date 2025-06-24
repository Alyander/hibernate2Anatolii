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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", length = 5)
    private short customer_id;
    @OneToOne
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;
    @Column(length = 45,name = "first_name",  nullable = false)
    private String firstName;
    @Column(length = 45, name = "last_name", nullable = false)
    private String lastName;
    @Column(length = 50, name = "email")
    private String email;
    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;
    @Column(length = 11,name = "active",nullable = false)
    private int active;
    @Column(name = "create_date")
    private java.sql.Date createDate;
    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private java.sql.Timestamp lastUpdate;

    public Customer() {
    }


    public Customer(Store store, String firstName, String lastName, String email, Address address, int active, Date createDate, Timestamp lastUpdate) {
        this.store = store;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.active = active;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
    }
}
