package com.drug.druglist.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;


@Entity
@Data
@Builder
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Drug {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID id;
    private String drugName;
    private String brandName;
    private Date dateCreated;
    private boolean status;
}
