package sn.afrik.tech.solidarite_360.entities.evt;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.afrik.tech.solidarite_360.entities.admin.Adresse;
import sn.afrik.tech.solidarite_360.entities.admin.Membre;
import sn.afrik.tech.solidarite_360.entities.admin.Organisation;
//import sn.afrik.tech.solidarite_360.entities.admin.Organisation;
import sn.afrik.tech.solidarite_360.entities.doc.CompteRendu;
import sn.afrik.tech.solidarite_360.entities.doc.Media;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Evenement {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	private String reference;

    private String nom;
    
    private String description;
    
    @Column(name = "date_debut", nullable = false)
    private LocalDateTime dateDebut;

    @Column(name = "date_fin", nullable = false)
    private LocalDateTime dateFin;

    @Column(name = "lieu")
    private String lieu;
    
    @Embedded
    private Adresse adresse ;
    
    @ManyToOne
	private Organisation organisation;
    
    @OneToMany
    private List<Membre> participants; // Liste des membres participants
    
    @OneToMany
    private List<CompteRendu> comptesRendus; // Liste des comptes rendus associés
    
    @OneToMany
    private List<Media> medias;  
    
    
    @OneToMany
    private List<PresenceEvenement> presenceEvenements; 

}
