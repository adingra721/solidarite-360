package sn.afrik.tech.solidarite_360.entities.doc;
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
import sn.afrik.tech.solidarite_360.entities.admin.Organisation;
//import sn.afrik.tech.solidarite_360.entities.admin.Organisation;
import sn.afrik.tech.solidarite_360.helper.type.ETypeDocument;

@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_document")
    private Long id;

    @Column(name = "titre_document", nullable = false)
    private String titreDocument;

    @Column(name = "fichier_document", nullable = false)
    private String fichierDocument; // Chemin ou URL du fichier

    @Enumerated(EnumType.STRING)
    @Column(name = "type_document", nullable = false)
    private ETypeDocument typeDocument; // PDF, Word, etc.

    @Column(name = "date_upload", nullable = false)
    private LocalDateTime dateUpload;

    @ManyToOne
    private Organisation organisation;

    @ManyToOne
    @JoinColumn(name = "id_membre_uploader", nullable = false)
    private Membre membreUploader;

   
}
