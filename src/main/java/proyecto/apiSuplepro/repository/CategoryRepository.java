package proyecto.apiSuplepro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.apiSuplepro.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}