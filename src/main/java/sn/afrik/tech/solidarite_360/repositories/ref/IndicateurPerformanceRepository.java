/*
 * Java domain class for entity "IndicateurPerformance" 
 * Created on 2024-10-05 ( Date ISO 2024-10-05 - Time 14:03:29 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
package sn.afrik.tech.solidarite_360.repositories.ref;
import sn.afrik.tech.solidarite_360.entities.IndicateurPerformance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * <h2>IndicateurPerformanceRepository</h2>
 *
 * createdAt : 05-10-2024 - Time 14:03:29
 * 
 * @author aek
 */
@Repository
public interface IndicateurPerformanceRepository  extends JpaRepository<IndicateurPerformance, Long> , JpaSpecificationExecutor<IndicateurPerformance> {

}
