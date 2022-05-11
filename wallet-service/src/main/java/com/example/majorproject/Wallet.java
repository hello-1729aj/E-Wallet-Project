package com.example.majorproject;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userId;
    private int balance;
    @CreationTimestamp
    private Date CreatedOn;

    @UpdateTimestamp
    private Date UpdatedOn;

}
