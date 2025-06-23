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
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id",  length = 5)
    private short country_id;
    @Column(name = "country", length = 50, nullable = false)
    private String country;
    @Column(name = "last_update")
    @UpdateTimestamp
    private java.sql.Timestamp last_update;

}
