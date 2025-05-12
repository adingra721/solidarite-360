package sn.afrik.tech.solidarite_360.entities;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import sn.afrik.tech.solidarite_360.entities.admin.Organisation;
import sn.afrik.tech.solidarite_360.helper.type.TypeIndicateur;

@Entity
@Table(name = "indicateur_performance")
public class IndicateurPerformance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_indicateur")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_indicateur", nullable = false)
    private TypeIndicateur typeIndicateur; 

    @Column(name = "valeur_indicateur", nullable = false)
    private Double valeurIndicateur;

    @Column(name = "date_calcul", nullable = false)
    private LocalDateTime dateCalcul;

    @ManyToOne
    @JoinColumn(name = "organisation_id", nullable = false)
    private Organisation organisation;

}
