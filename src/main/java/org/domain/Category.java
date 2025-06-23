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
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", length = 3)
    private short category_id;
    @Column(name = "name", length = 25, nullable = false)
    private String name;
    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private java.sql.Timestamp last_update;
}
