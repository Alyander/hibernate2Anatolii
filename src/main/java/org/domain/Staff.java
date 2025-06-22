package org.domain;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @Column(name = "picture")
    private java.sql.Blob picture;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @OneToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @Column(name = "active", length = 1, nullable = false)
    private short active;
    @Column(name = "username", nullable = false, length = 16)
    private String username;
    @Column(name = "password", nullable = false , length = 40)
    private String password;
    @Column(name = "last_update", nullable = false)
    private java.sql.Timestamp lastUpdate;
}
