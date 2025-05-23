/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-10-05 ( Date ISO 2024-10-05 - Time 14:43:01 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package sn.afrik.tech.solidarite_360.services;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import sn.afrik.tech.solidarite_360.entities.Notification;

/**
 * Service Interface for managing {@link Notification}.
*  @author aek
 */
public interface INotificationService  {
   
    /**
     * create new item for domain
     *
     * @param entity entity to save.
     * @return persisted entity Notification
     */
    Notification create(Notification d);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @param id of entity
     * @return Notification
     */
    Notification update(Notification d);

    /**
     * get Notification by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return Notification
     */
    Notification getOne(Long id) ;

    /**
     * Get all entities
     *
     * @return list of entities List<Notification>
     */
    List<Notification> getAll();

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
     * @return Page<Notification>  
     */
    Page<Notification> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria 
     *
     * @return Page<Notification>  
     */
	Page<Notification> findAllSpecification(Specification<Notification> specs, Pageable pageable);

}
