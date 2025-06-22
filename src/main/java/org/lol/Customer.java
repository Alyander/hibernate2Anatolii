package org.lol;
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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @Column(length = 45,name = "first_name",  nullable = false)
    private String firstName;
    @Column(length = 45, name = "last_name", nullable = false)
    private String lastName;
    @Column(length = 50, name = "email", nullable = false)
    private String email;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @Column(length = 1,name = "active",nullable = false)
    private int active;
    @Column(name = "create_date")
    private java.sql.Date createDate;
    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}
