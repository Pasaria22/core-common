package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "SHOE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public ShoeEntity(String name, int size, int color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }
}
