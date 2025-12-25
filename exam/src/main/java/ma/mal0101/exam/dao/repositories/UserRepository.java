package ma.mal0101.exam.dao.repositories;

import ma.mal0101.exam.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
