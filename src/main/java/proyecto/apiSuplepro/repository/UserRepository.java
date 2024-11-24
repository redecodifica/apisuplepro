package proyecto.apiSuplepro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.apiSuplepro.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}