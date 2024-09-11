package practica.anul.repositories;

import practica.anul.models.TestUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestUserRepository extends JpaRepository<TestUsers, Long> {
    // Custom query methods (if needed) can be added here
}
