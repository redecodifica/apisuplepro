package proyecto.apiSuplepro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.apiSuplepro.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}