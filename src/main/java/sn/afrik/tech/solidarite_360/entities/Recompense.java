package sn.afrik.tech.solidarite_360.entities;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import sn.afrik.tech.solidarite_360.entities.admin.Membre;
import sn.afrik.tech.solidarite_360.entities.evt.Evenement;

@Entity
@Table(name = "recompense")
public class Recompense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recompense")
    private Long id;

    @Column(name = "nom_recompense", nullable = false)
    private String nomRecompense;

    @Column(name = "date_attribution", nullable = false)
    private LocalDateTime dateAttribution;

    @Column(name = "description")
    private String description;

    @ManyToOne
    private Membre membre;

    @ManyToOne
    private Evenement evenement;
}