package com.meow.catrealem.model;

import jakarta.persistence.*;

@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "friend_seq")
    @SequenceGenerator(name = "friend_seq", sequenceName = "friend_seq", allocationSize = 1)
    private Long id;
    private Integer catID;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    private CatUser catUser;
}
