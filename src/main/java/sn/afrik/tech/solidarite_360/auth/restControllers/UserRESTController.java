package sn.afrik.tech.solidarite_360.auth.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.afrik.tech.solidarite_360.auth.entities.User;
import sn.afrik.tech.solidarite_360.auth.service.UserService;
import sn.afrik.tech.solidarite_360.auth.service.register.RegistrationRequest;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserRESTController {

  @Autowired
  UserService userService;

  @GetMapping("/all")
  public List<User> getAllUsers() {
    return userService.findAllUsers();
  }
  
  @PostMapping("/register")
  public User register(@RequestBody RegistrationRequest request) {
	  return userService.registerUser(request);
  }
  
  @GetMapping("/verifyEmail/{token}")
  public User verifyEmail(@PathVariable("token") String token) {
	return userService.validateToken(token);
  }

}
