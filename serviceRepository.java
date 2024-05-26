package Repository;
import entity.servicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface serviceRepository  extends JpaRepository<servicesEntity, Long>{
    Optional<servicesEntity> findByName(String name);
}




