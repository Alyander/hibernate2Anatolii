package org.domain;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id", length = 5)
    private short payment_id;
    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff product;
    @OneToOne
    @JoinColumn(name = "rental_id", nullable = false)
    private Rental rental;
    @Column(name = "amount", nullable = false)
    private double amount;
    @Column(name = "payment_date", nullable = false)
    private java.sql.Date paymentDate;
    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private java.sql.Timestamp lastUpdate;
}
