package org.domain;

import jakarta.persistence.*;

import java.sql.Timestamp;

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
    private Timestamp last_update;

}
