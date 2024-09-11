package practica.anul.controllers;

import practica.anul.models.TestUsers;
import practica.anul.services.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class TestUserController {

    @Autowired
    private TestUserService userService;

    // Create a new user
    @PostMapping
    public ResponseEntity<TestUsers> createUser(@RequestBody TestUsers user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    // Get all users
    @GetMapping
    public ResponseEntity<List<TestUsers>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // Get a user by ID
    @GetMapping("/{id}")
    public ResponseEntity<TestUsers> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(user -> ResponseEntity.ok().body(user))
                .orElse(ResponseEntity.notFound().build());
    }

    // Update a user
    @PutMapping("/{id}")
    public ResponseEntity<TestUsers> updateUser(@PathVariable Long id, @RequestBody TestUsers userDetails) {
        return userService.updateUser(id, userDetails)
                .map(updatedUser -> ResponseEntity.ok().body(updatedUser))
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete a user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        if (userService.deleteUser(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
