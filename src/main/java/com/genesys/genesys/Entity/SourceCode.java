package com.genesys.genesys.Entity;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class SourceCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_chiamante")
    private Chiamanti chiamante;

    @Column(columnDefinition = "TEXT")
    private String codiceSorgente;

    @Column(name  = "data_inizio_validità")
    private Date dataInizioValidita;

    @Column(name  = "data_fine_validità")
    private Date dataFineValidita;

    // costruttori, getter e setter
}