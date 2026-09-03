package com.spring_boot_api.luiz_laikovski.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "people")
public class PeopleEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 75)
    private String name;

    @Column(name = "address", nullable = false, length = 100)
    private String addRess;

    @Column(name = "gender", nullable = false, length = 6)
    private String gender;

    @Column(name = "birthday", nullable = false)
    private Date birthday;

}
