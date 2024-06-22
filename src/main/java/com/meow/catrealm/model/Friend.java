package com.meow.catrealm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Friend extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "friend_seq")
    @SequenceGenerator(name = "friend_seq", sequenceName = "friend_seq", allocationSize = 1)
    private Long id;
    private Integer friendId;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    private CatUser catUser;
}
