package com.example.ibs.enteties.applicationforms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id",nullable = false)
    private EquipmentType type;

    private String name;

    @Column(nullable = false)
    private int count;

    private Long date;

    @Column(length = 3000)
    private String justification;

    private boolean approved;
}
