package com.meow.catrealem.model;

import com.meow.catrealem.enums.Gender;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class CatUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_user_seq")
    @SequenceGenerator(name = "cat_user_seq", sequenceName = "cat_user_seq", allocationSize = 1)
    private Long id;
    private String firstName;
    private String lastName;
    private String age;
    private String phoneNumber;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToMany(mappedBy = "catUser")
    private List<Post> posts;
    @OneToMany(mappedBy = "catUser")
    private List<Friend> friends;
}
