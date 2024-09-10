package practica.anul.services;

import practica.anul.models.TestUsers;
import practica.anul.repositories.TestUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestUserService {

    @Autowired
    private TestUserRepository userRepository;

    public TestUsers createUser(TestUsers user) {
        return userRepository.save(user);
    }

    public List<TestUsers> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<TestUsers> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<TestUsers> updateUser(Long id, TestUsers userDetails) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(userDetails.getName());
                    user.setEmail(userDetails.getEmail());
                    return userRepository.save(user);
                });
    }

    public boolean deleteUser(Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    userRepository.delete(user);
                    return true;
                }).orElse(false);
    }
}
