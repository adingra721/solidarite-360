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
import sn.afrik.tech.solidarite_360.entities.admin.Membre;
import sn.afrik.tech.solidarite_360.entities.evt.Reunion;
import sn.afrik.tech.solidarite_360.entities.tresorerie.Depense;
import sn.afrik.tech.solidarite_360.helper.statut.StatutValidation;
import sn.afrik.tech.solidarite_360.helper.type.TypeValidation;

@Entity
@Table(name = "validation")
public class Validation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_validation")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_validation", nullable = false)
    private TypeValidation typeValidation; // Approbation de dépense, Validation de réunion, etc.

    @Column(name = "date_validation", nullable = false)
    private LocalDateTime dateValidation;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut_validation", nullable = false)
    private StatutValidation statutValidation; // En attente, Validé, Rejeté

    @ManyToOne
    @JoinColumn(name = "id_membre_validateur", nullable = false)
    private Membre membreValidateur;

    @ManyToOne
    @JoinColumn(name = "id_depense", nullable = true)
    private Depense depense;

    @ManyToOne
    @JoinColumn(name = "id_reunion", nullable = true)
    private Reunion reunion;

   
}
