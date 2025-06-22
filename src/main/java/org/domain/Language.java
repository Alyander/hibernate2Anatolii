package org.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "language")
public class Language {
    @GeneratedValue
    @Id
    @Column(name = "language_id", nullable = false)
    private short language_id;
    @Column(name = "last_update"/*,columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"*/)
    private Timestamp last_update;
    @Column(name = "name", length = 20, nullable = false)
    private String name;

}
