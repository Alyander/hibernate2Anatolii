package org.lol;

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
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short category_id;
    @Column(name = "name", length = 25, nullable = false)
    private String name;
    @Column(name = "last_update")
    private java.sql.Timestamp last_update;
}
