package com.meow.catrealem.model;

import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
    @SequenceGenerator(name = "post_seq", sequenceName = "post_seq", allocationSize = 1)
    private Long id;
    private String image;
    private String text;
    private Integer likes;

    @ManyToOne
    private CatUser catUser;
}
