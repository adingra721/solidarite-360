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
import sn.afrik.tech.solidarite_360.entities.admin.Membre;
import sn.afrik.tech.solidarite_360.entities.evt.Activite;
import sn.afrik.tech.solidarite_360.entities.evt.Evenement;
import sn.afrik.tech.solidarite_360.entities.evt.Reunion;
import sn.afrik.tech.solidarite_360.entities.ref.TypeDocument;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompteRendu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Reunion reunion ;
    
    @ManyToOne
    private Activite activite ;
    
    @ManyToOne
    private Evenement evenement ;
   
    @ManyToOne
    private Membre auteur;
    
    private String contenu;
    
    @ManyToOne
    private TypeDocument typeDocument;
    
    private LocalDateTime dateCreation;
    
    private LocalDateTime dateModification;
}