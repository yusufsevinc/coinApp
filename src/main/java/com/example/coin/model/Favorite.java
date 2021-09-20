package com.example.coin.model;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
@Data
@Entity
@Table(name = "favoriteCoin")
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coin_id")
    private Long id;

    @ManyToMany(targetEntity = Users.class, cascade = {CascadeType.PERSIST})
    @JoinTable(name = "users_coins", joinColumns = { @JoinColumn(name = "coin_id" , updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "user_id" , updatable = false) })
    private List<Users> user;


    @Column(name="coin_name" , unique = true)
    private String coinName;

    public Favorite(String coinName) {
        this.coinName = coinName;
    }

    public Favorite() {
    }

    public Favorite(Long id, List<Users> user, String coinName) {
        this.id = id;
        this.user = user;
        this.coinName = coinName;
    }
}
