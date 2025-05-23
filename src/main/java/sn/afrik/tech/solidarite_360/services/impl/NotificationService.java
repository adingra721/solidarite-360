/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-10-05 ( Date ISO 2024-10-05 - Time 14:43:01 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package sn.afrik.tech.solidarite_360.services.impl;


import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.afrik.tech.solidarite_360.entities.Notification;
import sn.afrik.tech.solidarite_360.repositories.NotificationRepository;
import sn.afrik.tech.solidarite_360.services.INotificationService;

/**
 * Service Implementation for managing {@link Notification}.
 * @author aek
 */
@Service
@Transactional
public class NotificationService implements INotificationService {


    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repo) {
         this.repository = repo;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Notification create(Notification d) {
        try {
            return repository.save(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Notification update(Notification d) {
        try {
            return repository.saveAndFlush(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Notification getOne(Long id) {
        try {
            return repository.findById(id).orElse(null);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Notification> getAll() {
        try {
            return repository.findAll();

        } catch (Exception ex) {
            return Collections.emptyList();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getTotal() {
        try {
            return repository.count();
        } catch (Exception ex) {
            return 0;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    /**
     * {@inheritDoc}
     */
   	@Override
	public Page<Notification> findAllPaginate(Pageable pageable) {

		return repository.findAll(pageable);
	}

    /**
     * {@inheritDoc}
     */
    @Override
	public Page<Notification> findAllSpecification(Specification<Notification> specs, Pageable pageable) {
		return repository.findAll(specs, pageable);
	}

}
