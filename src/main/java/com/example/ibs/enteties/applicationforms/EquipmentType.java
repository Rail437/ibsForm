package com.example.ibs.enteties.applicationforms;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentType {
    @Id
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long typeId;
    private String name;
    @OneToMany(mappedBy = "type", fetch = FetchType.LAZY)
    private List<EquipmentRequest> forms;
}
