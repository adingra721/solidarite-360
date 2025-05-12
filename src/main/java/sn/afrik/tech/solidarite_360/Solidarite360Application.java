package sn.afrik.tech.solidarite_360;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import sn.afrik.tech.solidarite_360.auth.entities.Role;
import sn.afrik.tech.solidarite_360.auth.entities.User;
import sn.afrik.tech.solidarite_360.auth.service.UserService;

@SpringBootApplication
public class Solidarite360Application {

	public static void main(String[] args) {
		SpringApplication.run(Solidarite360Application.class, args);
	}
	@Autowired
	UserService userService;

	// Crée les utilisateurs et les rôles au démarrage de l'application
	// @PostConstruct veut dire que init_users s'exécute après le constructeur de cette classe
	
	
	
	/* @PostConstruct void init_users() { // ajouter les rôles
	 userService.addRole(new Role(null, "ADMIN")); 
	 userService.addRole(new Role(null, "USER")); // ajouter les users 
	 userService.saveUser(new User(null,"admin", "123", true, null, null));
	  userService.saveUser(new User(null,"charles", "123", true, null, null));
	  userService.saveUser(new User(null,"henri", "123", true, null, null)); // ajouter les rôles aux users
	  userService.addRoleToUser("admin", "ADMIN");
	  userService.addRoleToUser("admin", "USER");
	  userService.addRoleToUser("charles", "USER");
	  userService.addRoleToUser("henri", "USER"); }*/
	 
	
}
