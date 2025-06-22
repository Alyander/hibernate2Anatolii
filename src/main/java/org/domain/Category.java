package org.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "category")
public class Category {
    @Column(name = "category_id", nullable = false)
    private short category_id;
    @Column(name = "name", length = 25, nullable = false)
    private String name;
    @Column(name = "last_update")
    private Timestamp last_update;
}
