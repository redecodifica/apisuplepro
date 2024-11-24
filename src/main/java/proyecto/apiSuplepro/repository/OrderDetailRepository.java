package proyecto.apiSuplepro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.apiSuplepro.model.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

}