package sn.afrik.tech.solidarite_360.entities.doc;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.afrik.tech.solidarite_360.entities.evt.Activite;
import sn.afrik.tech.solidarite_360.entities.evt.Evenement;
import sn.afrik.tech.solidarite_360.entities.evt.Reunion;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Media {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    private String type; // Type de média: "Photo", "Video", "Audio"
    
    private String titre;
    
    private String description;
    
    @ManyToOne
    private Reunion reunion;
    
    @ManyToOne
    private Activite activite;
    
    @ManyToOne
    private Evenement evenement ;
    
    
    private String cheminFichier; // Chemin ou URL du fichier
    
    private LocalDateTime datePrise;
    
    private LocalDateTime dateCreation;
    
 
    
}
