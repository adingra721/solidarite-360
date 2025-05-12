package sn.afrik.tech.solidarite_360.entities;
import java.time.LocalDate;

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
import sn.afrik.tech.solidarite_360.entities.admin.Organisation;
import sn.afrik.tech.solidarite_360.entities.evt.Activite;
import sn.afrik.tech.solidarite_360.entities.evt.Evenement;
import sn.afrik.tech.solidarite_360.entities.evt.Reunion;
import sn.afrik.tech.solidarite_360.helper.statut.StatutTache;

@Entity
@Table(name = "tache")
public class Tache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tache")
    private Long id;

    @Column(name = "nom_tache", nullable = false)
    private String nomTache;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "date_echeance")
    private LocalDate dateEcheance;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut_tache")
    private StatutTache statutTache; // En cours, Terminé, En retard

    @ManyToOne
    @JoinColumn(name = "responsable_id", nullable = false)
    private Membre responsable;

    @ManyToOne
    private Organisation association;

    @ManyToOne
    private Evenement evenement;

    @ManyToOne
    private Activite activite;

    @ManyToOne
    private Reunion reunion;

   
}
