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
import sn.afrik.tech.solidarite_360.helper.statut.StatutLecture;
import sn.afrik.tech.solidarite_360.helper.type.TypeNotification;

@Entity
@Table(name = "notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notification")
    private Long id;

    @Column(name = "message", columnDefinition = "TEXT", nullable = false)
    private String message;

    @Column(name = "date_envoi", nullable = false)
    private LocalDateTime dateEnvoi;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_notification", nullable = false)
    private TypeNotification typeNotification; // Rappel de réunion, Échéance cotisation, Activité, etc.

    @ManyToOne
    @JoinColumn(name = "id_membre", nullable = false)
    private Membre membre;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut_lecture", nullable = false)
    private StatutLecture statutLecture; // Lu, Non lu

}
