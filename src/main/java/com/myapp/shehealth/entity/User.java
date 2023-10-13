package com.myapp.shehealth.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data
@Transactional
@NoArgsConstructor


@Table(name = "User_Details" )
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "user_id")
    private int userId;
    private String name;
    private int age;
    private double weight;
    private double height;
//    @Column
//    private double bmi = weight/height;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private UserHealthDetails userHealthDetails;



}

