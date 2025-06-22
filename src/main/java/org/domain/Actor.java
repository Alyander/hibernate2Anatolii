package org.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue
    private short actor_id;
    @Column(name = "first_name", length = 45, nullable = false)
    private String first_name;
    @Column(name = "last_name", length = 45, nullable = false)
    private String last_name;
    @Column(name = "last_update")
    @UpdateTimestamp
    private java.sql.Timestamp last_update;

}
