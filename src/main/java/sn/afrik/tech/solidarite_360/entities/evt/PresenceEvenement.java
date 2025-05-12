package sn.afrik.tech.solidarite_360.entities.evt;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "presence_evenement")
public class PresenceEvenement extends Presence {

    @ManyToOne
    @JoinColumn(name = "id_evenement", nullable = false)
    private Evenement evenement;

}
