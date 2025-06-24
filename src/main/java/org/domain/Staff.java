package org.domain;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Blob;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id",  length = 3)
    private short staff_id;
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;
    @Column(name = "picture")
    // IDEA ругается но код сам работает
    private Blob picture;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @OneToOne
    @JoinColumn(name = "store_id", nullable = false)
    private Store store_id;
    @Column(name = "active", length = 6, nullable = false)
    private short active;
    @Column(name = "username", nullable = false, length = 16)
    private String username;
    @Column(name = "password", nullable = false , length = 40)
    private String password;
    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private java.sql.Timestamp lastUpdate;
}
