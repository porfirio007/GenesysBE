package com.mediacom.extensions.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Chiamanti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

}