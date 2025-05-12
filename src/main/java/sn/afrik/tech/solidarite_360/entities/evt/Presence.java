package sn.afrik.tech.solidarite_360.entities.evt;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.afrik.tech.solidarite_360.entities.admin.Membre;
import sn.afrik.tech.solidarite_360.helper.statut.StatutPresence;


@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Presence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_presence")
    private Long id;

    @ManyToOne
    private Membre membre;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut_presence")
    private StatutPresence statutPresence; // Présent, Absent, Excusé

    @Column(name = "heure_arrivee")
    private LocalDateTime heureArrivee;

    @Column(name = "heure_depart")
    private LocalDateTime heureDepart;

   
}
