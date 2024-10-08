package practica.anul.repositories;

import practica.anul.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    boolean existsByEmail(String email);

    public Users findByEmail(String email);
}
