package org.domain;

import jakarta.persistence.*;
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
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id", length = 5)
    private short address_id;
    @Column(name = "address", length = 50, nullable = false)
    private String address;
    @Column(name= "address2", length = 50)
    private String address2;
    @Column(name = "district", nullable = false, length = 20)
    private String district;
    @OneToOne
    @JoinColumn(name="city_id", nullable = false, referencedColumnName = "city_id")
    private City city;
//    @Column(name= "city_id", nullable = false, length = 5)
//    private short cityId;
    @Column(name = "postal_code",length = 10)
    private String postalCode;
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;
    @Column(name="last_update", nullable = false)
    @UpdateTimestamp
    private java.sql.Timestamp lastUpdate;
}
