package com.example.ibs.enteties.applicationforms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationForm {
    @Id
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type_id",nullable = false)
    private EquipmentType type;

    private String name;

    @Column(nullable = false)
    private int count;

    private Long date;

    @Column(length = 3000)
    private String justification;
}
