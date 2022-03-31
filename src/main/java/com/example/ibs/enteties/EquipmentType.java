package com.example.ibs.enteties;


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
    private long typeId;
    private String name;
    @OneToMany(mappedBy = "type", fetch = FetchType.LAZY)
    private List<ApplicationForm> forms;
}
