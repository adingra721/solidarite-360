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
import sn.afrik.tech.solidarite_360.entities.evt.Activite;
import sn.afrik.tech.solidarite_360.entities.evt.Evenement;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_feedback")
    private Long id;

    @Column(name = "commentaire", nullable = false)
    private String commentaire;

    @Column(name = "note", nullable = false)
    private Integer note; // Note sur 5

    @Column(name = "date_feedback", nullable = false)
    private LocalDateTime dateFeedback;

    @ManyToOne
    private Membre membre;

    @ManyToOne
    private Evenement evenement;

    @ManyToOne
    private Activite activite;

}
