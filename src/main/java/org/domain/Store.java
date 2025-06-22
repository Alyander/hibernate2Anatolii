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
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short store_id;

    @OneToOne
    @JoinColumn(name = "manager_staff_id")
    private Staff manager;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}
