package practica.anul.repositories;

import org.springframework.web.servlet.ModelAndView;
import practica.anul.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    public User findUserByEmail(String email){
        return users.get(email);
    }
}
