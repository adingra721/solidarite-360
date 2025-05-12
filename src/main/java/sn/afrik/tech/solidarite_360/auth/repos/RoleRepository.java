package sn.afrik.tech.solidarite_360.auth.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.afrik.tech.solidarite_360.auth.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}
