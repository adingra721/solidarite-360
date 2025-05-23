/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-10-05 ( Date ISO 2024-10-05 - Time 14:42:59 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package sn.afrik.tech.solidarite_360.services.tresorerie;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import sn.afrik.tech.solidarite_360.entities.tresorerie.Cotisation;

/**
 * Service Interface for managing {@link Cotisation}.
*  @author aek
 */
public interface ICotisationService  {
   
    /**
     * create new item for domain
     *
     * @param entity entity to save.
     * @return persisted entity Cotisation
     */
    Cotisation create(Cotisation d);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @param id of entity
     * @return Cotisation
     */
    Cotisation update(Cotisation d);

    /**
     * get Cotisation by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return Cotisation
     */
    Cotisation getOne(Long id) ;

    /**
     * Get all entities
     *
     * @return list of entities List<Cotisation>
     */
    List<Cotisation> getAll();

    /**
     * Count item in entity
     *
     * @return long 
     */
    long getTotal();

    /**
     * Delete record by id
     *  
     */
    void delete(Long id);

    /**
     * Find all with pagination
     *
     * @return Page<Cotisation>  
     */
    Page<Cotisation> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria 
     *
     * @return Page<Cotisation>  
     */
	Page<Cotisation> findAllSpecification(Specification<Cotisation> specs, Pageable pageable);

}
