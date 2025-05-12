package sn.afrik.tech.solidarite_360.entities.tresorerie;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.afrik.tech.solidarite_360.entities.admin.Organisation;
import sn.afrik.tech.solidarite_360.helper.type.TypeRecette;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recette")
public class Recette {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recette")
    private Long id;

    @Column(name = "montant", nullable = false)
    private Double montant;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "date_recette", nullable = false)
    private LocalDate dateRecette;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_recette")
    private TypeRecette typeRecette;

    @ManyToOne
    private Organisation organisation;

   
}
