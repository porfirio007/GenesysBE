package com.mediacom.extensions.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class AllowedSites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_chiamante")
    private Chiamanti chiamante;

    @Column(name = "dominio")
    private String dominio;

    @Column(name  = "data_inizio_validità")
    private Date dataInizioValidita;

    @Column(name  = "data_fine_validità")
    private Date dataFineValidita;
}
