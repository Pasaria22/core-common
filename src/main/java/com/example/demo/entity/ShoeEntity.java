package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;


@Entity
@Table(name = "SHOE")
@Getter
@Setter
@NoArgsConstructor
public class ShoeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "SIZE", nullable = false)
    private int size;

    @Column(name = "COLOR", nullable = false)
    private int color;



}
