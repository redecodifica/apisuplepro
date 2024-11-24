package proyecto.apiSuplepro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.apiSuplepro.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
