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
@Table(name = "language")
public class Language {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "language_id", length = 3)
    private short language_id;
    @Column(name = "last_update", nullable = false/*,columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"*/)
    @UpdateTimestamp
    private java.sql.Timestamp last_update;
    @Column(name = "name", length = 20, nullable = false)
    private String name;

}
