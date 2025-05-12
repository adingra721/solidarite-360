package sn.afrik.tech.solidarite_360.entities.tresorerie;
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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.afrik.tech.solidarite_360.entities.admin.Membre;
import sn.afrik.tech.solidarite_360.entities.ref.Periode;
import sn.afrik.tech.solidarite_360.helper.statut.StatutCotisation;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cotisation")
public class Cotisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cotisation")
    private Long id;
    
    @Column(name = "libelle", nullable = false)
    private String libelle;
    
    
    @Column(name = "description", nullable = true)
	private String description;

    @Column(name = "montant", nullable = false)
    private Double montant;

    @Column(name = "date_cotisation", nullable = false)
    private LocalDate dateCotisation;
    
    @Enumerated(EnumType.STRING)
    @Column(name="periode")
    private Periode  periode ;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut")
    private StatutCotisation statut ;

    @ManyToOne
    @JoinColumn(name = "membre_id", nullable = false)
    private Membre membre;

   
}
