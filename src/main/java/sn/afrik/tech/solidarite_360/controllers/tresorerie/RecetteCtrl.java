/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-10-05 ( Date ISO 2024-10-05 - Time 15:16:59 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package sn.afrik.tech.solidarite_360.controllers.tresorerie;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import sn.afrik.tech.solidarite_360.entities.tresorerie.Recette;
import sn.afrik.tech.solidarite_360.services.impl.RecetteService;


/**
 * REST controller for managing {@link Recette}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/recette")
public class RecetteCtrl {

    private final Logger log = LoggerFactory.getLogger(RecetteCtrl.class);
	
    private final RecetteService entityService;

 	public RecetteCtrl (RecetteService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /recette} : Create a new recette.
     *
     * @param recette the recette to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new recette.
     */
	@PostMapping()
	public ResponseEntity<Recette> createRecette(@RequestBody @Valid Recette recette) {
         log.debug("REST request to save Recette : {}", recette);
         return new ResponseEntity<>(entityService.create(recette), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /recette} : Updates an existing recette.
     *
     * @param recette the recette to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated recette,
     * or with status {@code 400 (Bad Request)} if the recette is not valid,
     * or with status {@code 500 (Internal Server Error)} if the recette couldn't be updated.
     */
    @PutMapping()
    public ResponseEntity<Recette> updateRecette(@Valid @RequestBody Recette recette) {
        log.debug("REST request to update Recette : {}", recette);
        Recette result = entityService.update(recette);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /recette} : get all the recettes.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of recette in body.
     */

    @GetMapping()
    public ResponseEntity<List<Recette>> getAllRecette() {
	    log.debug("REST request to get all recettes");
        List<Recette> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /recette/:id} : get the "id" recette.
     *
     * @param id the id of the recette to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the recette, or with status {@code 404 (Not Found)}.
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<Recette> getOneRecette(@PathVariable("id") Long id) {
        log.debug("REST request to get Recette : {}", id);
        Recette e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /recette/:id} : delete the "id" recette.
     *
     * @param id the id of the recette to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecette(@PathVariable("id") Long id) {
        log.debug("REST request to delete Recette : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
