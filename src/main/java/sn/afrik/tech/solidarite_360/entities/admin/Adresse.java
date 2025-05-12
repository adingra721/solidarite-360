package sn.afrik.tech.solidarite_360.entities.admin;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Adresse {

	private String numeroRue;
	private String nomRue;
	private String codePostal;
	private String ville;

}
