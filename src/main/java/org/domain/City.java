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
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id", nullable = false)
    private short city_id;
    @Column(name = "city", length = 50, nullable = false)
    private String city;
    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country_id;
    @Column(name = "last_update")
    private java.sql.Timestamp last_update;

}
