package sn.afrik.tech.solidarite_360.entities.admin;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.afrik.tech.solidarite_360.entities.ref.Fonction;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Membre {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	private String nom;

	private String prenom;
	
	private String email;
	
	private String telephone;
	
	private LocalDate dateNaissance;

	private LocalDate dateInscription;
	
	private LocalDate dateAdhesion ;
    
    private String statut;

	@ManyToOne
	private Fonction fonction;
	
	@ManyToOne
	private Organisation organisation;

	@Embedded
	private Adresse adresse;

}
