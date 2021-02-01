package com.reotra.demobatch.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rank")
    private String rank;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "center")
    private String center;

    @Column(name = "pv")
    private String pv;

    @Column(name = "origin")
    private String origin;

    @Column(name = "mention")
    private String mention;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "createdAt")
//    @ToString.Exclude
    private Date createdAt;
}
