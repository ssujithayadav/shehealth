package com.myapp.shehealth.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Transactional

@Table(name = "user_healthdetails" )
public class UserHealthDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_healthdetails_id")

//    private LocalDate date = LocalDate.now() ;
    private String occupation;
    private int timeSpentOnWorkout; // in minutes
    private int waterConsumptionPerDay; // in number of glasses

    private int bpValue;
    private boolean isDiabetic;

    @OneToOne(mappedBy = "userHealthDetails")
    private User user;

}
