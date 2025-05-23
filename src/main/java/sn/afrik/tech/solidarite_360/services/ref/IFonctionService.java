/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-10-05 ( Date ISO 2024-10-05 - Time 14:43:01 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package sn.afrik.tech.solidarite_360.services.ref;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import sn.afrik.tech.solidarite_360.entities.ref.Fonction;

/**
 * Service Interface for managing {@link Fonction}.
*  @author aek
 */
public interface IFonctionService  {
   
    /**
     * create new item for domain
     *
     * @param entity entity to save.
     * @return persisted entity Fonction
     */
    Fonction create(Fonction d);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @param id of entity
     * @return Fonction
     */
    Fonction update(Fonction d);

    /**
     * get Fonction by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return Fonction
     */
    Fonction getOne(Long id) ;

    /**
     * Get all entities
     *
     * @return list of entities List<Fonction>
     */
    List<Fonction> getAll();

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
     * @return Page<Fonction>  
     */
    Page<Fonction> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria 
     *
     * @return Page<Fonction>  
     */
	Page<Fonction> findAllSpecification(Specification<Fonction> specs, Pageable pageable);

}
