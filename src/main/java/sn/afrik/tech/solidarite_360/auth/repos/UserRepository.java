package sn.afrik.tech.solidarite_360.auth.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.afrik.tech.solidarite_360.auth.entities.User;

// This interface extends JpaRepository (Spring Data JPA) which provides CRUD operations for the entity class User. 
// It also provides a method to find a user by username.
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
	
	// Retourne un utilisateur s'il existe dans la BDD sinon retourne null.
	Optional<User> findByEmail(String email);
}
