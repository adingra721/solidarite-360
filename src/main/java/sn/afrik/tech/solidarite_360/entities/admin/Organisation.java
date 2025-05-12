package sn.afrik.tech.solidarite_360.entities.admin;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.afrik.tech.solidarite_360.helper.statut.StatutOrganisation;
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Organisation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_organisation")
	private Long id;

	@Column(name = "nom_association", nullable = false)
	private String nom;

	@Column(name = "date_creation")
	private LocalDate dateCreation;

	@Embedded
	private Adresse adresse;

	@Enumerated(EnumType.STRING)
	@Column(name = "statut")
	private StatutOrganisation statut;

	@Column(name = "description", columnDefinition = "TEXT")
	private String description;

}
