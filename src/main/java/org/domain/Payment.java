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
    private short payment_id;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "staff_id")
    private Staff product;
    @OneToOne
    @JoinColumn(name = "rentai_id")
    private Rentai rentai;
    @Column(name = "amount")
    private double amount;
    @Column(name = "payment_date")
    private java.sql.Date paymentDate;
    @Column(name = "last_update")
    @UpdateTimestamp
    private java.sql.Timestamp lastUpdate;
}
