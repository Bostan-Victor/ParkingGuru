package practica.anul.repositories;

import org.springframework.data.jpa.repository.Query;
import practica.anul.models.TestUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestUserRepository extends JpaRepository<TestUsers, Long> {
    //@Query(value = "SELECT TestUsers from TestUsers INNER  JOIN ")
    //TestUsers findByUsername(String username);
}

