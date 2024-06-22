package com.meow.catrealm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
    @SequenceGenerator(name = "post_seq", sequenceName = "post_seq", allocationSize = 1)
    private Long id;
    private String image;
    private String text;
    private Integer likes;
    @JoinColumn(name = "cat_id")
    @ManyToOne
    private CatUser catUser;
}
